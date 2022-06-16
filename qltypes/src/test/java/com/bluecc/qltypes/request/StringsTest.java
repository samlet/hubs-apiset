package com.bluecc.qltypes.request;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.util.List;

public class StringsTest {
    ObjectMapper objectMapper=new ObjectMapper();

    @Test
    public void test_getValue() throws JsonProcessingException {
        var strings=new Strings().setValue(List.of("key1"));
        String json=objectMapper.writeValueAsString(strings);
        System.out.println(json);
        var result=objectMapper.readValue(json, Strings.class);
        System.out.println(result);
    }
}