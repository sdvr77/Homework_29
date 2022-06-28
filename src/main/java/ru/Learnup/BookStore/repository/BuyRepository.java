package ru.Learnup.BookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.Learnup.BookStore.entity.Buy;

@Repository
public interface BuyRepository extends JpaRepository<Buy, Integer> {
}
