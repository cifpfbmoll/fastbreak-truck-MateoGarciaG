package org.pingpong.fastbreaktruck.domain.items.types;

import org.pingpong.fastbreaktruck.domain.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    Float price();

    //Default Method
    default String formatterToString() {

        return String.format("Item: %1$s, Packing: %2$s, Price: %3$f, ", this.name(), this.packing().pack(), this.price());
    }
}
