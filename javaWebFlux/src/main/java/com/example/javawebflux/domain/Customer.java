package com.example.javawebflux.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@RequiredArgsConstructor
public class Customer {

    @Id
    private long id;

    private final String firstname;

    private final String lastname;
}
