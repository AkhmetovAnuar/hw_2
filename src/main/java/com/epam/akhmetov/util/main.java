package com.epam.akhmetov.util;

import com.epam.akhmetov.entity.Symbol;

public class main {
    public static void main(String[] args) {

        System.out.println(Parse.byChar("sa.f"));
        System.out.println(Parse.byWord("saf safsaf. asfsasaf!"));
    }
}
