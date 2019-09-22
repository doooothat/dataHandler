library(shiny)
library(dplyr)
library(ggplot2)

path = getwd()
pathShiny = "/src/shiny"
pathUtil = "/src/util"

source(paste0(path,pathShiny,"/server/server.R"))
source(paste0(path,pathShiny,"/ui/ui.R"))
source(paste0(path,pathUtil,"/dbUtils.R"))

shinyApp(ui = ui, server = server)