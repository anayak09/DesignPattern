package com.akhil.structural.adapter;

import com.akhil.structural.adapter.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());

        //imageView.apply(new Caramel());


        //Convert the interface of Caramel class so that it coulod be used in our program
        // As we can only use Filters that implement Filter interface
        // Composition (Caramel Filter has a composite relation with Caramel class)
        // Composition over inheritance because Java doesnt support multiple inheritance
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
