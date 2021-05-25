package ua.lviv.iot.stationery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.stationery.models.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Integer> {
}
