package model;

import java.time.LocalDate;

public class User {
	
	private static int generalId;
	private int id;
	private String name;
	private String surname;
	private String alias;
	private String password;
	private LocalDate birthDate;
	private Position position ;
	
	
	
	public User() {
		super();
		generalId = generalId + 1;
		this.id = generalId;
	}

	public User(String alias, String password) {
		this.alias = alias;
		this.password = password;
		
	}


	public User(int id, String name, String surname, String alias, String password, LocalDate birthDate,
			Position position) {
		super();
		generalId = generalId + 1;
		this.id = generalId;
		this.name = name;
		this.surname = surname;
		this.alias = alias;
		this.password = password;
		this.birthDate = birthDate;
		this.position = position;
	}



	public static int getGeneralId() {
		return generalId;
	}



	public static void setGeneralId(int generalId) {
		User.generalId = generalId;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
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



	public LocalDate getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}



	public Position getPosition() {
		return position;
	}



	public void setPosition(Position position) {
		this.position = position;
	}
	
	
	
	

}
