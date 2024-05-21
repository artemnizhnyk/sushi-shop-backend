package com.artemnizhnyk.sushishopbackend.web.dto;

import com.artemnizhnyk.sushishopbackend.domain.model.item.ItemType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ItemDto {

    private String uuid;
    private String description;
    private ItemType itemType;
    private Float actualPrice;
    private Float oldPrice;
    private Boolean isOnSale;
    private String imageUrl;
}
