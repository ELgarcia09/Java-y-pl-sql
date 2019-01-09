
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DATABASECONEXION {
    public static Connection getConnection () throws SQLException {
        //codigo de conexion con la base de datos oracle
        try{ 
        
           Class.forName("oracle.jdbc.driver.OracleDriver"); 
           String myDB= "jdbc:oracle:thin:@www.ivguana.com:1521:orcl12" ; 
           String usuario= "emanuel" ; 
           String password= "emanuel" ; 

           
          Connection cnx= DriverManager.getConnection(myDB,usuario,password) ; 
          
          return cnx ;
       
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch (ClassNotFoundException ex) {
       
                    Logger.getLogger(DATABASECONEXION.class.getName()).log(Level.SEVERE, null, ex);
                    }
     
             return null ; 
    }
    
} 
    
   

    
    

