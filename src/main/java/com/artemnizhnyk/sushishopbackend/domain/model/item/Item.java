package com.artemnizhnyk.sushishopbackend.domain.model.item;

import com.artemnizhnyk.sushishopbackend.domain.model.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Getter
@Setter
@Table(name = "items")
@Entity
public class Item extends BaseEntity {

    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "description")
    private String description;
    @Enumerated(EnumType.STRING)
    @Column(name = "item_type", nullable = false)
    private ItemType itemType;
    @Column(name = "quantity", nullable = false)
    private Integer quantity;
    @Column(name = "priority")
    private Integer priority;
    @Column(name = "actual-price", nullable = false)
    private Float actualPrice;
    @Column(name = "old-price")
    private Float oldPrice;
    @Column(name = "is_on_sale", nullable = false)
    private Boolean isOnSale;
    @Column(name = "image_url")
    private String imageUrl;
}
