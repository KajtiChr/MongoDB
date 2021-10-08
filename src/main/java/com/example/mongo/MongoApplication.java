package com.example.mongo;

import com.example.mongo.objects.Book;
import com.example.mongo.objects.Borrower;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalDate;

@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
		Book.sprintujCos();
	}

}
