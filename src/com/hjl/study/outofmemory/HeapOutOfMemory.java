package com.hjl.study.outofmemory;

import java.util.ArrayList;

public class HeapOutOfMemory {
	public static void main(String[] args) throws Exception{  
        ArrayList<String> strs = new ArrayList<>(100000000);  
        for(int i = 0 ;i <= 100000000; ++ i){  
            strs.add(Integer.toString(i));  
            if(i % 10000 == 0){  
                System.out.println(i);  
            }  
        }  
    }  
} 