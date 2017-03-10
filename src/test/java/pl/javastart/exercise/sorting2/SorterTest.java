package pl.javastart.exercise.sorting2;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SorterTest {

    private Sorter sorter = new Sorter();
    private List<Album> albums;

    @Before
    public void init() {
        Album theBlackAlbum = createTheBlackAlbum();
        Album heyJudeAlbum = createHeyJudeAlbum();
        Album przekornyLosAlbum = createPrzekornyLosAlbum();

        albums = Arrays.asList(theBlackAlbum, heyJudeAlbum, przekornyLosAlbum);
    }


    private Album createTheBlackAlbum() {
        List<Song> blackAlbumSongs = Arrays.asList(
                new Song("Ender Sandman", 332),
                new Song("Sad But True", 324),
                new Song("Holier Than You", 227),
                new Song("The Unforgiven", 387)
        );
        Calendar calendar = Calendar.getInstance();
        calendar.set(1991, 7, 12);
        Date blackAlbumDate = calendar.getTime();

        return new Album("The Black Album", "Metallica", blackAlbumDate, blackAlbumSongs);
    }

    private Album createHeyJudeAlbum() {
        List<Song> songs = Arrays.asList(
                new Song("Hey Jude", 425),
                new Song("Old Brown Shoe", 196),
                new Song("Don't Let Me Down", 210),
                new Song("The Ballad of John and Yoko", 175)
        );
        Calendar calendar = Calendar.getInstance();
        calendar.set(1970 , 1, 26);
        Date date = calendar.getTime();

        return new Album("Hey Jude", "The Beatels", date, songs);
    }

    private Album createPrzekornyLosAlbum() {
        List<Song> songs = Arrays.asList(
                new Song("Przez Twe oczy zielone", 265),
                new Song("Ty skradłaś wszystko", 210)
        );
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016 , 6, 1);
        Date date = calendar.getTime();

        return new Album("Przekorny los", "Akcent", date, songs);
    }

    @Test
    public void shouldSortByTitleAsc() {
        // when
        sorter.sort(albums, SortBy.TITLE, SortOrder.ASC);

        // then
        assertThat(albums.size(), is(3));
        assertThat(albums.get(0).getTitle(), is("Hey Jude"));
        assertThat(albums.get(1).getTitle(), is("Przekorny los"));
        assertThat(albums.get(2).getTitle(), is("The Black Album"));
    }

    @Test
    public void shouldSortByTitleDesc() {
        // when
        sorter.sort(albums, SortBy.TITLE, SortOrder.DESC);

        // then
        assertThat(albums.size(), is(3));
        assertThat(albums.get(0).getTitle(), is("The Black Album"));
        assertThat(albums.get(1).getTitle(), is("Przekorny los"));
        assertThat(albums.get(2).getTitle(), is("Hey Jude"));
    }

    @Test
    public void shouldSortByReleaseDateAsc() {
        // when
        sorter.sort(albums, SortBy.RELEASE_DATE, SortOrder.ASC);

        // then
        assertThat(albums.size(), is(3));
        assertThat(albums.get(0).getTitle(), is("Hey Jude"));
        assertThat(albums.get(1).getTitle(), is("The Black Album"));
        assertThat(albums.get(2).getTitle(), is("Przekorny los"));
    }

    @Test
    public void shouldSortByReleaseDateDesc() {
        // when
        sorter.sort(albums, SortBy.RELEASE_DATE, SortOrder.DESC);

        // then
        assertThat(albums.size(), is(3));
        assertThat(albums.get(0).getTitle(), is("Przekorny los"));
        assertThat(albums.get(1).getTitle(), is("The Black Album"));
        assertThat(albums.get(2).getTitle(), is("Hey Jude"));
    }
}
