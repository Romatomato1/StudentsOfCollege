import java.util.ArrayList;
/**
 * Puts all students into an array list
 *
 * @author Roman Gofman
 * @version 3/23/2020
 */
public class CollegeStudent
{
    // instance variables - replace the example below with your own
    private ArrayList<College> collegeStudents;
    //Constants
    private final int CREDITS_FULL_TIME = 13;
    /**
     * Constructor for objects of class CollegeStudent
     */
    public CollegeStudent()
    {
        // initialise instance variables
        collegeStudents = new ArrayList<College>(1);
    }

    /**
     * Adds a college object to the College students array list
     *
     * @param  The student to be added to the array list
     */
    public void addStudent(College student)
    {
        collegeStudents.add(student);
    }

    /**
     * Removes a student from the array list 
     * 
     * @param the index of the student to be removed
     */
    public void removeStudent(int index)
    {
        collegeStudents.remove(index);
    }

    /**
     * gets the size of the college students array
     * 
     * @return integer value of the size of the array list
     */
    public int getNumStudents(){
        return collegeStudents.size();

    }

    /**
     * Gets a student at a certain index value
     * 
     * @param the index value of the student to be found
     * @return a student found in the array at a certain index
     */
    public College getStudent(int index)
    {
        return collegeStudents.get(index);
    }

    /**
     * Gets the number of full time students
     * 
     * @returns the number of full time college students
     */
    public int getFullTime(){
        int total = 0;
        for(int i = 0; i < collegeStudents.size(); i++){
            if(collegeStudents.get(i).getCredits() >= CREDITS_FULL_TIME){
                total += 1;
            }
        }
        return total;
    }

     /**
     * determines whether there is a student in the array with the given id
     * 
     * @return integer iindex of student or negative one if not found
     */
    public int isFound(String id){
        int result = -1;
        for(int i = 0; i < collegeStudents.size(); i++){
            if(collegeStudents.get(i).getId().equals(id)){
                result = i;
            }
        }
        return result;
    }
}
