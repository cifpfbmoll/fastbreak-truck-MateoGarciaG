package org.pingpong.fastbreaktruck.domain.items;

import org.pingpong.fastbreaktruck.domain.packing.Packing;

public interface Item {
    String name();
    Packing packing();
    Float price();
}
