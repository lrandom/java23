package com.niit.java23;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
/*
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("person1", "Luan");
        hm.put("person2", "Nam");
        hm.put("person3", "Ngoc");
        hm.put("person4", null);

        System.out.println(hm.get("person1"));
        System.out.println(hm.get("person2"));
        System.out.println(hm.get("person3"));

 */
/*       hm.remove("person1");
        hm.remove("person2");*//*


        for (String key : hm.keySet()) {
            System.out.println(key + ": " + hm.get(key));
        }

        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> object = (Map.Entry) it.next();
            String key = object.getKey();
            String value = object.getValue();
            System.out.println(key + ": " + value);
        }

        for (String value : hm.values()
        ) {
            System.out.println(value);
        }
*/


        Hashtable<String, String> hm2 = new Hashtable<>();
        hm2.put("person1", "Luan");
        hm2.put("person2", "Nam");
        hm2.put("person3", "Ngoc");
        //hm2.put("person4", null);

/*        System.out.println(hm2.get("person1"));
        System.out.println(hm2.get("person2"));
        System.out.println(hm2.get("person3"));*/

 /*       hm.remove("person1");
        hm.remove("person2");*/

        for (String key : hm2.keySet()) {
            System.out.println(key + ": " + hm2.get(key));
        }

        Iterator it2 = hm2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, String> object = (Map.Entry) it2.next();
            String key = object.getKey();
            String value = object.getValue();
            System.out.println(key + ": " + value);
        }

        for (String value : hm2.values()
        ) {
            System.out.println(value);
        }
    }
}
