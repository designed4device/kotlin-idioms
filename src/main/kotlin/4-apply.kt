import org.apache.commons.dbcp.BasicDataSource
//TODO add all standard function
val dataSource = BasicDataSource().apply {
    driverClassName = "com.mysql.jdbc.Driver"
    url = "jdbc:mysql://domain:3309/db"
    username = "username"
    password = "password"
    maxActive = 40
    maxIdle = 40
    minIdle = 4
}