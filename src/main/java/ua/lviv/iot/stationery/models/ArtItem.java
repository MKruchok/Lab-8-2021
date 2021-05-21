package ua.lviv.iot.stationery.models;

import lombok.Data;
import lombok.ToString;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.stationery.enums.DrawingTools;
import ua.lviv.iot.stationery.enums.CustomerType;


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ArtItem extends Item {
    private String color;
    private DrawingTools drawToolType;

    public ArtItem(final String name, final double weight, final double price,
                   final double rating, final CustomerType customerType,
                   final String thisColor, final DrawingTools thisDrawToolType) {
        super(name, weight, price, rating, customerType);
        this.color = thisColor;
        this.drawToolType = thisDrawToolType;
    }
}


