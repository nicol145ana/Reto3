package model;

public class Documentary extends FeaturedFilm {
	
	private String topic;

	public Documentary(int code, String title, int length, String synopsis, String topic) {
		super(code, title, length, synopsis);
		this.topic = topic;
	}

	public Documentary(int code, String title, int length, String synopsis) {
		super(code, title, length, synopsis);
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	
	
	
	

}
