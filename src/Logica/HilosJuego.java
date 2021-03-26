package Logica;

import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Vista.Juego;

public class HilosJuego implements Runnable{
	private boolean endThread;
	int numero;
	int valor;
	private URL urlImagen;
	private ImageIcon imagen;
	private JLabel lblImagen;
	
	public HilosJuego(JLabel lblImagen) {
		this.lblImagen = lblImagen;
		endThread = true;
	}
	
	public void run() {
		while(endThread) {
			numero = new Random().nextInt(43);
			if(numero == 1 || numero == 17 || numero == 23 || numero == 29) {
					urlImagen = this.getClass().getResource("/Imagenes/Naranja.png");
					valor = 1;
			}
			else if(numero == 2 || numero == 18 || numero == 24 || numero == 30){
				urlImagen = this.getClass().getResource("/Imagenes/Banano.png");
				valor = 2;
			} 
			else if(numero == 3 || numero == 43) {
				urlImagen = this.getClass().getResource("/Imagenes/Bar.png");
				valor = 13;
			}
			else if(numero == 4 || numero == 40 || numero == 41 || numero == 42) {
				urlImagen = this.getClass().getResource("/Imagenes/Bonus.png");
				valor = 12;
			}
			else if(numero == 5) {
				urlImagen = this.getClass().getResource("/Imagenes/Campana.png");
				valor = 11;
			}
			else if(numero == 6 || numero == 19 || numero == 25 || numero == 31) {
				urlImagen = this.getClass().getResource("/Imagenes/Cerezas.png");
				valor = 3;
			}
			else if(numero == 7 || numero == 32 || numero == 33 || numero == 34) {
				urlImagen = this.getClass().getResource("/Imagenes/Corazon.png");
				valor = 4;
			}
			else if(numero == 8 || numero == 35) {
				urlImagen = this.getClass().getResource("/Imagenes/Corona.png");
				valor = 8;
			}
			else if(numero==9) {
				urlImagen = this.getClass().getResource("/Imagenes/Diamante.png");
				valor = 16;
			}
			else if(numero==10 || numero == 36) {
				urlImagen = this.getClass().getResource("/Imagenes/Dinero.png");
				valor = 9;
			}
			else if(numero==11) {
				urlImagen = this.getClass().getResource("/Imagenes/Esmeralda.png");
				valor = 15;
			}
			else if(numero==12 || numero == 20 || numero == 26) {
				urlImagen = this.getClass().getResource("/Imagenes/Fresa.png");
				valor = 5;
			}
			else if(numero==13 || numero == 39) {
				urlImagen = this.getClass().getResource("/Imagenes/Grande.png");
				valor = 14;
			}
			else if(numero==14 || numero == 21 || numero == 27) {
				urlImagen = this.getClass().getResource("/Imagenes/Limon.png");
				valor = 6;
			}
			else if(numero==15 || numero == 22 || numero == 28) {
				urlImagen = this.getClass().getResource("/Imagenes/Sandia.png");
				valor = 7;
			}
			else if(numero==16 || numero == 37 || numero ==38) {
				urlImagen = this.getClass().getResource("/Imagenes/Trebol.png");
				valor = 10;
			}
			else {
//				urlImagen = this.getClass().getResource("/Imagenes/Bar.png");
//				valor = 13;
			}
//			System.out.println(valor+"\n");
			imagen = new ImageIcon(urlImagen);
			lblImagen.setIcon(imagen);
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void stopThread() {
		endThread = false;
	}
	public void startThread() {
		endThread = true;
	}
	//Getters/Setters
		public int getValor() {
			return valor;
		}
	
		public void setValor(int valor) {
			this.valor = valor;
		}
}
