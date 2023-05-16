package com.sparta.aa.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class OldApp {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectMapper xmlMapper = new XmlMapper();
        try {
            ArrayList<Boolean> flags = new ArrayList<>(Arrays.asList(true, false, false, true));
            Spartan manish = new Spartan("Manish", "Java", flags);
            String output = mapper.writeValueAsString(manish);
            String xmlOutput = xmlMapper.writeValueAsString(manish);


            FileWriter writer = new FileWriter("src/main/java/com/sparta/aa/output/output.json");

            FileWriter xmlWriter = new FileWriter("src/main/java/com/sparta/aa/output/output.xml");
            writer.write(output);
            xmlWriter.write(xmlOutput);
            writer.close();
            xmlWriter.close();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}