package com.example.demo;

import java.io.*;
import java.text.ParseException;
import java.util.*;

import com.example.demo.Item.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class CalorieCounter {

	public static void main(String[] args) throws ParseException, IOException {
		SpringApplication.run(CalorieCounter.class, args);
		HashMap<String, Item> food = readFoodData("src/main/resources/static/Food_Display_Table.csv");


	}

	public static HashMap<String, Item> readFoodData(String FileName) throws ParseException, IOException{
		BufferedReader br = new BufferedReader(new FileReader(FileName));
		String line = null;
		HashMap<String, Item> food = new HashMap<String, Item>();
		line = br.readLine();
		if(line == null) {
			return new HashMap<String, Item>();
		}
		String headers[] = line.split(",");
		while((line = br.readLine()) != null) {
			String entries[] = line.split(",");
			Item temp = new Item(entries[1], Integer.valueOf(entries[3]), entries[4], Integer.valueOf(entries[24]));
			food.put(entries[1], temp);
		}
		return food;
	}

}