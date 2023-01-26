
/**
 * person is an interface to give or change base features of a 
 * person eg.: first and last names, id, and sex. 
 *
 * @author Roman Gofman
 * @version 3/17/20
 */
public interface Person
{
    public String getFirstName();
    public String getLastName();   
    public String getId();
    public Sex getSex();
    public int getMonth();
    public int getDay();
    public int getYear();
    
    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setId(String id);
    public void setSex(Sex sex);
    public void setMonth(int month);
    public void setDay(int day);
    public void setYear(int year);
}
