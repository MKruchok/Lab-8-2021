package ua.lviv.iot.stationery.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import ua.lviv.iot.stationery.enums.CustomerType;

@Data
@NoArgsConstructor
public abstract class Item {
    private String name;
    private float weight;
    private float price;
    private float rating;
    private CustomerType customerType;

    public Item(final String thisName, final float thisWeight, final float thisPrice,
                final float thisRating, final CustomerType thisCustomerType) {
        this.name = thisName;
        this.weight = thisWeight;
        this.price = thisPrice;
        this.rating = thisRating;
        this.customerType = thisCustomerType;
    }
}
