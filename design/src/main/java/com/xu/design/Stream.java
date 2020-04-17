package com.xu.design;

import com.xu.design.entity.Book;

import java.util.*;
import java.util.stream.Collectors;

/***
 *@Title jdk steam特性
 *@Author 许小桀
 *@Date 2020/4/16 8:47
 **/
public class Stream {

    public static void main(String[] args) {
        //stream 遍历
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(60);

//        list.stream().forEach(s -> {
//            System.out.println(s);
//        });

        Set<Integer> collect = list.stream().filter(s -> s >= 20).collect(Collectors.toSet());
        System.out.println(collect);


        List<Book> books = new ArrayList<>();
        Book book1 = new Book("book1", 30);
        Book book2 = new Book("book2", 60);
        Book book3 = new Book("book3", 90);
        books.add(book2);
        books.add(book1);
        books.add(book3);

        books.stream().forEach(System.out::println);

        List<Book> bookSort = books.stream().sorted(Comparator.comparingInt(Book::getPrice)).collect(Collectors.toList());

        System.out.println("bookSort : " + bookSort);

        List<Book> bookSortRevers = books.stream().sorted(Comparator.comparing(Book::getPrice).reversed()).collect(Collectors.toList());
        System.out.println("bookSortRevers : " + bookSortRevers);

        List<String> bookName = books.stream().sorted(Comparator.comparing(Book::getPrice)).map(Book::getName).collect(Collectors.toList());
        System.out.println("bookName" + bookName);


        Optional<Book> max = books.stream().max(Comparator.comparing(Book::getPrice));
        System.out.println(max);


        int sum = books.stream().mapToInt(Book::getPrice).sum();

        System.out.println("sum:"+sum);

    }

}
