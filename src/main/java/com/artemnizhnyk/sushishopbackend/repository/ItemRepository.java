package com.artemnizhnyk.sushishopbackend.repository;

import com.artemnizhnyk.sushishopbackend.domain.model.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
