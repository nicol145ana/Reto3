package model;

public class Film extends FeaturedFilm {
	
	private String genre;
	private String pegi;
	public Film(int code, String title, int length, String synopsis, String genre, String pegi) {
		super(code, title, length, synopsis);
		this.genre = genre;
		this.pegi = pegi;
	}
	public Film(int code, String title, int length, String synopsis) {
		super(code, title, length, synopsis);
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPegi() {
		return pegi;
	}
	public void setPegi(String pegi) {
		this.pegi = pegi;
	}
	
	
	
	
	

}
