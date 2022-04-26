package vista;

import javax.swing.JFrame;

import panelesVista.PanelLogin;

public class MainVentana extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MainVentana() {
		this.setSize(900, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setContentPane(new PanelLogin());
	}

	public static void main (String[] args) {
		
		MainVentana ventana = new MainVentana();
		ventana.setVisible(true);
		
	}

}
