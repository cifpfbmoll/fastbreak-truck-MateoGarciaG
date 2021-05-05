package org.pingpong.fastbreaktruck.domain;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pingpong.fastbreaktruck.domain.items.Eyeholes;
import org.pingpong.fastbreaktruck.domain.items.FleebJuice;
import org.pingpong.fastbreaktruck.domain.items.Smiggles;
import org.pingpong.fastbreaktruck.domain.items.TurbulentJuice;
import org.pingpong.fastbreaktruck.domain.items.types.Item;

import java.util.*;


public class ItemsTest {

    private Item smiggles = null;
    private Item fleebJuice = null;

    private Item eyeholes = null;
    private Item turbulentJuice = null;

    @Before
    public void setUp() {
        this.smiggles = new Smiggles();
        this.fleebJuice = new FleebJuice();

        this.eyeholes = new Eyeholes();
        this.turbulentJuice = new TurbulentJuice();
    }

    @Test
    public void namesItemsTest() {
        assertThat(this.smiggles.name()).isEqualTo("Smiggles");
        assertThat(this.fleebJuice.name()).isEqualTo("FleebJuice");
        assertThat(this.eyeholes.name()).isEqualTo("Eyeholes");
        assertThat(this.turbulentJuice.name()).isEqualTo("TurbulentJuice");
    }

    @Test
    public void packingBoxItemsTest() {
        assertThat(this.fleebJuice.packing().pack()).isEqualTo("Bottle");
        assertThat(this.turbulentJuice.packing().pack()).isEqualTo("Bottle");
    }

    @Test
    public void packingBottleItemsTest() {
        assertThat(this.smiggles.packing().pack()).isEqualTo("Box");
        assertThat(this.eyeholes.packing().pack()).isEqualTo("Box");
    }

    @Test
    public void priceItemsTest() {

        assertThat(this.smiggles.price()).isEqualTo(40.0f);
        assertThat(this.fleebJuice.price()).isEqualTo(25.0f);
        assertThat(this.eyeholes.price()).isEqualTo(50.0f);
        assertThat(this.turbulentJuice.price()).isEqualTo(35.0f);
    }

}
