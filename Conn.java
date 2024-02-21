package bank.management.system;

import java.sql.*;

public class Conn {
Connection c;
Statement s;
   public Conn(){ 
    try{//register driver
//            Class.forName(com.mysql.cj.jdbc.Drvier);
            

            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem" , "root" , "YFSRGKMY");
            s = c.createStatement();
    
    
    }

        catch(Exception e){
                System.out.println(e);
        }
   } 
} 
