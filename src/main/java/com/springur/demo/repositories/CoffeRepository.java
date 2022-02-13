package com.springur.demo.repositories;

import com.springur.demo.domain.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeRepository extends CrudRepository<Coffee, String> {
}
