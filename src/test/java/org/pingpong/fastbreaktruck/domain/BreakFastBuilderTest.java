package org.pingpong.fastbreaktruck.domain;

import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pingpong.fastbreaktruck.domain.builders.BreakFastBuilder;
import org.pingpong.fastbreaktruck.domain.builders.Breakfast;
import org.pingpong.fastbreaktruck.domain.items.Eyeholes;
import org.pingpong.fastbreaktruck.domain.items.FleebJuice;
import org.pingpong.fastbreaktruck.domain.items.Smiggles;
import org.pingpong.fastbreaktruck.domain.items.TurbulentJuice;

import java.util.*;

public class BreakFastBuilderTest {

    private Breakfast breakfast = null;
    //private BreakFastBuilder breakFastBuilder = null;

    @Before
    public void setUp() {
        this.breakfast = new Breakfast();
        //this.breakFastBuilder = new BreakFastBuilder();
    }

    @Test
    public void breakFastAddItemTest() {

        this.breakfast.addItem(new Eyeholes());
        this.breakfast.addItem(new TurbulentJuice());

        assertThat(this.breakfast.getItems().size()).isEqualTo(2);
        assertThat(this.breakfast.getItems().get(0).name()).isEqualTo("Eyeholes");
        assertThat(this.breakfast.getItems().get(1).name()).isEqualTo("TurbulentJuice");

        Breakfast breakfastSmiggles = new Breakfast();

        breakfastSmiggles.addItem(new Smiggles());
        breakfastSmiggles.addItem(new FleebJuice());

        assertThat(breakfastSmiggles.getItems().size()).isEqualTo(2);
        assertThat(breakfastSmiggles.getItems().get(0).name()).isEqualTo("Smiggles");
        assertThat(breakfastSmiggles.getItems().get(1).name()).isEqualTo("FleebJuice");


    }

    @Test
    public void breakFastTotalPriceTest() {
        this.breakfast.addItem(new Eyeholes());
        this.breakfast.addItem(new TurbulentJuice());

        assertThat(this.breakfast.getTotal()).isEqualTo(85.0f);

        Breakfast breakfastSmiggles = new Breakfast();

        breakfastSmiggles.addItem(new Smiggles());
        breakfastSmiggles.addItem(new FleebJuice());

        assertThat(breakfastSmiggles.getTotal()).isEqualTo(65.0f);
    }

    @Test
    public void breakFastBuilderTest() {

        Breakfast eyesHolesBf = BreakFastBuilder.prepareEyeHoles();

        assertThat(eyesHolesBf.getItems().size()).isEqualTo(2);
        assertThat(eyesHolesBf.getItems().get(0).name()).isEqualTo("Eyeholes");
        assertThat(eyesHolesBf.getItems().get(1).name()).isEqualTo("TurbulentJuice");

        Breakfast smigglesBf = BreakFastBuilder.prepareSmiggles();

        assertThat(smigglesBf.getItems().size()).isEqualTo(2);
        assertThat(smigglesBf.getItems().get(0).name()).isEqualTo("Smiggles");
        assertThat(smigglesBf.getItems().get(1).name()).isEqualTo("FleebJuice");


    }

    @Test
    public void breakFastBuilderTotalPriceTest() {

        Breakfast eyesHolesBf = BreakFastBuilder.prepareEyeHoles();
        Breakfast smigglesBf = BreakFastBuilder.prepareSmiggles();

        assertThat(eyesHolesBf.getTotal()).isEqualTo(85.0f);
        assertThat(smigglesBf.getTotal()).isEqualTo(65.0f);
    }

}
