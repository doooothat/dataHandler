if (!require(shiny)) install.packages("shiny")
library(shiny)

path = getwd()
shiny_path = paste0(path, "/app/bin/")

# source(paste0(shiny_path,'ui.R'))
source("ui.R")


server = function(input, output) {
    
    filedata = reactive({
        infile = input$file
        if (is.null(infile)) {
            return(NULL)
        }
        data = read.csv(infile$datapath, stringsAsFactors = FALSE)
    })
}

shinyApp(ui = ui, server = server)

