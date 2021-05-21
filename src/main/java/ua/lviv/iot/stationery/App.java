package ua.lviv.iot.stationery;

import ua.lviv.iot.stationery.enums.CustomerType;
import ua.lviv.iot.stationery.enums.DrawingTools;
import ua.lviv.iot.stationery.enums.SortOrder;
import ua.lviv.iot.stationery.enums.WritingAids;
import ua.lviv.iot.stationery.enums.MechanizationTools;
import ua.lviv.iot.stationery.manager.StoreItemManager;
import ua.lviv.iot.stationery.models.ArtItem;
import ua.lviv.iot.stationery.models.MechItem;
import ua.lviv.iot.stationery.models.WritingItem;


public final class App {
    private App() { }
    public static void main(final String[] args) {
        StoreItemManager itemManager = new StoreItemManager();
        itemManager.addItem(new WritingItem("Vector", 12.5, 15.5, 5.0,
                CustomerType.HIGHSCHOOL, "standard", WritingAids.PEN));
        itemManager.addItem(new WritingItem("MARK", 15.5, 5.5, 4.1,
                CustomerType.HIGHSCHOOL, "none", WritingAids.PENCIL));
        itemManager.addItem(new ArtItem("Dream-pencil", 15.2, 7.0, 5.0,
                CustomerType.JUNIOR, "red", DrawingTools.COLORPENCIL));
        itemManager.addItem(new ArtItem("Cloud-brush", 50.0, 20.0, 5.0,
                CustomerType.JUNIOR, "blue", DrawingTools.BRUSH));
        itemManager.addItem(new MechItem("GOLD", 300.0, 100.0, 5.0,
                CustomerType.STUDENT, "steel", MechanizationTools.STAPLER));
        itemManager.addItem(new MechItem("Holer", 250.0, 75.0, 3.7,
                CustomerType.STUDENT, "plastic", MechanizationTools.HOLEPUNCH));

        System.out.println("Sort by price: ");
        itemManager.printItemList(itemManager.sortByPrice(SortOrder.ASC));
        System.out.println("Sort by rating: ");
        itemManager.printItemList(itemManager.sortByRating(SortOrder.DESC));
        System.out.println("Search by type: ");
        itemManager.printItemList(itemManager.searchByType(CustomerType.JUNIOR));
    }
}
