package com.json;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
    	
    	
        System.out.println( user.getId()+" , "+user.getName()+" , "+user.getAddress()+" , "+user.getCourses()[0]);
    }
}
