package com.pack.lombokdemo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Value;

@Getter
@Setter
@ToString
@EqualsAndHashCode
//@RequiredArgsConstructor
//@AllArgsConstructor
@Data
@Value


//@ToString
public class Emp {
private String name;
private int age;
private float salary;
}
