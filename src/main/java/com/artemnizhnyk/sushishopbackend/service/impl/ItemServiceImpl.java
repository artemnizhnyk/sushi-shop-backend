package com.artemnizhnyk.sushishopbackend.service.impl;

import com.artemnizhnyk.sushishopbackend.domain.model.item.Item;
import com.artemnizhnyk.sushishopbackend.repository.ItemRepository;
import com.artemnizhnyk.sushishopbackend.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public List<Item> fetchAll() {
        List<Item> allItems = itemRepository.findAll();
        return allItems.isEmpty()
                ? new ArrayList<>()
                : allItems;
    }
}
