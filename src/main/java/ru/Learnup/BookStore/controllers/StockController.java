package ru.Learnup.BookStore.controllers;

import org.springframework.web.bind.annotation.*;
import ru.Learnup.BookStore.entity.Stock;
import ru.Learnup.BookStore.service.StockService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StockController {

    private final StockService service;

    public StockController(StockService service) {
        this.service = service;
    }

    @GetMapping("/books")
    public List<Stock> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/books/{id}")
    public Stock getBooksById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/books")
    public Stock addNewBook(@RequestBody Stock stock) {
        service.save(stock);
        return stock;
    }

    @PutMapping("/books")
    public Stock updateBook(@RequestBody Stock stock) {
        service.save(stock);
        return stock;
    }

    @DeleteMapping("/books/{id}")
    public String deleteBooksById(@PathVariable int id) {
        service.deleteById(id);
        return "Object was delete";
    }

}
