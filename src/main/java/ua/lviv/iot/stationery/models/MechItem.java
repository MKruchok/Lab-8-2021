package ua.lviv.iot.stationery.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.stationery.enums.CustomerType;
import ua.lviv.iot.stationery.enums.MechanizationTools;


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MechItem extends Item {
    private String material;
    private MechanizationTools mechItemType;

    public MechItem(final String name, final double weight, final double price,
                    final double rating, final CustomerType customerType,
                    final String thisMaterial, final MechanizationTools thisMechItemType) {
        super(name, weight, price, rating, customerType);
        this.material = thisMaterial;
        this.mechItemType = thisMechItemType;
    }
}
