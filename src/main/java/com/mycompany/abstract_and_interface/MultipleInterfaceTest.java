
package com.mycompany.abstract_and_interface;

import java.util.Scanner;

interface employee3
{
    public float setOT(float s);
}
interface employee4
{
    public float calOT(float s,int h);
}
public class MultipleInterfaceTest implements employee3,employee4
{
    public float setOT(float s)
    {
        return s/10;
    }
    public float calOT(float s,int h)
    {
        return setOT(s)*h;
    }
    public static void main(String[] args) 
    {
      MultipleInterfaceTest emp = new MultipleInterfaceTest();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter OT RATE >>> ");
        float salary = scan.nextFloat();
        System.out.print("Enter OT HOUR >>> ");
        int hr = scan.nextInt();
        System.out.println("salary/10 = " + emp.setOT(salary) );
        System.out.println("salary*hour = " + emp.calOT(salary, hr) + " BAHT ");
    }
    
}
