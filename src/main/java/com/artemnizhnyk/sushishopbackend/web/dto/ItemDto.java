package com.artemnizhnyk.sushishopbackend.web.dto;

import com.artemnizhnyk.sushishopbackend.domain.model.item.ItemType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {


    //    @JsonProperty(access = JsonProperty.Access.READ_ONLY, defaultValue = " ")
    private String uuid;
    private String name;
    private String description;
    private ItemType itemType;
    private Integer quantity;
    private Integer priority;
    private Float actualPrice;
    private Float oldPrice;
    private Boolean isOnSale;
    private String imageUrl;
}
