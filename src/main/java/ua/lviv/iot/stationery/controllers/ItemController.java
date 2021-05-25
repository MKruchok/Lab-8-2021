package ua.lviv.iot.stationery.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import ua.lviv.iot.stationery.models.Item;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RequestMapping(path = "/item")
@RestController
public final class ItemController {
    private int counter = 0;
    private final Map<Integer, Item> items = new HashMap<>();

    @PostMapping
    public ResponseEntity<Object> addItem(@RequestBody final Item item) {
        item.setId(counter++);
        items.put(item.getId(), item);
        return ResponseEntity.ok(Collections.singletonMap("id", item.getId()));
    }

    @GetMapping
    public  Collection<Item> getItems() {
        return items.values();
    }

    @GetMapping(path = "{id}")
    public  ResponseEntity<Item> getItem(@PathVariable("id") final int id) {
        Item item = items.get(id);
        if (item != null) {
            return ResponseEntity.ok(item);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "{id}")
    public  ResponseEntity<Object> deleteItem(@PathVariable("id") final int id) {
        Item item = items.get(id);
        if (item != null) {
            items.remove(id);
            return ResponseEntity.ok(Collections.singletonMap("id", id));
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Item> updateItem(@RequestBody final Item newItem, @PathVariable("id") final int id) {
        Item oldItem = items.get(id);
        if (oldItem != null) {
            newItem.setId(id);
            items.replace(id, newItem);
            return ResponseEntity.ok(oldItem);
        }
        return ResponseEntity.notFound().build();
    }
}
