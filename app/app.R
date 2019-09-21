library(shiny)
library(dplyr)
library(ggplot2)

path = getwd()
pathShiny = "/src/shiny"

source(paste0(path,pathShiny,"/server/server.R"))
source(paste0(path,pathShiny,"/ui/ui.R"))

shinyApp(ui = ui, server = server)
