package org.pingpong.fastbreaktruck.domain.items;

import org.pingpong.fastbreaktruck.domain.items.types.Drink;

public class FleebJuice extends Drink {

    private final String NAME = "FleebJuice";
    private final Float PVP = 25.0f;

    public FleebJuice() {}

    @Override
    public String name() {
        return this.NAME;
    }

    @Override
    public Float price() {
        return this.PVP;
    }

}
