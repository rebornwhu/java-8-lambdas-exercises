package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Stream;

import static com.insightfullogic.java8.examples.chapter1.SampleData.aLoveSupreme;
import static com.insightfullogic.java8.examples.chapter1.SampleData.manyTrackAlbum;
import static com.insightfullogic.java8.examples.chapter1.SampleData.sampleShortAlbum;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class MyAnswer1Test {

    @Test
    public void addUpTest() throws Exception {
        int sum = MyAnswer1.addUp(Stream.of(1, 2, 3));
        assertEquals(6, sum);
    }

    @Test
    public void getNamesAndOriginsTest() throws Exception {
        List<String> list = MyAnswer1.getNamesAndOrigins(SampleData.getThreeArtists());
    }

    @Test
    public void getCustomAlbumsTest() throws Exception {
        List<Album> input = asList(manyTrackAlbum, sampleShortAlbum, aLoveSupreme);
        List<Album> output = MyAnswer1.getCustomAlbums(input);
        assertEquals(2, output.size());
    }
}