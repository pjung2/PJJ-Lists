package differentobjectsonelist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class TwoArrayLists
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Employee e1 = new Employee("1111", "John", "Accounting");
        Employee e2 = new Employee("2222", "Bob", "IT");
        Employee e3 = new Employee("3333", "Jane", "Sales");

        Dog d1 = new Dog("Ol Yeller", 7, "1111");
        Dog d2 = new Dog("Snoopy", 3, "2222");
        Dog d3 = new Dog("Scooby Doo", 2, "3333");

        List comboList = new ArrayList();
        comboList.add(e1);
        comboList.add(e2);
        comboList.add(e3);
        comboList.add(d1);
        comboList.add(d2);
        comboList.add(d3);

        for (int i = 0; i < comboList.size(); i++)
        {
            Object o = comboList.get(i);
              if(o instanceof Employee)
              {
                Employee employee = (Employee) o;
                System.out.println("Empolyee Name: " + employee.getEmpName());
              }
            else
              {
                if(o instanceof Dog)
              { 
                Dog dog = (Dog) o;
                System.out.println(o.toString());
              }
                else
                {
                  System.out.println("Error");
                }
              }
        }
    }
    
}

// Challenges that are presented with this problem is that you cannot use 
// class specific methods and polymorphism is broken.
// These problems can be overcome by overriding the toString method in 
// the Employee and Dog classes.

// 1. You could create sperate lists for dog and employee objects
// 2. You could use a single list and use if logic to see what kind of 
// object it is (either dog or employee)