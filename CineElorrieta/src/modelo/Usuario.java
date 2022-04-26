package modelo;

import java.time.LocalDate;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String alias;
	private String password;
	private LocalDate fechNacimiento;
	private cargo cargo;
	
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", alias=" + alias + ", password=" + password
				+ ", fechNacimiento=" + fechNacimiento + ", cargo=" + cargo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getFechNacimiento() {
		return fechNacimiento;
	}

	public void setFechNacimiento(LocalDate fechNacimiento) {
		this.fechNacimiento = fechNacimiento;
	}

	public cargo getCargo() {
		return cargo;
	}

	public void setCargo(cargo cargo) {
		this.cargo = cargo;
	}

	public enum cargo {
		EMPLEADO, DIRECTOR_LOCAL, DIRECTOR_PROVINCIAL
	};
	
}
