package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;

public class MyAnswer2 {
    public static long countMembers(List<Artist> artists) {
        return artists.stream()
                /**
                 * First transform artist to number of members, otherwise the intiValue of reduce
                 * will be of Artist type which won't be able to participate in the accumulation
                 * operation. Once you abstract to a level that only has integers, the reduce operation
                 * will be much easier.
                 */
                .map(artist -> (artist.getMembers().count()))
                .reduce(0L, (acc, element) -> (acc + element));
    }

}