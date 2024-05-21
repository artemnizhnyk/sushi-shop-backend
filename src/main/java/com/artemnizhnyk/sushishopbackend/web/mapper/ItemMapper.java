package com.artemnizhnyk.sushishopbackend.web.mapper;

import com.artemnizhnyk.sushishopbackend.domain.model.item.Item;
import com.artemnizhnyk.sushishopbackend.web.dto.ItemDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ItemMapper extends Mappable<Item, ItemDto> {
}
