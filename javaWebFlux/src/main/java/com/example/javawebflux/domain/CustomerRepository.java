package com.example.javawebflux.domain;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository {

    @Query("SELECT * FROM customer where last_name = :lastname")
    Flux<Customer> findByLastname(String lastname);
}
