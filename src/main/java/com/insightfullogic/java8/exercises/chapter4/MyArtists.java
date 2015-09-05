package com.insightfullogic.java8.exercises.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.Optional;

public class MyArtists {

    private List<Artist> artists;

    public MyArtists(List<Artist> artists) {
        this.artists = artists;
    }

    /*public Artist getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            indexException(index);
        }
        return artists.get(index);
    }*/

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size())
            return Optional.empty();
        return Optional.of(artists.get(index));
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index +
                " doesn't correspond to an Artist");
    }

    /*public String getArtistName(int index) {
        try {
            Artist artist = getArtist(index);
            return artist.getName();
        } catch (IllegalArgumentException e) {
            return "unknown";
        }
    }*/

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.isPresent() ? artist.get().getName() : "unknown";
    }

}