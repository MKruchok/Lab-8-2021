package ua.lviv.iot.stationery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
import ua.lviv.iot.stationery.service.ItemService;
import java.util.List;


@RequestMapping(path = "/item")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public Item addItem(@RequestBody final Item item) {
        return itemService.addItem(item);
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }

    @GetMapping(path = "{id}")
    public  Object getItem(@PathVariable("id") final int id) {
        if (itemService.getItem(id) != null) {
            return itemService.getItem(id);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "{id}")
    public  Object deleteItem(@PathVariable("id") final int id) {
        if (itemService.getItem(id) != null) {
            return itemService.deleteItem(id);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping()
    public Object updateItem(@RequestBody final Item item) {
        if (itemService.getItem(item.getId()) != null) {
            return itemService.updateItem(item);
        }
        return ResponseEntity.notFound().build();
    }
}
