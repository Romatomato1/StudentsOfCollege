
/**
 * College is a class that displays data about a college student
 *
 * @author Roman Gofman
 * @version 3/19/2020
 */
public class College extends Student
{
    //Constants
    private final double PRICE_PER_CREDIT = 110.0;
    private final int CREDITS_FULL_TIME = 13;
    

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
    public College(String id, String firstName, String lastName,
    Sex sex, int month, int day, int year)
    {
        //Call parent constructor
        super(id, firstName, lastName, sex, month, day, year);

    }

    /************************************************************
     * Accessors
     ***********************************************************/
    
    /**
     * This method returns the price owed for the number of credits
     * 
     * @return the price pre credit times the credits for total
     */
    @Override
    public double getPrice(){
        return PRICE_PER_CREDIT * getCredits();   
    }

    /**
     * This method returns the variable FullTime
     * 
     * @return fullTime - representing a student with 13 or more 
     * credits
     * 
     */
    public String getFullTime(){
        String result = "Part Time";
        if(getCredits() >= CREDITS_FULL_TIME)result = "Full Time";
        return result;
    }
    
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
        return toString() + "\nType:  " + getFullTime() + 
        "\n Balance: " + getPrice();
    }
}
