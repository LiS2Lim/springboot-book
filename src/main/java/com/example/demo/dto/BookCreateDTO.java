package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
public class BookCreateDTO {
    @NonNull
    private String title;

    @NonNull
    private Integer price;
}
