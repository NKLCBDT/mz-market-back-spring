package com.mz.market.item.repository;

import com.mz.market.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ItemRepository extends JpaRepository<Item, UUID>, CustomItemRepository {
}
