package com.insightfullogic.java8.exercises.chapter3;

public class MyAnswer6 {

    public static int countLowercase(String str) {
        return str.chars()
                .filter(mChar -> Character.isLowerCase(mChar))
                .map(mChar -> 1) // without this mapping, you will add int value of mChar directly
                .reduce(0, (acc, element) -> (acc + element));
    }
}