package com.akhil.iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BrowseHistory bh = new BrowseHistory();
        bh.push("a");
        bh.push("b");
        bh.push("c");

        //List<String> Urls = bh.getUrls();
        //Urls.forEach(url -> System.out.println(url));
    }
}
