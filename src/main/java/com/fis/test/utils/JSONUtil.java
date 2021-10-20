package com.fis.test.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONUtil {
	
	private File jsonFile;
public JSONUtil(File file)
{
	jsonFile = file;
}
public String readJson(String key)
{
	String value =null;
	try {
		FileReader reader = new FileReader(jsonFile);
		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(reader);
		value = (String) obj.get(key);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return value;
}
}
