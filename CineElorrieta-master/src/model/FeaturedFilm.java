package model;

public class FeaturedFilm extends Content {
	
	private String synopsis;

	public FeaturedFilm(int code, String title, int length, String synopsis) {
		super(code, title, length);
		this.synopsis = synopsis;
	}

	public FeaturedFilm(int code, String title, int length) {
		super(code, title, length);
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	
	
	

}
