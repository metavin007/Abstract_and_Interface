
package com.mycompany.abstract_and_interface;

import java.util.Scanner;

interface employee2
{
    public void setOT(float s);
    public float calOT(int h,float s);
}
public class InterfaceTest implements employee2
{
   public void setOT(float s)
   {
       System.out.println("OT RATE = " + s + " BAHT");
   }
   public float calOT(int h,float s)
   {
       return h*s;
   }
    public static void main(String[] args) 
    {
        InterfaceTest emp = new InterfaceTest();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter OT RATE >>> ");
        float salary = scan.nextFloat();
        System.out.print("Enter OT HOUR >>> ");
        int hr = scan.nextInt();
        System.out.println("OT HOUR = " + hr + " HR. ");
        emp.setOT(salary);
        System.out.println("TOTAl OT = " + emp.calOT(hr, salary) + " BAHT ");
    }
    
}
