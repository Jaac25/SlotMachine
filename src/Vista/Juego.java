package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Logica.HilosJuego;

public class Juego extends JPanel{
	private JLabel lblTitulo;
	
	private int dinero;
	private int apuesta;
	
	private JLabel lblImagen1;
	private URL urlImagen1;
	private ImageIcon imagen1;
	
	private JLabel lblImagen2;
	private URL urlImagen2;
	private ImageIcon imagen2;
	
	private JLabel lblImagen3;
	private URL urlImagen3;
	private ImageIcon imagen3;
	
	private JLabel lblBienvenido;
	private JLabel lblNombre;
	
	private JLabel lblMin;
	
	private JLabel lblDinero;
	private JLabel lblCantidadDinero;
	
	private JLabel lblApuesta;
	private JTextField txtApuesta;
	
	private JButton btnStop1;
	private JButton btnStop2;
	private JButton btnStop3;
	
	private JLabel lblReclamar;
	private JLabel lblSalir;
	private JLabel lblIniciar;
	
	private URL urlStart;
	private ImageIcon imagenStart;
	private JButton btnStart;

	private URL urlReclamar;
	private ImageIcon imagenReclamar;
	private JButton btnReclamar;
	
	private HilosJuego hilo1;
	private HilosJuego hilo2;
	private HilosJuego hilo3;
	
	private int numero1 = 0;
	private int numero2 = 0;
	private int numero3 = 0;
	
	private boolean boton1 = false;
	private boolean boton2 = false;
	private boolean boton3 = false;
	
	private boolean reclamar = true;
	private boolean start = true;
	
	public Juego() {
		setLayout(null);
		inicializar();
		caracteristicas();
		procesos();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Gana Monedas 2000");
		
		urlImagen1 = this.getClass().getResource("/Imagenes/maquina.jpg");
		imagen1 = new ImageIcon(urlImagen1);
		lblImagen1 = new JLabel(imagen1);
		
		urlImagen2 = this.getClass().getResource("/Imagenes/maquina.jpg");
		imagen2 = new ImageIcon(urlImagen2);
		lblImagen2 = new JLabel(imagen2);
		
		urlImagen3 = this.getClass().getResource("/Imagenes/maquina.jpg");
		imagen3 = new ImageIcon(urlImagen3);
		lblImagen3 = new JLabel(imagen3);
		
		lblBienvenido = new JLabel("Bienvenid@");
		lblNombre = new JLabel();
		
		lblMin = new JLabel("Min: 100");
		
		lblDinero = new JLabel("Dinero:");
		lblCantidadDinero = new JLabel();
		
		lblApuesta = new JLabel("Apuesta:");
		txtApuesta = new JTextField();
		
		lblReclamar = new JLabel("Cobrar");
		lblSalir = new JLabel("Salir");
		lblIniciar = new JLabel("Iniciar");
		
		btnStop1 = new JButton("Parar");
		btnStop2 = new JButton("Parar");
		btnStop3 = new JButton("Parar");
		
		urlStart = this.getClass().getResource("/Imagenes/boton.jpg");
		imagenStart = new ImageIcon(urlStart);
		btnStart = new JButton(imagenStart);
		
		urlReclamar = this.getClass().getResource("/Imagenes/Reclamar.jpg");
		imagenReclamar = new ImageIcon(urlReclamar);
		btnReclamar = new JButton(imagenReclamar);
		
		hilo1 = new HilosJuego(lblImagen1);
		hilo2 = new HilosJuego(lblImagen2);
		hilo3 = new HilosJuego(lblImagen3);
	}
	private void caracteristicas() {
		
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(210,-30,500,150);
		
		lblImagen1.setBounds(50,100,150,150);
		lblImagen2.setBounds(225,100,150,150);
		lblImagen3.setBounds(395,100,150,150);
		
		lblBienvenido.setFont(new Font("Algerian", 0, 23));
		lblBienvenido.setForeground(Color.blue);
		lblBienvenido.setBounds(610,75,220,30);
		
		lblNombre.setFont(new Font("Algerian", 0, 23));
		lblNombre.setForeground(Color.blue);
		lblNombre.setBounds(610,105,220,30);
		
		lblMin.setBounds(580,170,100,20);
		lblMin.setFont(new Font("Castellar", 0, 15));
		
		lblDinero.setFont(new Font("Algerian", 0, 18));
		lblDinero.setBounds(580,145,100,20);
		lblCantidadDinero.setFont(new Font("Algerian", 0, 18));
		lblCantidadDinero.setForeground(Color.RED);
		lblCantidadDinero.setBounds(680,145,100,20);
		
		lblApuesta.setFont(new Font("Algerian", 0, 18));
		lblApuesta.setBounds(580,195,100,20);
		txtApuesta.setBounds(680,195,100,20);
		
		btnStop1.setBounds(70,280,120,60);
		btnStop1.setFont(new Font("Algerian", 0, 20));
		btnStop1.setBackground(Color.BLACK);
		btnStop1.setForeground(Color.WHITE);
		
		btnStop2.setBounds(240,280,120,60);
		btnStop2.setFont(new Font("Algerian", 0, 20));
		btnStop2.setBackground(Color.BLACK);
		btnStop2.setForeground(Color.WHITE);
		
		btnStop3.setBounds(410,280,120,60);
		btnStop3.setFont(new Font("Algerian", 0, 20));
		btnStop3.setBackground(Color.BLACK);
		btnStop3.setForeground(Color.WHITE);
		
		lblIniciar.setBounds(700,244,100,10);
		lblIniciar.setFont(new Font("Algerian", 0, 15));
		lblIniciar.setForeground(Color.GREEN);
		
		btnStart.setBounds(680,265,100,90);
		
		lblReclamar.setBounds(585,252,100,10);
		lblReclamar.setFont(new Font("Algerian", 0, 15));
		lblReclamar.setForeground(Color.RED);
		
		lblSalir.setBounds(595,240,100,10);
		lblSalir.setFont(new Font("Algerian", 0, 15));
		lblSalir.setForeground(Color.RED);
		
		btnReclamar.setBounds(580,265,80,90);
		btnReclamar.setBorder(null);
	}
	
	private void procesos() {		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(start) {
					dinero = Integer.parseInt(lblCantidadDinero.getText());
					boolean verificar = true;
					if(dinero>=100 ) {
						apuesta = Integer.parseInt(txtApuesta.getText());
						if(apuesta > dinero) {
							JOptionPane.showMessageDialog(null,"No tienes suficiente dinero");
							verificar = false;
							break;
						}
						else if(apuesta<100) {
							JOptionPane.showMessageDialog(null,"Su apuesta debe ser mayor o igual a 100");
							verificar = false;
						}
						else if(apuesta>=100 && apuesta <= dinero) {
							verificar = true;
						}
						else {
							System.out.println("Error #105");
						}
						if(verificar) {
							reclamar = false;
							hilo1.startThread();
							hilo2.startThread();
							hilo3.startThread();
							Thread thOne = new Thread(hilo1);
							Thread thTwo = new Thread(hilo2);
							Thread thThree = new Thread(hilo3);
							thOne.start();
							thTwo.start();
							thThree.start();
							cobrarTiro();
							start = false;
						}
					}
					else {
						JOptionPane.showMessageDialog(null,"¡Perdiste!. Necesitas más de 100$ para jugar");
						break;
					}
				}
			}
		});
		btnStop1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton1 = true;		
				hilo1.stopThread();
				verificarBotones();
			}
		});
		btnStop2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton2 = true;
				hilo2.stopThread();
				verificarBotones();
			}
		});
		btnStop3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boton3 = true;
				hilo3.stopThread();
				verificarBotones();
			}
		});
	}
	public void cobrarTiro() {
		dinero = dinero-apuesta;
		getLblCantidadDinero().setText(String.valueOf(dinero));
	}
	public void verificarBotones() {
		if(boton1 && boton2 && boton3) {
			reclamar = true;
			start = true;
			numero1 = hilo1.getValor();
			numero2 = hilo2.getValor();
			numero3 = hilo3.getValor();
			boton1 = false;
			boton2 = false;
			boton3 = false;
			
			if(numero1 == numero2 && numero1 == numero3) {
				int valorApuesta = 0;
				if(numero1 == 1 || numero1 == 2 || numero1 == 3 || numero1 == 4 || numero1 == 12) {
					valorApuesta = apuesta * 1;
					dinero = dinero + (apuesta*1);
				}
				else if(numero1 == 5 || numero1 == 6 || numero1 == 7 || numero1 == 10) {
					valorApuesta = apuesta * 2;
					dinero = dinero + (apuesta*2);
				}
				else if(numero1 == 8 || numero1 == 9 || numero1 == 11) {
					valorApuesta = apuesta * 3;
					dinero = dinero + (apuesta*3);
				}
				else if(numero1 == 13 || numero1 == 14) {
					valorApuesta = apuesta * 4;
					dinero = dinero + (apuesta*4);
				}
				else if(numero1 == 15) {
					valorApuesta = apuesta * 5;
					dinero = dinero + (apuesta*5);
				}
				else if(numero1 == 16) {
					valorApuesta = apuesta * 6;
					dinero = dinero + (apuesta*6);
				}
				else {
					
				}
				JOptionPane.showMessageDialog(null, "Ganó: " + valorApuesta);
				lblCantidadDinero.setText(String.valueOf(dinero));
			}
			else {
				JOptionPane.showMessageDialog(null,"Perdió "+apuesta);
				reclamar = true;
			}
		}
		else if(boton1 == false || boton2 == false || boton3 == false) {
			reclamar = false;
		}
		else {
			reclamar = false;
		}
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblBienvenido);
		add(lblNombre);
		
		add(lblMin);
		
		add(lblDinero);
		add(lblCantidadDinero);
		
		add(lblApuesta);
		add(txtApuesta);
		
		add(lblImagen1);
		add(lblImagen2);
		add(lblImagen3);
		
		add(lblIniciar);
		add(lblReclamar);
		add(lblSalir);
		
		add(btnStart);
		add(btnReclamar);
		
		add(btnStop1);
		add(btnStop2);
		add(btnStop3);	
	}
	
	//Getters/Setters
		public JButton getBtnStop1() {
			return btnStop1;
		}
		public JLabel getLblNombre() {
			return lblNombre;
		}
		public void setLblNombre(JLabel lblNombre) {
			this.lblNombre = lblNombre;
		}
		public void setBtnStop1(JButton btnStop1) {
			this.btnStop1 = btnStop1;
		}
		public JButton getBtnStop2() {
			return btnStop2;
		}
		public void setBtnStop2(JButton btnStop2) {
			this.btnStop2 = btnStop2;
		}
		public JButton getBtnStop3() {
			return btnStop3;
		}
		public void setBtnStop3(JButton btnStop3) {
			this.btnStop3 = btnStop3;
		}
		public JLabel getLblCantidadDinero() {
			return lblCantidadDinero;
		}
		public void setLblCantidadDinero(JLabel lblCantidadDinero) {
			this.lblCantidadDinero = lblCantidadDinero;
		}
		public JButton getBtnStart() {
			return btnStart;
		}
		public void setBtnStart(JButton btnStart) {
			this.btnStart = btnStart;
		}
		public JButton getBtnReclamar() {
			return btnReclamar;
		}
		public void setBtnReclamar(JButton btnReclamar) {
			this.btnReclamar = btnReclamar;
		}
		public void setReclamar(boolean reclamar) {
			this.reclamar = reclamar;
		}
		public boolean isReclamar() {
			return reclamar;
		}
		public JTextField getTxtApuesta() {
			return txtApuesta;
		}
}
