
package com.mycompany.abstract_and_interface;


import java.awt.geom.Rectangle2D;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet 
{

    public static void main(String[] args) 
    {
        Set x = new HashSet();
        Set y = new HashSet();
        Set z = new HashSet();
        
        for(int i=0 ; i<args.length ; i++)
        {
            if(!(x.add(args[i])));
            {
                y.add(args[i]);
            }
        }
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = intersect(x,y);
        System.out.println("X intersect y = " + z);
        z = union(x,y);
        System.out.println("X union y = " + z);
        z = difference(x,y);
        System.out.println("X difference y = " + z);
     }

        public static Set intersect(Set s1,Set s2)
        {
            Set ans = new HashSet(s1);
            ans.retainAll(s2);
            return ans;
        }
        public static Set union(Set s1,Set s2)
        {
            Set ans = new HashSet(s1);
            ans.addAll(s2);
            return ans;
        }
        public static Set difference(Set s1,Set s2)
        {
            Set ans = new HashSet(s1);
            ans.remove(s2);
            return ans;
        }
    
    
}
