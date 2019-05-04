package com.example.SpringFirstApp.Repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.SpringFirstApp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
