/*
 * *
 * @author AniketAmrutkar
 * @date 8/21/19, 1:44 AM
 *
*/

package com.milkyway.creational.factorydesignpattern;

import com.milkyway.creational.factorydesignpattern.os.Android;
import com.milkyway.creational.factorydesignpattern.os.OperatingSystem;
import com.milkyway.creational.factorydesignpattern.os.OperatingSystemFactory;

public class FactoryPattern {
  public static void main(String[] args) {

    // Without FactoryDesignPattern
    OperatingSystem os1 = new Android();
    os1.spec();

    // With FactoryDesignPattern
    OperatingSystemFactory osBuilder = new OperatingSystemFactory();
    OperatingSystem os2 =  osBuilder.getOperatingSystem("Windows");
    os2.spec();
  }
}
