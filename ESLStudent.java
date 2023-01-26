import java.util.ArrayList;
/**
 * Puts all students into an array list.
 *
 * @author Roman Gofman
 * @version 3/23/2020
 */
public class ESLStudent
{
    // instance variables - replace the example below with your own
    private ArrayList<ESL> eslStudents;

    /**
     * Constructor for objects of class ESLStudent
     */
    public ESLStudent()
    {
        eslStudents = new ArrayList<ESL>(1);
    }

    /**
     * Adds an ESL object to the ESL students array list
     *
     * @param  The student to be added to the array list
     */
    public void addStudent(ESL student)
    {
        eslStudents.add(student);
    }
    
     /**
     * Removes a student from the array list 
     * 
     * @param the index of the student to be removed
     */
    public void removeStudent(int index)
    {
        eslStudents.remove(index);
    }
    
    /**
     * gets the size of the ESL students array
     * 
     * @return integer value of the size of the array list
     */
    public int getNumStudents(){
        return eslStudents.size();
        
    }
    
    /**
     * Gets a student at a certain index value
     * 
     * @param the index value of the student to be found
     * @return a student found in the array at a certain index
     */
    public ESL getStudent(int index)
    {
        return eslStudents.get(index);
    }
    
    /**
     * Gets a number of students at a certain level
     * 
     * @param the level of the students to be found
     * @return the total students at a certain level
     */
    public int getNumLevel(Level level){
        int total = 0;
        for(int i = 0; i < eslStudents.size(); i++){
            if(eslStudents.get(i).getLevel().equals(level)){
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
        for(int i = 0; i < eslStudents.size(); i++){
            if(eslStudents.get(i).getId().equals(id)){
                result = i;
            }
        }
        return result;
    }
}
