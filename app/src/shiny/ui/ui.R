if(!require(shiny)) install.packages("shiny")
library(shiny)

ui = fluidPage(
    
    titlePanel("test"),
    
    br(),
    
    sidebarLayout(
        
        sidebarPanel(
            
            width = 3,
            
            fileInput('file',
                      'Choose CSV File',
                      accept=c('text/csv', 'text/comma-separated-values,text/plain','.csv'),
                      placeholder = "No file"),
            
            hr(),
            textInput('startTime',
                      ' startTime',
                      placeholder = "ex) 15:00:00"),
            
            textInput('endTime',
                      'endTime',
                      placeholder = "ex) 16:00:00"),
            
            checkboxInput('fullTime',
                          'fullTime',
                          FALSE),
            
            hr(),
            numericInput('frequency_rate',
                         'frequency_rate',
                         10),
            
            numericInput('select_column',
                         'select_column',
                         5,
                         min = 1,
                         max = 5,
                         step = 1),
            
            numericInput('paa_rate',
                         'paa_rate',
                         100),
            
            
            actionButton('calculate', 'calculate'),
            
            br()
        ),
        
        mainPanel(
            
            tabsetPanel(
                
                type = "tabs",
                
                tabPanel("Data Check",
                         br(),
                         tableOutput('dataCheck')),
                
                tabPanel("Decomposed Time Series Data",
                         br(),
                         plotOutput('decomposedOut')),
                
                tabPanel("Detected Walking Pattern",
                         br(),
                         plotOutput('walkingPattern')),
                
                
                tabPanel("Re -Clustering Data",
                         br(),
                         plotOutput("reclustering")),
                
                tabPanel("Result",
                         br(),
                         textOutput('result'),
                         plotOutput('pieChart'),
                         plotOutput('checkTime2'),
                         plotOutput('sum_grp_data'),
                         plotOutput('cnt_grp_data'))
            )
        )
    )
)
