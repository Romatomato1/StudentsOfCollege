
/**
 * Abstract class Student - this class will implement the person
 * interface but also be a parent to both the ESL and College 
 * classes. It will validate all data and have abstract methods to
 * be overridden by the children.
 * 
 * @author Roman Gofman
 * @version 3/18/20
 */
public abstract class Student implements Person
{
    // instance variables
    private String id;
    private String firstName;
    private String lastName;
    private Sex sex;
    private int month;
    private int day;
    private int year;
    private int credits;

    /************************************************************
     * Constructor
     ***********************************************************/    

    /**
     * Constructor for the abstract class student. Validates and
     * instantiates the instance varibles.
     *
     * @param  id - a String varible representing id.
     * @param  firstName - a String varible representing first name.
     * @param  lastName - a String varible representing last name.
     * @param  sex - a varible that is enumSex type representing
     * the sex of the student.
     * @param month - integer representing the month the student
     * was born
     * @param day - integer value for the day the student was born
     * @param year - intger value that represents the student's 
     * year of birth
     */
    public Student(String id, String firstName, String lastName,
    Sex sex, int month, int day, int year)
    {
        //Validate and instantiate instance varibles using mutators
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setSex(sex);
        setMonth(month);
        setDay(day);
        setYear(year);

    }

    /************************************************************
     * Accessors
     ***********************************************************/

    /**
     * This class returns the value of the id when called.
     * 
     * @return it returns the string value of the instance variable
     * id.
     */
    public String getId(){return this.id;}

    /**
     * This class returns the value of the first name when called.
     * 
     * @return it returns the string value of instance variable 
     * first name.
     */
    public String getFirstName(){return this.firstName;}

    /**
     * This class returns the value of the last name when called.
     * 
     * @return it returns the string value of the instance variable
     * last name.
     */
    public String getLastName(){return this.lastName;}

    /**
     * This class returns the value of the sex when called.
     * 
     * @return it returns the enum Sex value sex.
     */
    public Sex getSex(){return this.sex;}

    /**
     * This class returns the value of the month when called.
     * 
     * @return it returns the int value month.
     */
    public int getMonth(){return this.month;}

    /**
     * This class returns the value of the day when called.
     * 
     * @return it returns the int value day.
     */
    public int getDay(){return this.day;}

    /**
     * This class returns the value of the year when called.
     * 
     * @return it returns the int value year.
     */
    public int getYear(){return this.year;}

    /**
     * This class returns the value of the credits when called.
     * 
     * @return it returns the int value credits.
     */
    public int getCredits(){return this.credits;}

    /************************************************************
     * Mutators
     ***********************************************************/

    /**
     * This method validates the given id and if it is valid 
     * sets it equal to the instance variable. If invalid throws
     * IllegalArgumentException
     * 
     * @param id - the string value of id that will be validated.
     */
    public void setId(String id)
    {
        if(!id.matches("[0-9]{9}"))throw new IllegalArgumentException("Your id should only be a series of 9 numbers.");
        this.id = id;
    }

    /**
     * This method validates the given first name and if it is 
     * valid sets it equal to the instance variable. 
     * If invalid throws IllegalArgumentException.
     * 
     * @param firstName - the string value of firstName that will
     * be validated.
     */
    public void setFirstName(String firstName)
    {
        if(!id.matches("[A-Za-z]+"))throw new IllegalArgumentException("Your first name should only be made up of alphabetic characters.");
        this.firstName = firstName;
    }

    /**
     * This method validates the given last name and if it is 
     * valid sets it equal to the instance variable. 
     * If invalid throws IllegalArgumentException.
     * 
     * @param lastName - the string value of last name that will
     * be validated.
     */
    public void setLastName(String lastName)
    {
        if(!id.matches("[A-Za-z]+"))throw new IllegalArgumentException("Your last name should only be made up of alphabetic characters.");
        this.lastName = lastName;
    }

    /**
     * This method will set the instance varible ses equal to the 
     * parameter sex
     * 
     * @param sex - the enum Sex type will instantiate the 
     * instance variable
     */
    public void setSex(Sex sex){this.sex = sex;}

    /**
     * This method validates the given month and if it is 
     * valid sets it equal to the instance variable. 
     * If invalid throws IllegalArgumentException.
     * 
     * @param month - the int value of month that will
     * be validated.
     */
    public void setMonth(int month)
    {
        if(month < 0 || month > 12)throw new IllegalArgumentException("A month must be between 0 and 12 including twelve");        
        this.month = month;
    }

    /**
     * This method validates the given day and if it is 
     * valid sets it equal to the instance variable. 
     * If invalid throws IllegalArgumentException.
     * 
     * @param day - the int value of day that will
     * be validated.
     */
    public void setDay(int day)
    {
        if(day < 0 || day > 31)throw new IllegalArgumentException("A day must be between 0 and 31 including thirty one");
        this.day = day;
    }

    /**
     * This method validates the given year and if it is 
     * valid sets it equal to the instance variable. 
     * If invalid throws IllegalArgumentException.
     * 
     * @param year - the int value of year that will
     * be validated.
     */
    public void setYear(int year)
    {
        if(year < 0)throw new IllegalArgumentException("A year must be more than 0");
        this.year = year;
    }

    /**
     * This method validates the given credit amount and if it is 
     * valid sets it equal to the instance variable. 
     * If invalid throws IllegalArgumentException.
     * 
     * @param credit - the int value of credits that will
     * be validated.
     */
    public void setCredits(int year)
    {
        if(year < 0)throw new IllegalArgumentException("A credit value must be greater than or equal to 0");
        this.year = year;
    }

    /************************************************************
     * Abstract
     ***********************************************************/    
    public abstract double getPrice();

    /************************************************************
     * Results
     ***********************************************************/    

    /**
     * This method takes in data and returns it in the form of a
     * string
     * 
     * @return string of all given data
     */
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nID: " 
        + id +"\nSex: " + sex + "\nDate of Birth: " + month +
        "/" + day +"/" + year + "\nCredits: " + credits; 
    }
}