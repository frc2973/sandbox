package edu.bobjones.media;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import edu.bobjones.Setting;

public class Book {
	private final Setting setting;
	private final List<Chapter> chapters = new ArrayList<>();
	
	public Book(Setting setting) {
		this.setting = setting;
		
		Chapter.setBook(this);
		
		this.chapters.add(new Chapter1());
		this.chapters.add(new Chapter2());
		this.chapters.add(new Chapter3());
		this.chapters.add(new Chapter4());
	}
	
	public String getTitle() {
	    return "My Super Amazing Collaboration Story";	
	}
	
	public ListIterator<Chapter> getChapters() {
		return chapters.listIterator();
	}
	
	Setting getSetting() {
		return setting;
	}
}
