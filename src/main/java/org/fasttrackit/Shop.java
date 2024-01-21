package org.fasttrackit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Shop<T extends  ShopItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item){
        items.add(item);
    }

    public List<T> findByCategory(Category cat){
        List<T> result = new ArrayList<>();
        for(T item : items){
            if(item.category() == cat){
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (item.price() <= maxPrice) {
                result.add(item);
            }
        }
        return result;
    }

    public T findByName(String name){
        for(T item : items){
            if(item.name().equals(name)){
                return item;
            }
        }
        return null;
    }

    public T removeItem(String name){
        T removedIItem = null;
        for (T item : items){
            if (item.name().equals(name)){
                removedIItem = item;
                items.remove(item);
                break;
            }
        }
        return  removedIItem;
    }

    public List<T> findRefurbishedItems(){
        List<T> result = new ArrayList<>();
        for(T item : items){
            if(item.category() == Category.REFURBISHED){
                result.add(item);
            }
        }
        return result;
    }

    public List<T> findNewItems(){
        List<T> result = new ArrayList<>();
        for(T item : items){
            if(item.category() == Category.NEW){
                result.add(item);
            }
        }
        return result;
    }
}
