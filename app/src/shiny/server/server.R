if (!require(shiny)) install.packages("shiny")
library(shiny)

server = function(input, output) {
    
    filedata = reactive({
        
        infile = input$file
        if (is.null(infile)){return(NULL)}
        
        data = read.csv(infile$datapath,stringsAsFactors = FALSE)
        
        print(length(data[12,]))
        
        if (isTRUE(data[1,2])){return (data)}
        
        else {
            data = read.csv(infile$datapath,stringsAsFactors = FALSE,skip = 10) 
            return (data)
        }
        
    })
    
    observeEvent(input$calculate,{
        input$date
        input$startTime
        input$endTime
        input$select_column
        input$frequency_rate
        input$paa_rate
    })
    
    subsetData = eventReactive(input$calculate,{
        
        start = which(filedata()[,2] == input$startTime)
        end = which(filedata()[,2] == input$endTime)
        
        filedata()[start:end,]
        
    })
    
    scale = eventReactive(input$calculate,{
        
        if(input$fullTime) {
            
            return(scale_decompose(filedata(),
                                   as.integer(input$select_column),
                                   as.integer(input$frequency_rate)))
        }
        
        else {
            
            return(scale_decompose(subsetData(),
                                   as.integer(input$select_column),
                                   as.integer(input$frequency_rate)))
        }
    })
    
    scale2 = eventReactive(input$calculate,{
        
        if(input$fullTime) {return(filedata())}
        else { return(subsetData()) }
    })
    
    
    output$dataCheck = renderTable({head(filedata(),10)})
    
    output$decomposedOut = renderPlot({
        plot(scale()$decomposed_data)
    })
    
    sax = eventReactive(input$calculate,{
        sax_process(scale())
    })
    output$walkingPattern = renderPlot({
        plot(patternScale(scale2(),
                          as.integer(input$select_column),
                          input$paa_rate),
             
             type = 'l',
             col='blue',
             main = "PAA")
        
        points(patternScale(scale2(),
                            as.integer(input$select_column),
                            input$paa_rate),
               pch=16,lwd=5,col='blue')
    })
    
    
    
    
    output$reclustering = renderPlot({
        plot(scale()$reclustering)
    })
    
    
    output$pieChart = renderPlot({
        
        pie(summary(as.factor(scale()$reclustering_rawdata)),
            main = ("rate of wlk / nwk"))
        
    })
    
    output$checkTime2 = renderPlot({
        
        tmp = sax_process(scale())
        qplot(unique(as.vector(tmp)))
    })
    
    
    
    
    
    output$sum_grp_data  = renderPlot({
        
        xlim = c(0,1.1*max(c(mean(sum_ctrl_grp_data),mean(sum_expr_grp_data))))
        barplot(c(mean(sum_ctrl_grp_data),mean(sum_expr_grp_data)),
                main=("test"),
                names=c(mean(sum_ctrl_grp_data),mean(sum_expr_grp_data)),
                col=c("orange","blue"),
                horiz = TRUE,
                xlim = xlim,
                legend=c("ctrl_grp","expr_grp"),
                width = 0.1)
    })
    
    output$cnt_grp_data  = renderPlot({
        
        xlim = c(0,1.5*max(c(mean(cnt_ctrl_grp_length),mean(cnt_expr_grp_length))))
        barplot(c(mean(cnt_ctrl_grp_length),mean(cnt_expr_grp_length)),
                main=("test"),
                names=c(mean(cnt_ctrl_grp_length),mean(cnt_expr_grp_length)),
                col=c("orange","blue"),
                horiz = TRUE,
                xlim = xlim,
                legend=c("ctrl_grp","expr_grp"),
                width = 0.1)
    })
}