package Util;

import java.io.IOException;
import java.io.InputStream;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.nio.file.Paths;
import java.util.Scanner;

public class Parser {

    private ObjectMapper objectMapper;

    public Parser() {
        this.objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public String toJson(Object object) {
        try {
            String jsonString = this.objectMapper.writeValueAsString(object);
            return jsonString;
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error creating a json", e);
        }
    }

    public <T> T read(String text, TypeReference<T> type) {
        try {
            return objectMapper.readValue(text, type);
        } catch (Exception e) {
            throw new RuntimeException("Error reading json");
        }
    }

    public <T> T readFile(String path, TypeReference<T> type) throws IOException {
        String fileAsText = readFileFromResources(path);
        //String pathDisk = "C:\\" + path;
        //String fileAsText = new Scanner(Paths.get(pathDisk), "UTF-8").useDelimiter("\\A").next();
        return read(fileAsText, type);
    }

    public static String readFileFromResources(String path) {
        InputStream resourceStream = Parser.class.getClassLoader().getResourceAsStream(path);
        if (resourceStream == null) throw new RuntimeException();

        return new Scanner(resourceStream, "UTF-8").useDelimiter("\\A").next();
    }
}
