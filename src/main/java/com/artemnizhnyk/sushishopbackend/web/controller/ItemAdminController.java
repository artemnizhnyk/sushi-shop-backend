package com.artemnizhnyk.sushishopbackend.web.controller;

import com.artemnizhnyk.sushishopbackend.domain.model.item.Item;
import com.artemnizhnyk.sushishopbackend.service.ItemService;
import com.artemnizhnyk.sushishopbackend.web.dto.ItemDto;
import com.artemnizhnyk.sushishopbackend.web.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/admin/items")
@RestController
class ItemAdminController {

    private final ItemService itemService;
    private final ItemMapper itemMapper;

    @PostMapping("/")
    ItemDto addItem(@RequestBody ItemDto itemDto) {
        Item item = itemMapper.toEntity(itemDto);
        return itemMapper.toDto(itemService.createItem(item));
    }
}
