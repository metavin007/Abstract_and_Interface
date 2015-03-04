
package com.mycompany.abstract_and_interface;

import java.util.Scanner;

abstract class employee1
{
    public abstract void setOT(float s);
    public float calOT(int h,float s)
    {
        return h*s;
    }
}

public class AbstractclassTest extends employee1
{
    public void setOT(float s)
    {
        System.out.println("OT RATE = " + s + " BAHT");
    }
    public static void main(String[] args) 
    {
        AbstractclassTest emp = new AbstractclassTest();
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
