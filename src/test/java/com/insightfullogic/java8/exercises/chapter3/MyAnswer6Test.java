package com.insightfullogic.java8.exercises.chapter3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAnswer6Test {

    @Test
    public void countLowercase() throws Exception {
        int count = MyAnswer6.countLowercase("AaBbCcDd");
        Assert.assertEquals(4, count);
    }
}