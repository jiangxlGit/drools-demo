package com.biaopu.droolsdemo.bean;

import lombok.Data;

/**
 * @author jiangxl
 * @version V1.0
 * @ClassName People
 * @Date 2021/12/15 10:58
 */
@Data
public class People {

  private int sex;

  private String name;

  private String drlType;

  public People(int sex, String name, String drlType) {
    this.sex = sex;
    this.name = name;
    this.drlType = drlType;
  }

  public People() {
  }
}
