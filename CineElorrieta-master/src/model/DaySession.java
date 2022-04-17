package model;

import java.util.ArrayList;

public class DaySession {
	
	private Day day;
	private int time;
	private ArrayList<Content> contentList = new ArrayList<Content>();
	
	
	public DaySession() {
		
	}


	public DaySession(Day day, int time, ArrayList<Content> contentList) {
		this.day = day;
		this.time = time;
		this.contentList = contentList;
	}


	public Day getDay() {
		return day;
	}


	public void setDay(Day day) {
		this.day = day;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public ArrayList<Content> getContentList() {
		return contentList;
	}


	public void setContentList(ArrayList<Content> contentList) {
		this.contentList = contentList;
	}
	
	
	
	
	
}
