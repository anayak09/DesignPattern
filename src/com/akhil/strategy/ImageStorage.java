package com.akhil.strategy;

public class ImageStorage {
    // this should be an ENUM, because we are working with a set of constants
    private String compressor;
    private String filter;

    public ImageStorage(String compression, String filter) {
        this.compressor = compression;
        this.filter = filter;
    }

    public void store(String fileName) {
        // To store the images that users upload, we follow these steps :-

        // JPEG, PNG, .. (Compression Algorithm)
        if(compressor == "jpeg")
            System.out.println("Compressing using JPEG..");
        else if(compressor == "png")
            System.out.println("Compressing using PNG..");

        // B&W, High Contrast (Filter so that all images have a common look)
        if(filter == "b&W")
            System.out.println("Applying B&W filter");
        else if(filter == "high-contrast")
            System.out.println("Applying high-contrast filter");
    }
}
