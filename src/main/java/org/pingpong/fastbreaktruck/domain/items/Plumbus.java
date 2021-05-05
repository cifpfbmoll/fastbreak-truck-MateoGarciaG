package org.pingpong.fastbreaktruck.domain.items;

import org.pingpong.fastbreaktruck.domain.items.types.Toy;

public class Plumbus extends Toy {

    private final String NAME = "Plumbus";
    private final Float PVP = 10.0f;

    public Plumbus() {}

    @Override
    public String name() {
        return this.NAME;
    }

    @Override
    public Float price() {
        return this.PVP;
    }
}
