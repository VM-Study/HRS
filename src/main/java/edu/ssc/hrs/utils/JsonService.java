package edu.ssc.hrs.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Slf4j
public class JsonService {
    private JsonService() {
    }

    public static class JsonProcessingException extends RuntimeException {
        public JsonProcessingException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static <T> List<T> jsonToList(String jsonFileName, Class<T[]> type) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.findAndRegisterModules();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            InputStream is = ClassLoader.getSystemResourceAsStream(jsonFileName);
            if (is == null) {
                throw new FileNotFoundException("File not found: " + jsonFileName);
            }
            String content = new String(is.readAllBytes(), StandardCharsets.UTF_8);
            return List.of(mapper.readValue(content, type));
        } catch (IOException e) {
            throw new JsonProcessingException("Error processing JSON file: " + jsonFileName, e);
        }
    }
}

