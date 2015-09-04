package com.insightfullogic.java8.exercises.chapter3;

import com.insightfullogic.java8.examples.chapter1.SampleData;
import org.junit.Assert;
import org.testng.annotations.Test;

import static java.util.Arrays.asList;

public class MyAnswer2Test {

    @Test
    public void countMembersTest() throws Exception {
        long count = MyAnswer2.countMembers(asList(SampleData.johnColtrane, SampleData.theBeatles));
        Assert.assertEquals(4, count);
    }
}