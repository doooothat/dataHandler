if(!require(shiny)) install.packages("shiny")
library(shiny)

ui = fluidPage(
    titlePanel("data Handler for Server ecosystem"),
    br(),
    sidebarLayout(
        sidebarPanel(
            
            width = 3,
            fileInput('file',
                      "Choose CSV file",
                      accept=c('text/csv', 'text/comma-separated-values,text/plain','.csv'),
                      placeholder = "NoFile"
                      ),
            
            hr(),
            textInput('inputValue01',
                      'Input01',
                      placeholder = "insert DB address"),
            textInput('inputValue02',
                      'Input02',
                      placeholder = "inert DB port"),
            actionButton('connect',"DB Connect"),
            br()
        ),
        mainPanel(
            
            tabsetPanel(
                
                type="tabs",
                tabPanel("Data Summary",
                         br(),
                         tableOutput('dataCheck')),
                
                tabPanel("data PreProcessing",
                         br()
                         ),
                
                tabPanel("data Processing",
                         br()
                         ),
                tabPanel("data Visualization",
                         br()
                         )
            )
        )
    )
)