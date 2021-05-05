package org.pingpong.fastbreaktruck.domain.items.types;

import org.pingpong.fastbreaktruck.domain.packing.Box;
import org.pingpong.fastbreaktruck.domain.packing.Packing;

public abstract class Toy implements Item {

    public Toy() {}

    @Override
    public Packing packing() {
        return new Box();
    }

    @Override
    public String toString() {
        return this.formatterToString();
    }
}
