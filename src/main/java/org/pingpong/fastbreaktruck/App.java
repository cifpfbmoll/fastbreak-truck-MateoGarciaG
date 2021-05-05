package org.pingpong.fastbreaktruck;

import org.pingpong.fastbreaktruck.domain.builders.BreakFastBuilder;
import org.pingpong.fastbreaktruck.domain.builders.Breakfast;

/**
 * @author @dfleta User Github it's the owner of this Main Code, because
 * one of the requirements of the project is put the main code which are
 * the user story through the app. So I only changed the classes and methods names.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * Desayuno Eyeholes
         */

        Breakfast eyeDes = BreakFastBuilder.prepareEyeHoles();
        System.out.println("\nNo abras la caja de Eyeholes!");
        eyeDes.showItems();
        System.out.print("Precio pedido: " + eyeDes.getTotal());

        /**
         * Desayuno Smiggles
         */

        Breakfast smigDes = BreakFastBuilder.prepareSmiggles();
        System.out.println("\nSmiggles per als nins!");
        smigDes.showItems();
        System.out.print("Precio pedido: " + smigDes.getTotal());

        /**
         * Plumbus
         */

//        eyeDes = FastBreakTruck.prepararEyeHoles();
//        FastBreakTruck.incluirJuguete(eyeDes);
//        System.out.println("\nEyeholes con plumbus!");
//        eyeDes.mostrarItems();
//        System.out.print("Precio pedido: " + eyeDes.getCoste());
    }
}
