package com.inicio;
//Importamos todos los componentes a utilizar
import javax.swing.*;
import java.awt.*;
//Creamos una clase que se extienda de JDesktopPane
class Escritorio extends JDesktopPane{
	
	private static final long serialVersionUID = 1L;
	// Creamos la variable que contendra a la imagen
	public static Image img = new ImageIcon(Object.class.getResource("../../imagenes/rga.jpg")).getImage();
	//Sobreescribimos el metodo paintChildren 
	@Override
	public void paintChildren(Graphics g){
		g.drawImage(img,0,0,getWidth(),getHeight(),this);
		super.paintChildren(g);
	}
}