package org.pingpong.fastbreaktruck.domain.builders;

import org.pingpong.fastbreaktruck.domain.items.types.Item;

import java.util.ArrayList;
import java.util.List;

public class Breakfast {

    private List<Item> items = new ArrayList<Item>();
    private Float total = 0f;

    public Breakfast() {}

    public void addItem(Item newItem) {
        this.items.add(newItem);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public void showItems() {
        this.items.forEach( i -> {
            System.out.printf("%1$s \n", i.formatterToString());
        });
    }

    public Float getTotal() {
        return this.items.stream().map(Item::price).reduce((float) 0, Float::sum);
    }

}
