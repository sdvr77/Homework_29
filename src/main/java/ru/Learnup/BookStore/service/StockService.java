package ru.Learnup.BookStore.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.Learnup.BookStore.entity.Stock;
import ru.Learnup.BookStore.repository.StockRepository;

import java.util.List;

@Service
public class StockService {

    private final StockRepository repository;

    public StockService(StockRepository repository) {
        this.repository = repository;
    }

    public List<Stock> getBooks() {
        return repository.findAll();
    }

    public Stock findById(int id) {
        return repository.getById(id);
    }

    @Transactional
    public void save(Stock stock) {
        repository.save(stock);
    }

    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
