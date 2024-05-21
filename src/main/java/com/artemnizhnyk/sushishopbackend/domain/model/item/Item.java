package com.artemnizhnyk.sushishopbackend.domain.model.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Table(name = "items")
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "uuid")
    private String uuid = UUID.randomUUID().toString();
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
