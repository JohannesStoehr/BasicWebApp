package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if(query.toLowerCase().contains("penguin")) {
            return "Penguins are the cutest animals on earth";
        } else if(query.toLowerCase().contains("what is your name")) {
            return "Johannes";
        } else if(query.toLowerCase().contains("which of the following numbers is the largest:")) {
            return Arrays.stream(query.substring(query.indexOf(":") + 2).split(",")).mapToInt(Integer::parseInt).max().getAsInt()  + "";
        } else  if(query.toLowerCase().contains("plus")) {
            return Arrays.stream(query.split(" ")).mapToInt(s -> {
                try {
                    return Integer.parseInt(s);
                } catch (Throwable t)  {
                    return 0;
                }
            }).sum() + "";
        }
        return query;
    }
}
