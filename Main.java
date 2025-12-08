import java.util.Scanner; //Importing Scanner package to read user input.
import java.util.ArrayList; //Importing ArrayList package to store grades and respective weighting


//noOfAssignments will define the number of times the code will loop through to obtain the grade and weighting of each assignment.




public class Main {
    public static int noOfAssignments() {
        Scanner assignmentsObj = new Scanner(System.in);
        System.out.println("Enter number of assignments: ");

        String noOfAssignmentsStr = assignmentsObj.nextLine(); //Acquire number of assignemnts
        int noOfAssignmentsInt = Integer.parseInt(noOfAssignmentsStr); //convert to integer 
        return noOfAssignmentsInt;
    }

    static void obtainGradesWeights(int loopCount){
        for(int i=0; i==loopCount; i=i+1){
            System.out.println("helloWorld");
        }
    }
    public static void main(String[] args){
            int noOfAssignments = noOfAssignments();
            System.out.println("this" + noOfAssignments);
            obtainGradesWeights(noOfAssignments);
    }

}






