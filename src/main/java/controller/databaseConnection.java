package controller;

import java.sql.*;

public class databaseConnection {

    public static Connection DBConnection (){

        Connection c = null;
        String reg, url, user, pass, sql;

        reg = "oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@localhost:1521:orcl";
        user = "graduationGuidelineBD";
        pass = "Oracle_1";

        try{

            Class.forName(reg);
            c = DriverManager.getConnection(url, user, pass);


        }
        catch (Exception e){
            e.printStackTrace();
        }
        return c;

    }
}
