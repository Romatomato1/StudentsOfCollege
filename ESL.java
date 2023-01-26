
/**
 * This is a class that takes gives a report of ESL student data
 *
 * @author Roman Gofman
 * @version 3/19/2020
 */
public class ESL extends Student
{
    //Constants
    public final double PRICE = 25.0;
    // instance variables
    private Level level;
    
    /************************************************************
     * Constructor
     ***********************************************************/
    
    /**
     * Constructor for objects of class ESL
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
     * @param level- enum Level type representing the esl level
     */
    public ESL(String id, String firstName, String lastName,
    Sex sex, int month, int day, int year, Level level)
    {
        //Call parent constructor
        super(id, firstName, lastName, sex, month, day, year);
        //Validate and instantiate level
        setLevel(level);
    }
    
    /************************************************************
     * Accessors
     ***********************************************************/
    
    /**
     * This method overrides the abstract method of the parent 
     * class student
     * 
     * @returns price  - a double value of the price per credit
     */
    @Override
    public double getPrice(){return PRICE;}
    
    /**
     * This method returns the level of the ESL Student
     * 
     * @return level value of the esl student
     * 
     */
    public Level getLevel(){return level;}
    
    /************************************************************
     * Mutators
     ***********************************************************/
    
    /**
     * This method sets the parameter level equal to the instance 
     * variable.
     * 
     * @param level - enum type Level representing level of 
     * placement in ESL
     */
    public void setLevel(Level level){this.level = level;}
    
    /************************************************************
     * Results
     ***********************************************************/
    
    /**
     * This method takes in data and returns it in the form of a
     * string
     * 
     * @return string of all given data
     */
    public String toString()
    {
        return super.toString() + "\nCost: $" + PRICE + "\nLevel: "
         + level;
    }
}
