package org.pingpong.fastbreaktruck.domain.builders;

import org.pingpong.fastbreaktruck.domain.items.*;

public class BreakFastBuilder {

    public static Breakfast prepareEyeHoles() {
        Breakfast eyeHolesBf = new Breakfast();
        eyeHolesBf.addItem(new Eyeholes());
        eyeHolesBf.addItem(new TurbulentJuice());

        return eyeHolesBf;
    }

    public static Breakfast prepareSmiggles() {
        Breakfast smigglesBf = new Breakfast();
        smigglesBf.addItem(new Smiggles());
        smigglesBf.addItem(new FleebJuice());

        return smigglesBf;
    }

    public static void addToy(Breakfast breakfast) {
        breakfast.addItem(new Plumbus());
    }
}
