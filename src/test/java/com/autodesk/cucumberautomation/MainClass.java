package com.autodesk.cucumberautomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

  public static void main(String[] args){
    List<Integer> lst=new ArrayList<>();
    lst= Arrays.asList(3,2,3,3,5,6);
    for(int i=0;i<lst.size();i++){
      if(lst.get(i)==3){
        lst.remove(i);
        lst.add(5);
      }
    }


  }
}
