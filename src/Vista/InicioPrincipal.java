package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InicioPrincipal extends JPanel{
	
	private JLabel lblTitulo;
	
	private JLabel lblNombre;
	private JTextField txtNombre;
	
	private JLabel lblDinero;
	private JTextField txtDinero;
	
	private JButton btnEmpezar;
	private JButton btnExit;
	
	public InicioPrincipal() {
		setLayout(null);
		inicializar();
		caracteristicas();
		agregar();
	}
	private void inicializar() {
		lblTitulo = new JLabel("Gana Monedas 2000");
		
		lblNombre = new JLabel("Nombre:");
		txtNombre = new JTextField();
		
		lblDinero = new JLabel("Dinero:");
		txtDinero = new JTextField();
		
		btnEmpezar = new JButton("Empezar");
		btnExit = new JButton("Salir");
	}
	private void caracteristicas() {
		lblTitulo.setFont(new Font("Algerian", 0, 40));
		lblTitulo.setBounds(210,-30,500,150);
		
		lblNombre.setFont(new Font("Algerian", 0, 25));
		lblNombre.setBounds(240,125,150,30);
		txtNombre.setBounds(370,115,200,50);
		
		lblDinero.setFont(new Font("Algerian", 0, 25));
		lblDinero.setBounds(240,185,150,30);
		txtDinero.setBounds(370,175,200,50);
		
		btnEmpezar.setFont(new Font("Algerian", 0, 20));
		btnEmpezar.setBackground(Color.BLACK);
		btnEmpezar.setForeground(Color.WHITE);
		btnEmpezar.setBounds(240,280,150,50);
		
		btnExit.setFont(new Font("Algerian", 0, 20));
		btnExit.setBackground(Color.RED);
		btnExit.setForeground(Color.WHITE);
		btnExit.setBounds(400,280,150,50);
	}
	private void agregar() {
		add(lblTitulo);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblDinero);
		add(txtDinero);
		
		add(btnEmpezar);
		add(btnExit);
	}
	
	//Getters/Setters
		public JTextField getTxtNombre() {
			return txtNombre;
		}
		public void setTxtNombre(JTextField txtNombre) {
			this.txtNombre = txtNombre;
		}
		public JButton getBtnEmpezar() {
			return btnEmpezar;
		}
		public void setBtnEmpezar(JButton btnEmpezar) {
			this.btnEmpezar = btnEmpezar;
		}
		public JTextField getTxtDinero() {
			return txtDinero;
		}
		public void setTxtDinero(JTextField txtDinero) {
			this.txtDinero = txtDinero;
		}
		public JButton getBtnExit() {
			return btnExit;
		}
		public void setBtnExit(JButton btnExit) {
			this.btnExit = btnExit;
		}	
}
