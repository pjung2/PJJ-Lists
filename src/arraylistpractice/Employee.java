package arraylistpractice;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class Employee
{
    private String empId;
    private String empName;
    private String empDepartment;

    public Employee(String empId, String empName, String empDepartment)
    {
        this.empId = empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
    }
    
    public String getEmpId()
    {
        return empId;
    }

    public void setEmpId(String empId)
    {
        this.empId = empId;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpName(String empName)
    {
        this.empName = empName;
    }

    public String getempDepartment()
    {
        return empDepartment;
    }

    public void setempDepartment(String empDepartment) 
    {
        this.empDepartment = empDepartment;
    }
}