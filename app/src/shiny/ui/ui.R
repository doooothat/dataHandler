if(!require(shiny)) install.packages("shiny")
library(shiny)

ui = fluidPage(
    
    titlePanel("data Handler"),
    
    br(),
    
    sidebarLayout(
        
        sidebarPanel(
            
            width = 3,
            
            fileInput('file',
                      'Choose CSV File',
                      accept=c('text/csv', 'text/comma-separated-values,text/plain','.csv'),
                      placeholder = "No file"),
            
            # hr(),

            selectInput("db_select",
                        label = h4("select database"),
                        choices = list("oracle"="orclConnect",
                                       "mariaDB"="mariaConnect",
                                       "impala"="impalaConnect")),
            # hr(),
            # fluidRow(column(3, verbatimTextOutput("value"))),
            
            textInput('ip',
                      'ip',
                      placeholder = "192.168.0.6"),
            
            textInput('port',
                      'port',
                      placeholder = "3306"),
            
            textInput('DB name',
                      'db',
                      placeholder = "test"),
            
            textInput('user',
                      'user',
                      placeholder = "user"),

            passwordInput('passwd',
                          'passwd'
                          ),

            actionButton('connect_database', 'connect'),

            # checkboxInput('fullTime',
            #               'fullTime',
            #               FALSE),
            
            hr(),
            # numericInput('frequency_rate',
            #              'frequency_rate',
            #              10),
            
            # numericInput('select_column',
            #              'select_column',
            #              5,
            #              min = 1,
            #              max = 5,
            #              step = 1),
            
            # numericInput('paa_rate',
            #              'paa_rate',
            #              100),
            # 
            
            actionButton('calculate', 'calculate'),

            br()
        ),
        
        mainPanel(
            
            tabsetPanel(
                
                type = "tabs",
                
                tabPanel("Data summary",
                         br(),
                         tableOutput('Data summary')),
                
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
