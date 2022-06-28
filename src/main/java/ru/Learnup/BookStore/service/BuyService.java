package ru.Learnup.BookStore.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.Learnup.BookStore.entity.Buy;
import ru.Learnup.BookStore.repository.BuyRepository;

import java.util.List;

@Service
public class BuyService {

    private final BuyRepository repository;

    public BuyService(BuyRepository repository) {
        this.repository = repository;
    }

    public List<Buy> getBuy() {
        return repository.findAll();
    }

    public Buy findById(int id) {
        return repository.getById(id);
    }

    @Transactional
    public void save(Buy buy) {
        repository.save(buy);
    }

    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
