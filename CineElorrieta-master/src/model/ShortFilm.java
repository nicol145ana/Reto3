package model;

public class ShortFilm extends Content  {
	
	private String fable;

	public ShortFilm(int code, String title, int length, String fable) {
		super(code, title, length);
		this.fable = fable;
	}

	public ShortFilm(int code, String title, int length) {
		super(code, title, length);
	}

	public String getFable() {
		return fable;
	}

	public void setFable(String fable) {
		this.fable = fable;
	}
	
	
	
	

}
