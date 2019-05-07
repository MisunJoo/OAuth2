package com.misun.oauth2.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member implements Serializable {
  @Id
  @GeneratedValue
  Long id;

  String name;
  String userName;
  String remark;

  public Member(){}

  public Member(String name, String userName, String remark) {
    this.name = name;
    this.userName = userName;
    this.remark = remark;
  }
}
