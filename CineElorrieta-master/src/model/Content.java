package model;

public class Content {
	
	private int code;
	private String title;
	private int length;
	
	
	
	public Content(int code, String title, int length) {
		super();
		this.code = code;
		this.title = title;
		this.length = length;
	}



	public Content() {
		super();
	}



	public int getCode() {
		return code;
	}



	public void setCode(int code) {
		this.code = code;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getLength() {
		return length;
	}



	public void setLength(int length) {
		this.length = length;
	}
	
	
	
	

}
