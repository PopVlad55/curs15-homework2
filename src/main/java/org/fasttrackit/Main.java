package org.fasttrackit;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Clothes shirt = new Clothes("Shirt", 50, Category.ON_SALE);
        Clothes pants = new Clothes("Pants", 40, Category.NEW);
        Electronics lamp = new Electronics("Lamp", 25, Category.REFURBISHED);
        Fruits apple = new Fruits("Apple", 2, Category.NEW);

        Shop<Clothes> clothesShop = new Shop<>();
        clothesShop.addItem(shirt);
        clothesShop.addItem(pants);

        List<Clothes> newClothes = clothesShop.findByCategory(Category.NEW);
        System.out.println("New clothes: "+ newClothes);

        // find by name
        Clothes foundItem = clothesShop.findByName("Pants");
        System.out.println("Item found: " + foundItem);

        // remove item
        Clothes removedItem = clothesShop.removeItem("Shirt");
        System.out.println("Removed: " + removedItem);

        Shop<ShopItem> genericShop = new Shop<>();
        genericShop.addItem(shirt);
        genericShop.addItem(lamp);
        genericShop.addItem(pants);
        genericShop.addItem(apple);

        // find with lower price
        List<ShopItem> priceLowerThan = genericShop.findWithLowerPrice(40);
        System.out.println("Items with price lower than 40: " + priceLowerThan);

        // find refurbished items
        List<ShopItem> refurbishedItems = genericShop.findRefurbishedItems();
        System.out.println("Refurbished items: " + refurbishedItems);

        // find new items
        List<ShopItem> newItems = genericShop.findNewItems();
        System.out.println("New items: " + newItems);
    }
}
