package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.BookCreateDTO;
import com.example.demo.entity.BookEntity;
import com.example.demo.entity.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Integer insert(BookCreateDTO bookCreateDTO) {
        BookEntity book = new BookEntity();
            book.setTitle(bookCreateDTO.getTitle());
            book.setPrice(bookCreateDTO.getPrice());
        this.bookRepository.save(book);
        return book.getBookId();
    }

    public List<BookEntity> getList() {
        return this.bookRepository.findAll();
    }

}
