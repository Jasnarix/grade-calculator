import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrades {
    private int number_of_grades;
    private float grade;
    private float weight;
    private ArrayList<Result> results;
    private float gradeCalc;
    private float weightCalc;
    private float final_Calc = 0;
    private float temp_Calc = 0;
    private float final_weight_Calc;
    private int loopCounter = 1;
    private ArrayList<Float> grade_arrayList = new ArrayList<>();
    private ArrayList<Float> weight_arrayList = new ArrayList<>();
    private boolean valid_grade = false;
    private boolean valid_weight = false;


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
            Scanner weight_input = new Scanner(System.in);

            while(!valid){
                try{
                    System.out.print("Enter grade for Assignment " +loopCounter +": ");
                    float grade = grade_input.nextFloat();
                    valid_grade = true;
                } catch (InputMismatchException e){
                    System.out.print("That is an invalid input. Please enter a number.");
                    grade_input.nextLine();
                }
            }

            while(!valid_weight){
                try{
                System.out.print("Enter Weight for Assignment " + loopCounter + ": " );
                float weight = grade_input.nextFloat();
                valid_weight = true;
                } catch (InputMismatchException e){
                    System.out.print("That is an invalid input. Please enter a number.");
                    weight_input.nextLine();
                }
            }
            Result result_obj = new Result(grade, weight);
            results.add(result_obj);
            loopCounter++;
            

        }
    }
    
    public void calculateAverage(){
        for(int i = 0; i < results.size(); i++){
            Result grade_weight = results.get(i);
            gradeCalc = grade_weight.grade; 
            weightCalc = grade_weight.weight;
            temp_Calc = gradeCalc * (weightCalc/100);
            final_Calc += temp_Calc;
            final_weight_Calc += weightCalc/100;
        }
        this.final_Calc = final_Calc/final_weight_Calc;
    }

    public float getFinalGrade() {
        return this.final_Calc;
    }

    public String getLetterGrade(){
        if(final_Calc < 0 || final_Calc > 100){
            return "Error.";
        } else if(final_Calc < 50){
            return "F";
        } else if(final_Calc < 60){
            return "P";
        } else if(final_Calc < 70){
            return "C";
        }  else if(final_Calc < 80){
            return "D";
        } else {
            return "HD";
        }
    }

    public void getOutput(){
        for(int i = 0; i < results.size(); i++){
            Result grade_weight = results.get(i);
            grade_arrayList.add(grade_weight.grade);
            weight_arrayList.add(grade_weight.weight);
        }

        System.out.println("Grades Entered: " + grade_arrayList);
        System.out.println("Weighting Entered: " + weight_arrayList);
        System.out.println("Average: " + final_Calc + "%");
        System.out.println("Letter Grade: " + getLetterGrade());

    }
}