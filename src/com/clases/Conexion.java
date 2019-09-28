package com.clases;
//Importamos los paquetes necesarios
import java.sql.*;
//Creamos la clase de conexion
public class Conexion{
	//Aqui declaramos las variables globales que utilizaremos en nuestro software
	private String host;
	private String usuario;
	private String password;
	private String database;
	//Aqui definimos el constructor vacio de por defecto
	public Conexion(){
		this.host = "localhost";
		this.database = "Expotecnica";
		this.usuario = "root";
		this.password = "";
	}
	//Aqui definimos los setters y getters
	public void setHost(String host){
		this.host = host;
	}
	public void setUsuario(String usuario){
		this.usuario = usuario;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setDatabase(String database){
		this.database = database;
	}
	public String setHost(){
		return this.host;
	}
	public String setUsuario(){
		return this.usuario;
	}
	public String setPassword(){
		return this.password;
	}
	public String setDatabase(){
		return this.database;
	}
	//Aui establecemos la conexion
	public Connection establecerConexion(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://"+this.host+"/"+this.database,this.usuario,this.password);
			return conn;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}

	}
}