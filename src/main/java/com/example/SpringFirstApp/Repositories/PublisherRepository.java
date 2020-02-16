package com.example.SpringFirstApp.Repositories;

import com.example.SpringFirstApp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
