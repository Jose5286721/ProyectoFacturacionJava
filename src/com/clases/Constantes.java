package com.clases;
import java.awt.*;

public class Constantes{
	private Dimension screenSize;
	private int width;
	private int height;
	public Constantes(){
		this.screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.width = this.screenSize.width;
		this.height = this.screenSize.height;
	}
	public int getWidth(){
		return this.width;
	}
	public int getHeight(){
		return this.height;
	}
}