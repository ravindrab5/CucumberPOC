package entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GsonTester {
  public static void main(String[] args) throws IOException {

    ObjectMapper objectMapper = new ObjectMapper();


    objectMapper.configure(
            DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);


    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

    InputStream input = new FileInputStream("./folders.setup");

    TestDataSetup[] userArray = objectMapper.readValue(input, TestDataSetup[].class);

    System.out.println(Arrays.stream(userArray)
            .flatMap(testDataSetup -> Optional.ofNullable(testDataSetup.getProjects()).map(Collection::stream).orElseGet(Stream::empty))
            .flatMap(proj -> Optional.ofNullable(proj.getMembers()).map(Collection::stream).orElseGet(Stream::empty)).map(members -> members.getEmail())
            .collect(Collectors.toSet()));


  }

  public static Stream<String> collectionToStream(Collection<String> collection) {
    return Optional.ofNullable(collection)
            .map(Collection::stream)
            .orElseGet(Stream::empty);
  }
}
