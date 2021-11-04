package com.honey.leetcode.leetcode.editor.cn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author ：Brayden
 * @date ：Created in 2021/10/20 17:44
 * @description：
 * @modified By：
 * @version:
 */
public class TestStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 78, 34);
        list.stream().filter(s -> s > 3).forEach(System.out::println);

        Optional<Integer> first = list.stream().filter(s -> s > 6).findFirst();
        System.out.println(first.get());

        Optional<Integer> any = list.stream().filter(s -> s > 10).findAny();
        System.out.println(any.get());
        System.out.println("------------------------------------------");

        boolean b = list.stream().allMatch(s -> s > 6);
        boolean c = list.stream().anyMatch(s -> s > 6);
        System.out.println(b);
        System.out.println(c);
        System.out.println("------------------------------------------");

        List<String> list1 = Arrays.asList("adnm", "admmt", "pot", "xbangd", "weoujgsd");
        Optional<String> max = list1.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());

        Optional<Integer> max1 = list.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(max1.get());

        Optional<Integer> max2 = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(max2.get());
        System.out.println("--------------------------------------");


    }


}
