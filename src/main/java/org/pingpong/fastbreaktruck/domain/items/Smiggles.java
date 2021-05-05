package org.pingpong.fastbreaktruck.domain.items;

import org.pingpong.fastbreaktruck.domain.items.types.Cereals;

public class Smiggles extends Cereals {
    private final String NAME = "Smiggles";
    private final Float PVP = 40.0f;

    public Smiggles() {}

    @Override
    public String name() {
        return this.NAME;
    }

    @Override
    public Float price() {
        return this.PVP;
    }
}
