package com.systex.main;

import com.systex.model.MyDate;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

        String rule = args[0];
        List<MyDate> dates = new ArrayList<>();
        dates.add(new MyDate(13, 9, 2024));
        dates.add(new MyDate(11, 9, 2024));
        dates.add(new MyDate(5, 12, 2019));
        dates.add(new MyDate(8, 10, 2025));
        dates.add(new MyDate(25, 2, 2030));
        dates.add(new MyDate(21, 1, 2008));
        dates.add(new MyDate(22, 1, 2008));
        dates.add(new MyDate(17, 7, 2008));
        dates.add(new MyDate(19, 6, 2015));

        if(rule.equals("new_to_old")){
            Collections.sort(dates, MyDate.DATE_COMP.reversed());
            dates.forEach(d -> System.out.println(d));
        }
        else if(rule.equals("old_to_new")){
            Collections.sort(dates, MyDate.DATE_COMP);
            dates.forEach(d -> System.out.println(d));
        }
    }
}