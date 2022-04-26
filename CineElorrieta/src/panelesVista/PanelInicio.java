package panelesVista;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicio extends JPanel implements MouseListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PanelInicio() {
		setSize(700, 700);
		this.setLayout(null);
		add(iniciarMensaje());
		addMouseListener(this);
		add(anadirLogo());
	}

	public JLabel iniciarMensaje() {
		JLabel lblMensaje = new JLabel("BIENVENIDA");
		lblMensaje.setFont(new Font("Serif", Font.BOLD, 60));
		lblMensaje.setBounds(250, 500, 500, 50);
		return lblMensaje;
	}

	public JLabel anadirLogo() {
		//Aqui añadiremos el logo de nuestro cine que estara dentor del 
		//folder de Imagenes que hemos creado
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon("Imagenes/logo.jpg"));
		logo.setBounds(300, 200, 250, 250);
		return logo;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Aqui debemos poner la accion a la hora de hacer click en la 
		//ventana el resto de metodos no nos sirven pero se crean automaticamente
		//al implementar el MouseListener
		System.out.println("El click funciona");
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}	
}