package ru.Learnup.BookStore.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.Learnup.BookStore.entity.Author;
import ru.Learnup.BookStore.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> getAuthors() {
        return repository.findAll();
    }

    public Author findById(int id) {
        return repository.getById(id);
    }

    @Transactional
    public void save(Author author) {
        repository.save(author);
    }

    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
