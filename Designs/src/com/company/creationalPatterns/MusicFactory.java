package com.company.creationalPatterns;

public class MusicFactory {
    public static Music getMusic(String genere) {
        if(genere.equalsIgnoreCase("Indian Classical")) {
            return new IndianClassical();
        } else if(genere.equalsIgnoreCase("Rock")) {
            return new Rock();
        } else  {
            return new Symphony();
        }
    }
}
