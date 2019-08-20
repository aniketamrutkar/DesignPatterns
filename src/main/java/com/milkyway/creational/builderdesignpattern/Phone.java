/*
 * *
 * @author AniketAmrutkar
 * @date 8/21/19, 2:13 AM
 *
 */

package com.milkyway.creational.builderdesignpattern;

public class Phone {
  private String os;
  private int ram;
  private String processor;
  private String memory;
  private String battery;

  public Phone(String os, int ram, String processor, String memory, String battery) {
    this.os = os;
    this.ram = ram;
    this.processor = processor;
    this.memory = memory;
    this.battery = battery;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "os='" + os + '\'' +
        ", ram=" + ram +
        ", processor='" + processor + '\'' +
        ", memory='" + memory + '\'' +
        ", battery='" + battery + '\'' +
        '}';
  }
}
