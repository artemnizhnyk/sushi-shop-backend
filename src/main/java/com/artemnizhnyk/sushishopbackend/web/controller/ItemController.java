package com.artemnizhnyk.sushishopbackend.web.controller;

import com.artemnizhnyk.sushishopbackend.domain.model.item.Item;
import com.artemnizhnyk.sushishopbackend.service.ItemService;
import com.artemnizhnyk.sushishopbackend.web.dto.ItemDto;
import com.artemnizhnyk.sushishopbackend.web.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/items")
@RestController
public class ItemController {

    private final ItemService itemService;
    private final ItemMapper itemMapper;

    @GetMapping("/")
    List<ItemDto> fetchAll() {
        List<Item> items = itemService.fetchAll();
        return itemMapper.toDto(items);
    }
}
