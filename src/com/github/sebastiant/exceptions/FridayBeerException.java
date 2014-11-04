package com.github.sebastiant.exceptions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FridayBeerException extends Exception {
    private static String defaultPrefix = "Too few beer, so ";
    private static List<String> excuses = Arrays.asList(
            "Caught 99 Exceptions but the lager threw none",
            "Got IPA?");
    
    public FridayBeerException()
    {
        super(getRandomExcuse());
    }
    
    public FridayBeerException(String excuse) {
        super(defaultPrefix + excuse);
    }
    
    public FridayBeerException(String excuse, Throwable throwable) {
        super(defaultPrefix + excuse, throwable);
    }
    
    private static String getRandomExcuse() {
        return excuses.get(new Random().nextInt(excuses.size()));
    }
}
