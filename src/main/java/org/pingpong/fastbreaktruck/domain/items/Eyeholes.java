package org.pingpong.fastbreaktruck.domain.items;

import org.pingpong.fastbreaktruck.domain.items.types.Cereals;

public class Eyeholes extends Cereals {

    private final String NAME = "Eyeholes";
    private final Float PVP = 50.0f;

    public Eyeholes() {}

    @Override
    public String name() {
        return this.NAME;
    }

    @Override
    public Float price() {
        return this.PVP;
    }
}
