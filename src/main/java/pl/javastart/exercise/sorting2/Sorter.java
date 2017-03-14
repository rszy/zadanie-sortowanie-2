package pl.javastart.exercise.sorting2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {


    public void sort(List<Album> albums, SortBy sortBy, SortOrder sortOrder) {
        if (sortBy == SortBy.TITLE && sortOrder == SortOrder.ASC) {
            Collections.sort(albums, new Comparator<Album>() {
                @Override
                public int compare(Album o1, Album o2) {
                    return o1.getTitle().compareTo(o2.getTitle());
                }
            });
        } else if (sortBy == SortBy.TITLE && sortOrder == SortOrder.DESC) {
            Collections.sort(albums, new Comparator<Album>() {
                @Override
                public int compare(Album o1, Album o2) {
                    return o1.getTitle().compareTo(o2.getTitle())*-1;
                }
            });
        }
        if (sortBy == SortBy.RELEASE_DATE && sortOrder == SortOrder.ASC) {
            Collections.sort(albums, new Comparator<Album>() {
                @Override
                public int compare(Album o1, Album o2) {
                    return o1.getReleaseDate().compareTo(o2.getReleaseDate());
                }
            });
        } else if(sortBy == SortBy.RELEASE_DATE && sortOrder == SortOrder.DESC) {
            Collections.sort(albums, new Comparator<Album>() {
                @Override
                public int compare(Album o1, Album o2) {
                    return o1.getReleaseDate().compareTo(o2.getReleaseDate())*-1;
                }
            });
        }
    }
}

