
package conexionSQL;

import clasesprincipales.Clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ClienteDB {
   //CODIGO PARA EL LISTADO EN LA BASE DE DATOS /// 
    
    
    public ArrayList<Clientes> ListClientes() {
       
    ArrayList<Clientes> Cliente= new ArrayList() ; 
    
    
    
       try {
           Connection cnx= DATABASECONEXION.getConnection();
           Statement st= cnx.createStatement(); 
           ResultSet rs= st.executeQuery(" select id_clientess,nombre_cliente,dni_cliente " + "from clientess") ; 
           
           while(rs.next()){
           Clientes cl= new Clientes() ; 
           cl.setId_clientes(rs.getInt("id_clientess"));
           cl.setNombreCliente(rs.getNString("nombre_cliente"));
           cl.setDniCliente(rs.getString("dni_cliente")) ;
           Cliente.add(cl) ; 
                      
           
           }
           
       } catch(SQLException ex){
       
       System.out.println(ex.getMessage());
       System.out.println("Error en el listado");
       
       }
     return Cliente ; 
    
    
    }
 
       
       
       
       
   
   
    
    
    
    
    
    
    
    
    
    
    public void insertarClientes(Clientes cliente) {
    
        
        try{
        Connection cnx= DATABASECONEXION.getConnection(); 
            PreparedStatement pst= cnx.prepareStatement("INSERT INTO CLIENTESS(id_clientess,nombre_cliente,dni_cliente)"+"values(?,?,?)") ; 
            
            pst.setInt(1,cliente.getId_clientes());
            pst.setString(2,cliente.getNombreCliente());
            pst.setString(3, cliente.getDniCliente());
            pst.executeUpdate(); 
        
        
        
        
        } catch(SQLException ex){
        
        System.out.println(ex.getMessage());
        System.out.println("ERORR DE INSERT");
        }
      
  
    
    
    }
 


public void actualizarclientes(Clientes cliente){
    
     try{
        Connection cnx= DATABASECONEXION.getConnection(); 
            PreparedStatement pst= cnx.prepareStatement("UPDATE INTO CLIENTESS(id_clientess,nombre_cliente,dni_cliente)"+"values(?,?,?)") ; 
            
            pst.setInt(1,cliente.getId_clientes());
            pst.setString(2,cliente.getNombreCliente());
            pst.setString(3, cliente.getDniCliente());
            pst.executeUpdate(); 
        
        
        
        
        } catch(SQLException ex){
        
        System.out.println(ex.getMessage());
        System.out.println("ERORR DE UPDATE");
        }
    
}

    public void setValueAt(String text, int fila, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}













