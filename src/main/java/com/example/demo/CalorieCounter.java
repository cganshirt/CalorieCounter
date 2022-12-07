package com.example.demo;

import java.io.*;
import java.text.ParseException;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CalorieCounter {

	public static void main(String[] args) throws ParseException, IOException {
		SpringApplication.run(CalorieCounter.class, args);
		readFoodData("src/main/resources/static/Food_Display_Table.csv");

	}

	public static HashMap<String, HashMap<String, String>> readFoodData(String FileName) throws ParseException, IOException{
		BufferedReader br = new BufferedReader(new FileReader(FileName));
		String line = null;
		HashMap<String, HashMap<String, String>> food = new HashMap<String, HashMap<String, String>>();

		line = br.readLine();
		if(line == null) {
			return new HashMap<String, HashMap<String, String>>();
		}
		String headers[] = line.split(",");
		while((line = br.readLine()) != null) {
			String entries[] = line.split(",");
			HashMap<String, String> map = new HashMap<String, String>();
			for(int i = 1; i < entries.length; i++) {
				map.put(headers[i], entries[i]);

			}
			food.put(entries[1], map);
		}

		return food;
	}

}