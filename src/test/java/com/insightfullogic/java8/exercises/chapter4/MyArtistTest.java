package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;
import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Optional;

import static java.util.Arrays.asList;

public class MyArtistTest {

    @Test
    public void getArtistTest() throws Exception {
        MyArtists artists = createArtists();
        Assert.assertEquals(Optional.empty(), artists.getArtist(3));
    }

    @Test
    public void getArtistNameTest() throws Exception {
        MyArtists artists = createArtists();
        Assert.assertEquals("unknown", artists.getArtistName(3));
    }

    private MyArtists createArtists() {
        return new MyArtists(asList(
                new Artist("Shawn", "China"),
                new Artist("Brian", "Taiwan"),
                new Artist("Jono", "Australia")));
    }
}