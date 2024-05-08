package com.shoppinglist.shopping.list.app.repository;


import com.shoppinglist.shopping.list.app.entity.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ShoppingItem, Long> {
}