package ua.lviv.iot.stationery.models;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ua.lviv.iot.stationery.enums.CustomerType;
import ua.lviv.iot.stationery.enums.WritingAids;


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WritingItem extends Item {
    private String inkType;
    private WritingAids writingAid;

    public WritingItem(final String name, final double weight, final double price,
                       final double rating, final CustomerType customerType,
                       final String thisInkType, final WritingAids thisWritingAid) {
        super(name, weight, price, rating, customerType);
        this.inkType = thisInkType;
        this.writingAid = thisWritingAid;
    }
}
