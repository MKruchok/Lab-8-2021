package ua.lviv.iot.stationery.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.stationery.enums.CustomerType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
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
