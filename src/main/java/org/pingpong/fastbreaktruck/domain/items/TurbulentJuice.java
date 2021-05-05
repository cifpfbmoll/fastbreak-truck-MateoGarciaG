package org.pingpong.fastbreaktruck.domain.items;

import org.pingpong.fastbreaktruck.domain.items.types.Drink;

public class TurbulentJuice extends Drink {

    private final String NAME = "TurbulentJuice";
    private final Float PVP = 35.0f;

    public TurbulentJuice() {}

    @Override
    public String name() {
        return this.NAME;
    }

    @Override
    public Float price() {
        return this.PVP;
    }
}
