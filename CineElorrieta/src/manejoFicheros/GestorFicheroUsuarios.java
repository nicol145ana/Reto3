package manejoFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import modelo.Usuario;
import modelo.Usuario.cargo;

public class GestorFicheroUsuarios {
		
	public ArrayList<Usuario> leerFichero() {
		File FicheroUsuarios = new File("C:\\WORKSPACEANA\\CineElorrieta1\\FicheroUsuarios\\Usuarios");
		BufferedReader lecturaFichero = null;
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		try {
			lecturaFichero = new BufferedReader(new FileReader(FicheroUsuarios));
			String linea;
			Usuario u = new Usuario();
			while ((linea = lecturaFichero.readLine()) != null) {
				
				if (!linea.startsWith("*")) {
					String[] elementos = linea.split(":");
					switch (elementos[0]) {
					case "Nombre":
						u.setNombre(elementos[1]);
						break;
					case "Apellidos":
						u.setApellidos(elementos[1]);
						break;
					case "Login":
						u.setAlias(elementos[1]);
						break;
					case "Password":
						u.setPassword(elementos[1]);
						break;
					case "Fecha de nacimiento":
						LocalDate fechNa = LocalDate.parse(elementos[1]);
						u.setFechNacimiento(fechNa);
						break;
					case "Cargo":
						cargo carg = cargo.valueOf(elementos[1].toUpperCase());
						u.setCargo(carg);
						break;
					}
				}else {
					usuarios.add(u);
					u = new Usuario();
				}
			}
		}catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		return usuarios;
	}
}
