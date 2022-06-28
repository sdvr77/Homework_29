package ru.Learnup.BookStore.controllers;

import org.springframework.web.bind.annotation.*;
import ru.Learnup.BookStore.entity.Author;
import ru.Learnup.BookStore.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AuthorController {

    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @GetMapping("/author")
    public List<Author> getAllAuthors() {
        return service.getAuthors();
    }

    @GetMapping("/author/{id}")
    public Author getAuthorById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/author")
    public Author addNewBook(@RequestBody Author author) {
        service.save(author);
        return author;
    }

    @PutMapping("/author")
    public Author updateBook(@RequestBody Author author) {
        service.save(author);
        return author;
    }

    @DeleteMapping("/author/{id}")
    public String deleteAuthorById(@PathVariable int id) {
        service.deleteById(id);
        return "Object was delete";
    }

}
