package de.danoeh.antennapodsp.util.comparator;

import de.danoeh.antennapodsp.feed.Chapter;

import java.util.Comparator;

public class ChapterStartTimeComparator implements Comparator<Chapter> {

    @Override
    public int compare(Chapter lhs, Chapter rhs) {
        if (lhs.getStart() == rhs.getStart()) {
            return 0;
        } else if (lhs.getStart() < rhs.getStart()) {
            return -1;
        } else {
            return 1;
        }
    }

}
