package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;


public class Conexion {
    //variable en la que almacenamos el nombre de la base de datos a la que queremos conectarnos 
    String bd="test";
    //variable con la url a nuestra base de datos local
    String url="jdbc:mysql://localhost:3306/";
    //variables con el nombre y la contraseña con el que queremos conectarnoss en este caso "root"
    String user="root";
    String password="";
    //En la variable driver guardamos la clase de la libreria importada (MySQL-Connection) que nos permite la conexion con la base de datos
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion(String bd) {
      this.bd = bd;
    }

    
    public Connection conectar(){
   try{
       //En este try nos conectamos a la base de datos dada en las variables con el usuario tambien dado y mandamos un mensaje por pantalla
   Class.forName(driver);
   cx=DriverManager.getConnection(url+bd,user,password);
     System.out.println(" Se conecto a la base de datos "+ bd);
       //catch de que si no se conecto mande un mensaje por pantalla de que no se conecto
   }catch(ClassNotFoundException | SQLException ex){
       System.out.println("No se conecto");
   //Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
   }
   return  cx;
    }
    
    public void desconectar(){
      try{
        cx.close();
      }catch (SQLException ex){
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null,ex);
      }

    }
    public static void main(String[] args){
      Conexion conexion = new Conexion("test");
      conexion.conectar();
    }

}
