package com.JavaCollection_framewors;
/*
In Java collection framework,
 HashMap is a Map implementation that stores key-value pairs in a hash table,
  providing constant-time performance for the basic operations such as put, get, and remove.
It does not maintain the order of the elements.
 */
import java.util.HashMap;
import java.util.Map;

public class Hash_Map_ {
    public static void main(String[] args) {

        Map<String,Integer> m =new HashMap<>();
        m.put("sohon",6);
        m.put("ravi",1);
        m.put("ccv",10);
        m.put("love",90);
      //  m.put("love",56);//not inserting because key should be unique and value override, so it will print {love = 56}
// u can apply condition like this for not override the new value
//        if(!m.containsKey("love")){
//            m.put("love",56);
//        }
//it will print {love=90}

        //you can write like this-no need to write if condition  :
        m.putIfAbsent("love",56);
        m.put("joe",100);

        //iterate
        for (Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //only key set

       for(String key : m.keySet())
       {
           System.out.println(key);
       }
       //only value set





        System.out.println(m);//random order

        System.out.println(m.containsValue(1));//check the value present or not
        System.out.println(m.isEmpty());//check the map is empty or not

    }
}
