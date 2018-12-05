package edu.bobjones.chapters;

import edu.bobjones.Setting;

public class Chapter1 extends Chapter {
	public Chapter1(Setting setting, Chapter nextChapter) {
		super(setting, nextChapter);
	}

    public String getTitle() {
	    return "Supercool Chapter About Stuff";
    }

    public String getStory()
    {
	    return "I once heard a guy who knew a lot about stuff";
    }
}
