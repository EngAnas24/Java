/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlconnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class SqlConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Class.forName("com.microsoft.sqlserver.jdbc.SqlServerDriver");
        String dbur1 = "jdbc:sqlserver://DESKTOP-NJLRNMK;databaseName=SuperMarket;integratedSecurity=true";
        Connection cnc = DriverManager.getConnection(dbur1);
        Statement stat  = cnc.createStatement;
        String query = "Select * from Customer";
            ResultSet re = state.excuteQuery(query);
        
        While(re.next()){
        System.out.println(re.getString(0)+re.getString(1)+re.getString(2));
    }
    }
        catch(ClassNotFoundException ex){
         Logger.getLogger(SqlConnection.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
}
