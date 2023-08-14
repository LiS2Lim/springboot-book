package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookCreateDTO;
import com.example.demo.service.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/book/create")
    public String insert(BookCreateDTO bookCreateDTO) {
        Integer bookId = this.bookService.insert(bookCreateDTO);
        return String.format("redirect:/book/read/%s", bookId);
    }

    @GetMapping("/book/list")
    public String list() {
        String result = this.bookService.getList().toString();
        System.out.println(result);
        return "list";
    }
}
