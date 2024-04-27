package com.akhil.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Stream stream = new EncryptedCloudStream(new CloudStream());
        storeCreditCard(stream);
    }

    private static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
