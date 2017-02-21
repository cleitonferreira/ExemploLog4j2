package br.com.nuvemapp.exemplolog4j2;

import javax.sql.DataSource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class DataSourceFactory {
    public static DataSource create() {
        final MysqlDataSource ds = new MysqlDataSource();
        ds.setUrl("jdbc:mysql://localhost/log4j");
        ds.setUser("root");
        ds.setPassword("root");
        return ds;
    }
}

