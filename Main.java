
public class Main {
 
    public static void main(String[] args){
        StudentGrades student_grades = new StudentGrades();
        student_grades.noOfAssignments();
        student_grades.addResults();
        System.out.println(student_grades.calculateAverage());
        System.out.println(student_grades.getLetterGrade(student_grades.calculateAverage()));
    }

}






