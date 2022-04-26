package controlador;

import java.util.ArrayList;

import manejoFicheros.GestorFicheroUsuarios;
import modelo.Usuario;

public class GestorUsuario {

	public boolean loguearse(String alias, String password) {
		boolean validar = false;
		GestorFicheroUsuarios gestorFichero = new GestorFicheroUsuarios();
		ArrayList<Usuario> usuarios = gestorFichero.leerFichero();
		
		for(int i=0; i<usuarios.size(); i++) {
			if(alias.equals(usuarios.get(i).getAlias()) && password.equals(usuarios.get(i).getPassword())) {
				validar = true;
			}else {
				validar = false;
			}
		}
		return validar;
	}
}
