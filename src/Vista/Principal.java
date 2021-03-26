 package Vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal extends JFrame{
	
	private InicioPrincipal inicio;
	int apuesta;
	private Juego juego;
		
	public Principal() {
		this.setLocation(270,180);
		this.setSize(800,400);
		this.setResizable(false);
		this.setDefaultCloseOperation(0);
		inicializar();
		acciones();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		inicio = new InicioPrincipal();
		juego = new Juego();
	}
	private void caracteristicas() {
		inicio.setBounds(380,180,800,400);
		juego.setBounds(380,180,800,400);
	}
	private void acciones() {
		inicio.getBtnEmpezar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = inicio.getTxtNombre().getText();
				apuesta = Integer.parseInt(inicio.getTxtDinero().getText());
				boolean verificar = true;
				
				if(nombre.equals("")) {
					JOptionPane.showMessageDialog(null,"Ingrese su nombre, por favor");
					verificar = false;
				}
				else {
					verificar = true;
				}
				
				if(apuesta<100) {
					JOptionPane.showMessageDialog(null,"Ingrese un valor mayor o igual a 100, por favor");
					verificar = false;
				}
				else if(apuesta>= 100) {
					verificar = true;
				}
				else {
					JOptionPane.showMessageDialog(null,"Ingresó un valor equivocado para la apuesta");
					verificar = false;
				}
				if(verificar) {
					add(juego);
					inicio.setVisible(false);
					juego.getLblNombre().setText(nombre);
					juego.getLblCantidadDinero().setText(String.valueOf(apuesta));
					juego.setReclamar(true);
					juego.getTxtApuesta().setText("");
				}
			}
		});
		juego.getBtnReclamar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				while(juego.isReclamar()) {
					JOptionPane.showMessageDialog(null, "Su dinero : "+juego.getLblCantidadDinero().getText());
					inicio.getTxtNombre().setText("");
					inicio.getTxtDinero().setText("");
					juego.getLblCantidadDinero().setText(String.valueOf(apuesta));
					inicio.setVisible(true);
					remove(juego);
					juego.setReclamar(false);
				}	
			}
		});
		inicio.getBtnExit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null,"Gracias por jugar");
				System.exit(0);
			}
		});
	}
	private void agregar() {
		add(inicio);
	}
	//Getters/Setters
		public int getApuesta() {
			return apuesta;
		}
		public void setApuesta(int apuesta) {
			this.apuesta = apuesta;
		}
}
