package ua.lviv.iot.stationery.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.stationery.enums.CustomerType;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Data
@Entity
@NoArgsConstructor
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double weight;
    private double price;
    private double rating;
    private CustomerType customerType;

    public Item(final String thisName, final double thisWeight, final double thisPrice,
                final double thisRating, final CustomerType thisCustomerType) {
        this.name = thisName;
        this.weight = thisWeight;
        this.price = thisPrice;
        this.rating = thisRating;
        this.customerType = thisCustomerType;
    }

}
