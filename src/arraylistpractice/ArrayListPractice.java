package arraylistpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class ArrayListPractice
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("1111", "John", "Accounting");
        Employee e2 = new Employee("2222", "Bob", "IT");
        Employee e3 = new Employee("3333", "Jane", "Sales");
        
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        for(Employee s : employees)
        {
            System.out.println(s.getEmpId());
        }
    }
    
}
