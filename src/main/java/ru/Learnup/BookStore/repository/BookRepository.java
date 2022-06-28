package ru.Learnup.BookStore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.Learnup.BookStore.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
