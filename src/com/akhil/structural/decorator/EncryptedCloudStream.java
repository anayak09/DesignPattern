package com.akhil.structural.decorator;

public class EncryptedCloudStream implements Stream{
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encryptedData = this.encrypt(data);
        stream.write(encryptedData);
    }

    private String encrypt(String data) {
        return "!@!@#!@#!@#@!!@!#";
    }
}
