/*
 * *
 * @author AniketAmrutkar
 * @date 8/21/19, 2:12 AM
 *
 */

package com.milkyway.creational.builderdesignpattern;

import com.milkyway.creational.factorydesignpattern.os.Android;
import com.milkyway.creational.factorydesignpattern.os.OperatingSystem;
import com.milkyway.creational.factorydesignpattern.os.OperatingSystemFactory;

public class BuilderPattern {
  public static void main(String[] args) {

    // Without BuilderDesignPattern
    Phone p1 = new Phone("Android",8,"Qualcom","64Gb","4000Mh");
    System.out.println(p1.toString());

    // With BuilderDesignPattern
    Phone p2 = new PhoneBuilder().setOs("Android").setMemory("128Gb").getPhone();
    System.out.println(p2.toString());

  }
}
