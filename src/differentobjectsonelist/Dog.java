package differentobjectsonelist;

import java.util.Objects;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */
public class Dog
{
    
    private String name;
    private int age;
    String rabiesId;

    public Dog(String name, int age, String rabiesId)
    {
        this.name = name;
        this.age = age;
        this.rabiesId = rabiesId;
    }

    @Override
    public String toString()
    {
        return "Dog's name is: " + getName() + " Dog's age is: " + String.valueOf(getAge());
    }
    
    @Override
    public int hashCode()
    {
        // Must be prime number
        int hash = 7;
        // must be another prime number
        hash = 31 * hash + Objects.hashCode(this.rabiesId);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Dog other = (Dog) obj;
        if (!Objects.equals(this.rabiesId, other.rabiesId))
        {
            return false;
        }
        return true;
    }        
            
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    
}