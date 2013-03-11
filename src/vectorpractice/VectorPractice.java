package vectorpractice;

import java.util.ListIterator;
import java.util.Vector;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 * Version 1.0
 */
public class VectorPractice
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Vector v = new Vector();
        String s1 = "Fishing";
        String s2 = "Working on computers";
        String s3 = "Hanging out with friends";
        v.add(s1);
        v.add(s2);
        v.add(s3);
        
        ListIterator iter = v.listIterator();
        while (iter.hasNext())
        {
            System.out.println((String) iter.next());
        }
    }
    
}
