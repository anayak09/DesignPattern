package com.akhil.structural.decorator;

public class CompressedEncryptedCloudStream implements Stream{
    private Stream stream;

    public CompressedEncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    // So for every new feature, we have to add a class which is not maintanable
    // Solution - Decorator Design Pattern (to add new features to an existing class)
    // Decorate an existing class with additional behaviour

    @Override
    public void write(String data) {

    }

    private String compress(String data) {
        return "CompressedData";
    }

    private String encrypt(String data) {
        return "!@!@#!@#!@#@!!@!#";
    }
}
