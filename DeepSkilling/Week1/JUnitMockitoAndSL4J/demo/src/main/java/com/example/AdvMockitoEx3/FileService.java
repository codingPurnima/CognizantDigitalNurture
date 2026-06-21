package com.example.AdvMockitoEx3;

public class FileService {

    private FileReader reader;
    private FileWriter writer;

    public FileService(FileReader reader, FileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String processFile() {
        String data = reader.read();
        String processed = "Processed " + data;
        writer.write(processed);
        return processed;
    }
}