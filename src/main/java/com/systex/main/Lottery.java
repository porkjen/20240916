package com.systex.main;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {
    public static void main(String[] args) {
        int group = Integer.parseInt(args[0]);
        List<Integer> excludeNum = new ArrayList<>();
        for(String n : args[1].split(" ")){
            excludeNum.add(Integer.parseInt(n));
        }

        for(int i=0;i<group;i++){
            Set<Integer> result = new TreeSet<>();
            while(result.size()<6){
                int num = (int)(Math.random()*49)+1;
                if(!excludeNum.contains(num)){
                    result.add(num);
                }
            }
            System.out.println(i+1 + " : " + result);
        }
    }
}
