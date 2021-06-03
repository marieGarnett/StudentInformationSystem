
package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MyConnectionJavaCodeSnippet {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433; databaseName=myJavaCodeDatabase; username=sa; password=marieo17");
            System.out.println("Database Connected!");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
