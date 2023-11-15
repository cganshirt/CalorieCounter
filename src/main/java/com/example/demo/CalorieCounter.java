package com.example.demo;

import java.io.*;
import java.text.ParseException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CalorieCounter {

	public static void main(String[] args) throws ParseException, IOException {
		SpringApplication.run(CalorieCounter.class, args);
	}



}