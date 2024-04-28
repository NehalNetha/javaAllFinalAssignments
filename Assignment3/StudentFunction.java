package ProgrammingInJava.Assignment3;



import java.util.ArrayList;
import java.util.Scanner;


/**
 * StudentFunction
 */
public class StudentFunction {
        ArrayList<Student> students = new ArrayList<Student>();

        public void addStudent(){
             try (Scanner scan = new Scanner(System.in)) {
                // Getting Name as Input
                    System.out.print("\nEnter Your Name:\t");
                    String name=scan.nextLine().trim();
                    
                    // Getting PRN Number as Input
                    System.out.print("\nEnter Your PRN No.\t");
                    String prnNo=scan.nextLine().trim();
                    
                    // Getting Date Of Birth as Input
                    System.out.print("\nEnter Your D.O.B\t");
                    String dateOfBirth=scan.nextLine().trim();
                    
                    // Getting Marks Obtained as Input
                    System.out.print("\nEnter Your Marks\t");
                    Integer marksObtained=Integer.parseInt(scan.next());
                    
                    // Creating Object of Student Class with above values
                    Student sObj=new Student(name,prnNo,dateOfBirth,marksObtained);
                    
                    // Adding Newly Created Student Object to Array List
                    students.add(sObj);
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
         
         // Print Success Message After Adding Data
            System.out.println("\nData Added Succesfully !!! ");
        }

        public void displayStudents(){
            for(Student student: students){
                System.out.println(student);
            }
        }

    
}