package org.pingpong.fastbreaktruck.domain.packing;

public class Box implements Packing {

    public Box() {
    }

    @Override
    public String pack() {
        return "Box";
    }
}
