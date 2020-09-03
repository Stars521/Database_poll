package com.example.dbcp.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @program: database_poll
 * @description: 使用JDBC获取数据库连接
 * @author: lxl
 * @create: 2020-09-02 16:45
 */
public class DBConn {
    private static Connection conn = null;

    //获取一个数据库连接
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            String dbUrl = "jdbc:mysql://127.0.0.1:3306/mydb";
            conn = DriverManager.getConnection(dbUrl, "sa", "123456");
//            System.out.println("========数据库连接成功========");
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("========数据库连接失败========");
            return null;
        }
        return conn;
    }
}
