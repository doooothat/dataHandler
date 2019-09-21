# source("/home/imcloud/dev/works/seungtae/rscript/orthopedic_surgery/shiny_server/data_scale.R")
# source("/home/imcloud/dev/works/seungtae/rscript/orthopedic_surgery/tmpDataProcess.R")


library(shiny)
library(dplyr)
library(ggplot2)

path = getwd()
pathShiny = "/app/src/shiny"

source(paste0(path,pathShiny,"/server/server.R"))
source(paste0(path,pathShiny,"/ui/ui.R"))

shinyApp(ui = ui, server = server)
