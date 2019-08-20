/*
 * *
 * @author AniketAmrutkar
 * @date 8/21/19, 1:56 AM
 *
 */

/*
 * *
 * @author AniketAmrutkar
 * @date 8/21/19, 1:48 AM
 *
 */

package com.milkyway.creational.factorydesignpattern.os;

public class OperatingSystemFactory {
  public OperatingSystem getOperatingSystem(String name){
    if(name.equals("Android"))
      return new Android();
    else if(name.equals("Ios"))
      return new Ios();
    else
      return new Windows();
  }
}
