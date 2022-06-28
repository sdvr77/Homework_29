package ru.Learnup.BookStore.controllers;

import org.springframework.web.bind.annotation.*;
import ru.Learnup.BookStore.entity.Buyer;
import ru.Learnup.BookStore.service.BuyerService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BuyerController {

    private final BuyerService service;

    public BuyerController(BuyerService service) {
        this.service = service;
    }

    @GetMapping("/user")
    public List<Buyer> getAllBuyers() {
        return service.getBuyers();
    }

    @GetMapping("/user/{id}")
    public Buyer getBuyerById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/user")
    public Buyer addNewBuyer(@RequestBody Buyer buyer) {
        service.save(buyer);
        return buyer;
    }

    @PutMapping("/user")
    public Buyer updateBuyer(@RequestBody Buyer buyer) {
        service.save(buyer);
        return buyer;
    }

    @DeleteMapping("/user/{id}")
    public String deleteBuyerById(@PathVariable int id) {
        service.deleteById(id);
        return "Object was delete";
    }
}
