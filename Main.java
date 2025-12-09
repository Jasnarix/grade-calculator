
public class Main {
 
    public static void main(String[] args){
        StudentGrades student_grades = new StudentGrades();
        student_grades.noOfAssignments();
        student_grades.addResults();
        student_grades.calculateAverage();
        System.out.println(student_grades.getFinalGrade());
        System.out.println(student_grades.getLetterGrade());
    }

}






