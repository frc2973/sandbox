package edu.bobjones.chapters;

import edu.bobjones.Setting;

public abstract class Chapter {
	private final Chapter nextChapter;
	private final Setting setting;
	
	public Chapter(Setting setting, Chapter nextChapter) {
		this.setting = setting;
		this.nextChapter = nextChapter;
	}
    public Chapter nextChapter() {
    	return nextChapter;
    }
    
    public abstract String getTitle();

    public abstract String getStory();
}
