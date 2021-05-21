package ua.lviv.iot.stationery.manager;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.stationery.enums.SortOrder;
import ua.lviv.iot.stationery.enums.CustomerType;
import ua.lviv.iot.stationery.models.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public final class StoreItemManager {

    private final List<Item> items = new ArrayList<>();

    public void addItem(final Item item) {
        this.items.add(item);
    }

    public List<Item> sortByRating(final SortOrder order) {
        if (order == SortOrder.ASC) {
            items.sort(Comparator.comparing(Item::getRating));
        } else {
            items.sort(Comparator.comparing(Item::getRating).reversed());
        }
        return items;
    }

    public List<Item> sortByPrice(final SortOrder order) {
        if (order == SortOrder.ASC) {
            items.sort(Comparator.comparing(Item::getPrice));
        } else {
            items.sort(Comparator.comparing(Item::getPrice).reversed());
        }
        return items;
    }

    public List<Item> searchByType(final CustomerType customerType) {
        return items.stream()
                .filter(item -> item.getCustomerType().equals(customerType))
                .collect(Collectors.toList());
    }

    public void printItemList(final List<Item> itemList) {
        itemList.forEach(System.out::println);
    }
}
