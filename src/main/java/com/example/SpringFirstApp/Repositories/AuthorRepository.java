package com.example.SpringFirstApp.Repositories;

import com.example.SpringFirstApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
