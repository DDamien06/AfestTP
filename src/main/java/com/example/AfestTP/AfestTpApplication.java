package com.example.AfestTP;

import com.example.AfestTP.models.Author;
import com.example.AfestTP.models.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AfestTpApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfestTpApplication.class, args);
	}

	Author author1 = new Author("jean","pierre");

}
