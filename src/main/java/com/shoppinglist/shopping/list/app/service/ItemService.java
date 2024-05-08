package com.shoppinglist.shopping.list.app.service;


import com.shoppinglist.shopping.list.app.entity.ShoppingItem;
import com.shoppinglist.shopping.list.app.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<ShoppingItem> getAllItems() {
        return itemRepository.findAll();
    }

    public Optional<ShoppingItem> getItemById(Long id) {
        return itemRepository.findById(id);
    }

    public ShoppingItem addItem(ShoppingItem item) {
        return itemRepository.save(item);
    }

    public ShoppingItem updateItem(Long id, ShoppingItem newItem) {
        if (itemRepository.existsById(id)) {
            newItem.setId(id);
            return itemRepository.save(newItem);
        } else {
            return null; // or throw NotFoundException
        }
    }

    public boolean deleteItem(Long id) {
        if (itemRepository.existsById(id)) {
            itemRepository.deleteById(id);
            return true;
        } else {
            return false; // or throw NotFoundException
        }
    }
}