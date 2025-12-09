import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    private int number_of_grades;
    private ArrayList<Result> results;
    private float gradeCalc;
    private float weightCalc;
    private float final_Calc = 0;
    private float temp_Calc = 0;
    private float final_weight_Calc;
    private int loopCounter = 1;

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
            System.out.print("Enter grade for Assignment" +loopCounter +": ");
            float grade = grade_input.nextFloat();

            Scanner weight_input = new Scanner(System.in);
            System.out.print("Enter Weight for Assignment " + loopCounter + ": " );
            float weight = weight_input.nextFloat();

            Result result_obj = new Result(grade, weight);
            results.add(result_obj);
            loopCounter++;
            

        }
    }
    
    public float calculateAverage(){
        for(int i = 0; i < results.size(); i++){
            Result grade_weight_Calc = results.get(i);
            gradeCalc = grade_weight_Calc.grade; 
            weightCalc = grade_weight_Calc.weight;
            temp_Calc = gradeCalc * (weightCalc/100);
            final_Calc += temp_Calc;
            final_weight_Calc += weightCalc/100;
        }
        return final_Calc;
    }

    public String getLetterGrade(float current_grade){
        if(current_grade < 50 && current_grade >=0){
            return "F";
        } else if(current_grade <= 59 && current_grade >=50){
            return "P";
        } else if(current_grade <= 69 && current_grade >=60){
            return "C";
        } else if(current_grade <=  79 && current_grade >=70){
            return "D";
        } else if(current_grade <=  100 && current_grade >=80){
            return "HD";
        } else{
            return "Error.";
        }
    }
}