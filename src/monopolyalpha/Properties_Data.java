/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolyalpha;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Harsh, Karmit
 */
public class Properties_Data {

    public int price, priceHouse, rent1, rent2, rent3, rent4, rentH;
    public boolean owned, buyable;
    public int owner;
    public String thm, desc1, desc2, type;
    public Color colour;
    public ImageIcon cardIcon;

    //Chance and community stuff
    public String chance[] = new String[16];
    public String chanceActs[] = new String[16];
    public int chanceVals[] = new int[16], chancePos[] = new int[16];
    public String comm[] = new String[16];
    public String commActs[] = new String[16];
    public int commVals[] = new int[16], commPos[] = new int[16];
    public String name;
    Properties_Data prop[] = new Properties_Data[36];

    public Properties_Data() {
        this.thm = Board.theme;
    }

    public void GetProp(String thm) {
        System.out.println(thm);
        switch (thm) {
            case "Canada": {
                Canada_Data can = new Canada_Data();
                can.setProp();
                can.getCards();
                //Chance and community stuff                   
                chance = can.chance.clone();
                chanceActs = can.chanceActs.clone();
                chanceVals = can.chanceVals.clone();
                chancePos = can.chancePos.clone();
                comm = can.comm.clone();
                commActs = can.commActs.clone();
                commVals = can.commVals.clone();
                commPos = can.commPos.clone();
                for (int i = 0; i < 36; i++) {
                    prop[i] = new Properties_Data();
                    prop[i].name = can.property[i].propName;
                    prop[i].price = can.property[i].price;
                    prop[i].rent1 = can.property[i].rent1;
                    prop[i].rent2 = can.property[i].rent2;
                    prop[i].rent3 = can.property[i].rent3;
                    prop[i].rent4 = can.property[i].rent4;
                    prop[i].rentH = can.property[i].rentH;
                    prop[i].colour = can.property[i].colour;
                    prop[i].priceHouse = can.property[i].priceHouse;
                    prop[i].desc1 = can.property[i].desc1;
                    prop[i].desc2 = can.property[i].desc2;
                    prop[i].owner = -1;
                    prop[i].owned = false;
                    prop[i].buyable = can.property[i].buyable;
                    prop[i].cardIcon = can.property[i].cardIcon;
                    prop[i].type = can.property[i].type;
//                System.out.println("TEST PROPERTY NAME: " + prop[i].name);//REMOVE AFTER
//                System.out.println(prop[i].price + " " + prop[i].rent1 + " " + prop[i].rent2 + " " + prop[i].rent3 + " " + prop[i].rent4 + " " + prop[i].rentH + " " + prop[i].colour);//REMOVE AFTER
                }
                break;
            }
            case "Generic": {
                Generic_Data gen = new Generic_Data();//change to generic
                gen.setProp();//same as above
//                 chance = gen.chance.clone();
//                chanceActs = gen.chanceActs.clone();
//                chanceVals = gen.chanceVals.clone();
//                chancePos = gen.chancePos.clone();
//                comm = gen.comm.clone();
//                commActs = gen.commActs.clone();
//                commVals = gen.commVals.clone();
//                commPos = gen.commPos.clone();
                for (int i = 0; i < prop.length; i++) {
                    prop[i] = new Properties_Data();
                    prop[i].name = gen.property[i].propName;
                    prop[i].price = gen.property[i].price;
                    prop[i].rent1 = gen.property[i].rent1;
                    prop[i].rent2 = gen.property[i].rent2;
                    prop[i].rent3 = gen.property[i].rent3;
                    prop[i].rent4 = gen.property[i].rent4;
                    prop[i].rentH = gen.property[i].rentH;
                    prop[i].priceHouse = gen.property[i].priceHouse;
                    prop[i].colour = gen.property[i].colour;
                    prop[i].owner = -1;
                    prop[i].owned = false;
                    prop[i].type = gen.property[i].type;
                    prop[i].buyable = gen.property[i].buyable;
                    prop[i].cardIcon = gen.property[i].cardIcon;
//                System.out.println("TEST PROPERTY NAME: " + prop[i].name);//REMOVE AFTER
//                System.out.println(prop[i].price + " " + prop[i].rent1 + " " + prop[i].rent2 + " " + prop[i].rent3 + " " + prop[i].rent4 + " " + prop[i].rentH + " " + prop[i].colour);//REMOVE AFTER
                }
                break;
            }
            case "Super": {
                SuperHero_Data sup = new SuperHero_Data();//Change to super
                sup.setProp();
                sup.getCards();//same as above.
                //Chance and community stuff                   
                chance = sup.chance.clone();
                chanceActs = sup.chanceActs.clone();
                chanceVals = sup.chanceVals.clone();
                chancePos = sup.chancePos.clone();
                comm = sup.comm.clone();
                commActs = sup.commActs.clone();
                commVals = sup.commVals.clone();
                commPos = sup.commPos.clone();
                for (int i = 0; i < prop.length; i++) {
                    prop[i] = new Properties_Data();
                    prop[i].name = sup.property[i].propName;
                    prop[i].price = sup.property[i].price;
                    prop[i].rent1 = sup.property[i].rent1;
                    prop[i].rent2 = sup.property[i].rent2;
                    prop[i].rent3 = sup.property[i].rent3;
                    prop[i].rent4 = sup.property[i].rent4;
                    prop[i].rentH = sup.property[i].rentH;
                    prop[i].priceHouse = sup.property[i].priceHouse;
                    prop[i].colour = sup.property[i].colour;
                    prop[i].owner = -1;
                    prop[i].owned = false;
                    prop[i].type = sup.property[i].type;
                    prop[i].buyable = sup.property[i].buyable;
                    prop[i].cardIcon = sup.property[i].cardIcon;
//                System.out.println("TEST PROPERTY NAME: " + prop[i].name);//REMOVE AFTER
//                System.out.println(prop[i].price + " " + prop[i].rent1 + " " + prop[i].rent2 + " " + prop[i].rent3 + " " + prop[i].rent4 + " " + prop[i].rentH + " " + prop[i].colour);//REMOVE AFTER
                }
            }
        }
    }
}
