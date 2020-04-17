package com.xu.design.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/***
 *@Title
 *@Author 许小桀
 *@Date 2020/4/16 9:01
 **/
@Data
@AllArgsConstructor
@ToString
public class Book {
    private String name;
    private Integer price;

}
