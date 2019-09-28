package com.clases;
import java.sql.*;
public class Sentencias{
	//Declaramos las variables globales
	private static Connection conn;
	private static Statement stmt;
	private static Conexion conex;
	private static ResultSet resultSet;
	//Inicializamos los valores
	public Sentencias(){
		try{
		conex = new Conexion();
		conn = conex.establecerConexion();
		stmt = conn.createStatement();
		}catch(Exception ex){
			ex.printStackTrace();
		}

	}
	public int insertado(String sql){	
		try{
			int rs = stmt.executeUpdate(sql);
			return rs;
		}catch(Exception ex){
			ex.printStackTrace();
			return -1;
		}
	}
	public int modificacion(String sql){
		try{
			int rs = stmt.executeUpdate(sql);
			return rs;
		}catch(Exception ex){
			ex.printStackTrace();
			return -1;
		}
	}
	public ResultSet registros(String sql){
		try{
			resultSet =	stmt.executeQuery(sql);
			return resultSet; 
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}	
	}
	public int eliminar(String sql){
		try{
			int rs = stmt.executeUpdate(sql);
			return rs;
		}catch(Exception ex){
			ex.printStackTrace();
			return -1;
		}
	}
}