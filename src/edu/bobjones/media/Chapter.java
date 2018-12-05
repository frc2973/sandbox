package edu.bobjones.media;

import edu.bobjones.Setting;

public abstract class Chapter {
	private static Book book;
	
    static void setBook(Book book) {
    	Chapter.book = book;
    }
    
    public abstract String getTitle();

    public abstract String getStory();
    
    protected Setting getSetting() {
    	return book.getSetting();
    }
}
