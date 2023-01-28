package grades;
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name = null;
    private ArrayList<Double> grades = new ArrayList<>(Arrays.asList());
    public Student(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
    public void addGrade(double grd){
        grades.add(grd);
    }
    public double getGradeAverage(){
        double grade = 0.0;
        for (int i = 0;i<this.grades.size();i++){
            grade += this.grades.get(i);
        }
        return grade/this.grades.size();
    }
    public void printAllGrades(){
        System.out.println(this.name);
        for (int j=0;j<this.getGrades().size();j++){
            double g = this.getGrades().get(j);
            System.out.println("Grade "+ (j+1) + ": " + g);
        }
    }
    public ArrayList<Double> getGrades(){
        return grades;
    }



    public static void main(String[] args) {
        Student jim = new Student("jim");
        Student jack = new Student("jack");
        jim.addGrade(85.0);
        jim.addGrade(70.0);
        jim.addGrade(95.0);
        jim.printAllGrades();
        System.out.println(jim.getGradeAverage());

        jack.addGrade(50.0);
        jack.addGrade(30.0);
        jack.addGrade(95.0);
        jack.printAllGrades();
        System.out.println(jack.getGradeAverage());



    }
}


