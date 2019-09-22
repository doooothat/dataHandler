# Set JAVA_HOME, set max. memory, and load rJava library
#Sys.setenv(JAVA_HOME='/path/to/java_home')
#options(java.parameters="-Xmx2g")

# gc(TRUE)
# gcinfo(TRUE)

library(rJava)
library(RJDBC)
library(DBI)

#memory.limit(size=10000000000024)
#options(java.parameters = "-Xmx8048m")
# options(java.parameters = "-Xmx64g")



orclConnect = function(ip,db,port,user,passwd){
    
    path = getwd()
    
    .jinit()
    print(.jcall("java/lang/System", "S", "getProperty", "java.version"))
    
    
    jdbcPath = paste0(path,"/app/bin/util/oracleJDBC/ojdbc8.jar")
    jdbcDriver = JDBC(driverClass="oracle.jdbc.OracleDriver",
                      classPath=jdbcPath)
    
    connectionValue = paste0("jdbc:oracle:thin:@//",
                             ip,
                             ":1521",
                             "/",
                             db)
    
    jdbcConnection = dbConnect(jdbcDriver,
                               connectionValue,
                               user,
                               passwd)
    
    return(jdbcConnection)
}

# tmp = orclConnect("192.168.0.10","set001","wd","wd")

mariaConnect = function(ip,db,port,user,passwd){
    
    path = getwd()
    
    .jinit()
    print(.jcall("java/lang/System", "S", "getProperty", "java.version"))
    
    
    jdbcPath = paste0(path,"/app/bin/util/mariadbJDBC/mariadb-java-client-1.5.5.jar")
    jdbcDriver = JDBC(driverClass="org.mariadb.jdbc.Driver",
                      classPath=jdbcPath)
    
    connectionValue = paste0("jdbc:mariadb://",
                             ip,
                             ":3306",
                             "/",
                             db)
    
    jdbcConnection = dbConnect(jdbcDriver,
                               connectionValue,
                               user,
                               passwd)
    
    
    return(jdbcConnection)
}

# tmp = mariaConnect("192.168.0.6","set001","wd","wd")

impalaConnect = function(ip,db,port){
    
    path = getwd()
    
    .jinit()
    print(.jcall("java/lang/System", "S", "getProperty", "java.version"))
    
    
    jdbcPath = paste0(path,"/app/bin/util/impalaJDBC/ImpalaJDBC41.jar")
    jdbcDriver = JDBC(driverClass="com.cloudera.impala.jdbc41.Driver",
                      classPath=jdbcPath)
    
    connectionValue = paste0("jdbc:impala://",
                             ip,
                             ":21050",
                             "/",
                             db)
    
    jdbcConnection = dbConnect(jdbcDriver,
                               connectionValue)
    
    return(jdbcConnection)
    
}

# dbGetQuery(tmp,"select * from test001")

# print(instanceName)
# dbDisconnect(tmp)
