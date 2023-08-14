package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.BookCreateDTO;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
    void save(BookCreateDTO bookCreateDTO);
}
