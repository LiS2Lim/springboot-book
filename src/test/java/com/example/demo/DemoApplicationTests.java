package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.BookEntity;
import com.example.demo.entity.BookRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private BookRepository bookRepository;

	@Test
	void testing() {
		List<BookEntity> books = this.bookRepository.findAll();
		assertEquals(2, books.size());
	}

}
