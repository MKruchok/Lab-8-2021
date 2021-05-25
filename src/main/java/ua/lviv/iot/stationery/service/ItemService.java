package ua.lviv.iot.stationery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.stationery.models.Item;
import ua.lviv.iot.stationery.repository.ItemRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item addItem(final Item item) {
        itemRepository.save(item);
        return item;
    }

    public List<Item> getAllItems() {
        return (List<Item>) itemRepository.findAll();
    }

    public Item getItem(final Integer id) {
        return itemRepository.findById(id).orElse(null);
    }

    public Item updateItem(final Item item) {
        itemRepository.save(item);
        return item;
    }

    public Item deleteItem(final Integer id) {
        Item item = itemRepository.findById(id).orElse(null);
        itemRepository.deleteById(id);
        return item;
    }
}
