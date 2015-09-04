package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MyAnswer1 {

    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (acc, element) -> acc + element);
    }

    public static List<String> getNamesAndOrigins(List<Artist> artists) {
        return artists.stream()
                /**
                 * Here I really need to separate flatMap() of RxJava to that of Java8.
                 * In Java8, flatMap() is a one-to-many transformation.
                 * Stream.of() is a factory method which
                 * "Returns a sequential ordered stream whose elements are the specified values."
                 * To help yourself understand lambda expression, artist -> ...
                 * means "for each artist in the stream"
                 */
                .flatMap(artist -> (Stream.of(artist.getName(), artist.getNationality())))
                .collect(toList());
    }

    public static List<Album> getCustomAlbums(List<Album> albums) {
        return albums.stream()
                .filter(album -> (album.getTracks().count() <= 3))
                .collect(toList());
    }
}