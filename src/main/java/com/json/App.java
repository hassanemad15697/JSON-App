package com.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.json.model.Person;
import com.json.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
    	ObjectMapper mapper = new ObjectMapper();
    	User user = mapper.readValue(new File("info/User.json"), User.class);
    	Person person = mapper.readValue(new File("info/Person.json"), Person.class);
    	
    	
    	
        System.out.println( person.getId()+" , "+person.getPhone().getCode()+" "+person.getPhone().getPh());
    }
}