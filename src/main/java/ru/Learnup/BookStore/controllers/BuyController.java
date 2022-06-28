package ru.Learnup.BookStore.controllers;

import org.springframework.web.bind.annotation.*;
import ru.Learnup.BookStore.entity.Buy;
import ru.Learnup.BookStore.service.BuyService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BuyController {

    private final BuyService service;

    public BuyController(BuyService service) {
        this.service = service;
    }

    @GetMapping("/buy")
    public List<Buy> getAllBuy() {
        return service.getBuy();
    }

    @GetMapping("/buy/{id}")
    public Buy getBuyById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/buy")
    public Buy addNewBuy(@RequestBody Buy buy) {
        service.save(buy);
        return buy;
    }

    @PutMapping("/buy")
    public Buy updateBuy(@RequestBody Buy buy) {
        service.save(buy);
        return buy;
    }

    @DeleteMapping("/buy/{id}")
    public String deleteBuyById(@PathVariable int id) {
        service.deleteById(id);
        return "Object was delete";
    }
}
