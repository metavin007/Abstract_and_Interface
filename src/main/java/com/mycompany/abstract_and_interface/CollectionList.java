
package com.mycompany.abstract_and_interface;

import java.util.LinkedList;


public class CollectionList 
{

    public static void main(String[] args) 
    {
        LinkedList A = new LinkedList();
        LinkedList B = new LinkedList();
        
        A.add("ดราก้อนบอล1");
        A.add("ดราก้อนบอล2");
        A.add("ดราก้อนบอล3");
        A.add("ดราก้อนบอล4");
        A.add("ดราก้อนบอล5");
        
        System.out.println("จำนวนสมาชิกใน A = " + A.size());
        System.out.println("ประกอบด้วย\n" + A );
        
        if(A.contains("ดราก้อนบอล5"))
        {
            System.out.println(" ดราก้อนบอล5อยูในลำดับที่ " + (A.indexOf("ดราก้อนบอล5")+1));        
        }
        
        A.remove(3);
        System.out.println("เมื่อลบรายการที่ " + 4 + " ใน A แล้ว");
        System.out.println("A = " + A);
        
        
        for (int i = 0 ; i < A.size() ; i++)
        {
            B.add(A.get(i));
        }
        B.set(2,"โคนัน3");
        System.out.println("B = " + B );
        
        
       if(!(A.equals(B)))
       {
           System.out.println("A ไม่เท่ากับ B");
       }
        
       
       A.clear();
       System.out.println("ลบรายการของ A ทั้งหมดแล้ว");
       System.out.println("A = " + A);
       
       if(A.isEmpty())
       {
           System.out.println("A เป็นลิสต์ว่าง");
       }
      }
}
