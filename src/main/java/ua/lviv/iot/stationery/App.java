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
        itemManager.addItem(new WritingItem("Vector", 12.5f, 15.5f, 5.0f,
                CustomerType.HIGHSCHOOL, "standard", WritingAids.PEN));
        itemManager.addItem(new WritingItem("MARK", 15.5f, 5.5f, 4.1f,
                CustomerType.HIGHSCHOOL, "none", WritingAids.PENCIL));
        itemManager.addItem(new ArtItem("Dream-pencil", 15.2f, 7.0f, 5.0f,
                CustomerType.JUNIOR, "red", DrawingTools.COLORPENCIL));
        itemManager.addItem(new ArtItem("Cloud-brush", 50.0f, 20.0f, 5.0f,
                CustomerType.JUNIOR, "blue", DrawingTools.BRUSH));
        itemManager.addItem(new MechItem("GOLD", 300.0f, 100.0f, 5.0f,
                CustomerType.STUDENT, "steel", MechanizationTools.STAPLER));
        itemManager.addItem(new MechItem("Holer", 250.0f, 75.0f, 3.7f,
                CustomerType.STUDENT, "plastic", MechanizationTools.HOLEPUNCH));

        System.out.println("Sort by price: ");
        itemManager.printItemList(itemManager.sortByPrice(SortOrder.ASC));
        System.out.println("Sort by rating: ");
        itemManager.printItemList(itemManager.sortByRating(SortOrder.DESC));
        System.out.println("Search by type: ");
        itemManager.printItemList(itemManager.searchByType(CustomerType.JUNIOR));
    }
}
