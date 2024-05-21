package com.artemnizhnyk.sushishopbackend.service;

import com.artemnizhnyk.sushishopbackend.domain.model.item.Item;

import java.util.List;

public interface ItemService {

    List<Item> fetchAll();

    Item createItem(Item item);
}
