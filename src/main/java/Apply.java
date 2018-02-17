import org.apache.commons.dbcp.BasicDataSource;

public class Apply {

    void foo() {

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://domain:3309/db");
        dataSource.setUsername("username");
        dataSource.setPassword("password");
        dataSource.setMaxActive(40);
        dataSource.setMaxIdle(40);
        dataSource.setMinIdle(4);
    }
}
