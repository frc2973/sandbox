package edu.bobjones;

import java.util.ListIterator;

import edu.bobjones.media.Book;
import edu.bobjones.media.Chapter;

public class BookViewer {

	public static void main(String[] args) {
		BookViewer bv = new BookViewer();
		
		Setting s = new Setting();
		Book myBook = new Book(s);

		bv.readBook(myBook);
	}
	
	public void readBook(Book book) {
		System.out.println(String.format("%s", book.getTitle().toUpperCase()));
		
		ListIterator<Chapter> chapters = book.getChapters();
		
		while (chapters.hasNext()) {
			readChapter(chapters.next());
		}
	}
	
	public void readChapter(Chapter c) {
		System.out.println(String.format("--- %s ---", c.getTitle()));
		System.out.println(c.getStory());
	}
}
