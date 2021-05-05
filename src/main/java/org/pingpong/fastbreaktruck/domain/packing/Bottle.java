package org.pingpong.fastbreaktruck.domain.packing;

public class Bottle implements Packing {

    public Bottle() {
    }

    @Override
    public String pack() {
        return "Bottle";
    }
}
