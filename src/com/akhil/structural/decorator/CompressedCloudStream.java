package com.akhil.structural.decorator;

public class CompressedCloudStream implements Stream{
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    // Using composition to add additional behaviour (like compress) to the Stream object
    // We dont know what Stream is it. It can be a CloudStream or an EncryptedCloudStream
    // Decorator pattern uses composition (like Stream class) and solves the problem (maintainability)
    @Override
    public void write(String data) {
        String compressedData = this.compress(data);
        stream.write(compressedData);
    }

    private String compress(String data) {
        return "CompressedData";
    }
}
