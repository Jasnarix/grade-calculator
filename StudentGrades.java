import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    private int number_of_grades;
    private ArrayList<Result> results;

    public StudentGrades(){
        this.number_of_grades = 0;
        this.results = new ArrayList<Result>();
}

    public void noOfAssignments() {
        Scanner myObj= new Scanner(System.in);
        System.out.print("Enter number of Assignments: ");
        this.number_of_grades = myObj.nextInt();
    }

    public void addResults(){
        for(int i = 0; i < this.number_of_grades; i++){
            Scanner grade_input = new Scanner(System.in);
            System.out.print("Enter grade for Assignment: ");
            float grade = grade_input.nextFloat();

            Scanner weight_input = new Scanner(System.in);
            System.out.print("Enter Weight for Assignment " + i+1 + ":" );
            float weight = weight_input.nextFloat();

            Result result_obj = new Result(grade, weight);
            results.add(result_obj);


        }


    }
    



}


