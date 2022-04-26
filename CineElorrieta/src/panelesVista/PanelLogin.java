package panelesVista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controlador.GestorUsuario;

public class PanelLogin extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnInicio, btnRegistro, btnLogin;
	private JLabel lbllogin, lblpassword;
	private JTextField txtlogin;
	private JPasswordField jpfpassword;
	
	public PanelLogin() {
		setSize(700, 700);
		this.setLayout(null);
		btnInicio = new JButton("Inicio");
		btnRegistro = new JButton("Registrarse");
		btnLogin = new JButton("Login");
		iniciarLabels();
		iniciarFields();
		add(btnInicio());
		add(btnRegistro());
		add(btnLogin());
		add(lbllogin);
		add(lblpassword);
		add(txtlogin);
		add(jpfpassword);
	}

	public JButton btnInicio() {
		btnInicio.setBounds(50, 50, 150, 50);
		btnInicio.addActionListener(this);
		return btnInicio;
	}
	
	public JButton btnRegistro() {
		btnRegistro.setBounds(250, 550, 150, 50);
		btnRegistro.addActionListener(this);
		return btnRegistro;
	}

	public JButton btnLogin() {
		btnLogin.setBounds(470, 550, 150, 50);
		btnLogin.addActionListener(this);
		return btnLogin;
	}
	
	public void iniciarLabels() {
		lbllogin = new JLabel("Usuario");
		lbllogin.setBounds(200, 250, 150, 50);
		lbllogin.setFont(new Font("Serif", Font.PLAIN, 25));
		lblpassword = new JLabel("Contraseña");
		lblpassword.setBounds(173, 350, 150, 50);
		lblpassword.setFont(new Font("Serif", Font.PLAIN, 25));
	}
	
	public void iniciarFields() {
		txtlogin = new JTextField();
		txtlogin.setBounds(300, 250, 250, 40);
		jpfpassword = new JPasswordField();
		jpfpassword.setBounds(300, 350, 250, 40);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInicio) {
			System.out.println("Esto me dirige al panel de inicio");
		}else if(e.getSource() == btnRegistro) {
			System.out.println("Esto me dirige al panel de Registro");
		}else if(e.getSource() == btnLogin) {
//			System.out.println("Esto me dirige al panel de Gestion de Cartelera");
			char[] arrayPassword = jpfpassword.getPassword();
			String password = new String(arrayPassword);
			GestorUsuario gestorUsuario = new GestorUsuario();
			boolean validar = gestorUsuario.loguearse(txtlogin.getText(), password);
			if (validar == true) {
				System.out.println("Esto me lleva al panel de gestion de cartelera.");
			}else {
				System.out.println("Error el usuario introducido no existe.");
			}
		}
	}
}
