/*
 * *
 * @author AniketAmrutkar
 * @date 8/21/19, 2:17 AM
 *
 */

package com.milkyway.creational.builderdesignpattern;

public class PhoneBuilder {
  private String os;
  private int ram;
  private String processor;
  private String memory;
  private String battery;

  public PhoneBuilder setOs(String os) {
    this.os = os;
    return this;
  }

  public PhoneBuilder setRam(int ram) {
    this.ram = ram;
    return this;
  }

  public PhoneBuilder setProcessor(String processor) {
    this.processor = processor;
    return this;
  }

  public PhoneBuilder setMemory(String memory) {
    this.memory = memory;
    return this;
  }

  public PhoneBuilder setBattery(String battery) {
    this.battery = battery;
    return this;
  }

  public Phone getPhone(){
    return new Phone(os,ram,processor,memory,battery);
  }
}
