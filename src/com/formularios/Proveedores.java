package com.formularios;
//Aqui importamos las librerias necesarias para el funcionamiento
import javax.swing.*;
import java.sql.*;

public class Proveedores extends JInternalFrame{
    JTextField txtNombreProveedor,txtDireccionProveedor,txtTelefonoProveedor;
    JLabel jlNombreProveedor,jlDireccionProveedor,jlTelefonoProveedor;
    JButton btnNuevo,btnGuardar,btnModificar,btnEliminar;
    public Proveedores(){
        super("Proveedores",true,true,true,true);
        inicializarComponentes();
    }
    public void inicializarComponentes(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        //Aqui creamos las etiquetas que contendran los textos indicativos en toda la pantall
        jlNombreProveedor = new JLabel("Nombre");
        jlDireccionProveedor = new JLabel("Direccion");
        jlTelefonoProveedor = new JLabel("Telefono");
        
        jlNombreProveedor.setBounds(50,50,80,30);
        panel.add(jlNombreProveedor);
        jlDireccionProveedor.setBounds(50,130,80,30);
        panel.add(jlDireccionProveedor);
        jlTelefonoProveedor.setBounds(50,210,80,30);
        panel.add(jlTelefonoProveedor);
        //Aqui creamos los cuadros de texto que utilizaremos en toda la pantalla    
        txtNombreProveedor = new JTextField();
        txtDireccionProveedor = new JTextField();
        txtTelefonoProveedor = new JTextField();
        
        txtNombreProveedor.setBounds(150,50,150,30);
        panel.add(txtNombreProveedor);
        txtDireccionProveedor.setBounds(150,130,150,30);
        panel.add(txtDireccionProveedor);
        txtTelefonoProveedor.setBounds(150,210,150,30);
        panel.add(txtTelefonoProveedor);

        //Aqui creamos los botones necesarios para el buen funcionamiento

        //Aqui definimos los datos necesarios para que muestre la pantalla
        getContentPane().add(panel);
        setBounds(0,0,500,500);
        setVisible(true);
    }
}