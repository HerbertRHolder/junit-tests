import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private long id;
    private String name = null;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String n,long ident){
        this.name = n;
        this.id = ident;

    }
    public long getId(){return this.id;}
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
    public ArrayList<Double> getGrades(){
        return this.grades;
    }



    public static void main(String[] args) {
        Student jim = new Student("jim",12312324);
        Student jack = new Student("jack",2133545);
        jim.addGrade(85.0);
        jim.addGrade(70.0);
        jim.addGrade(95.0);
        jim.getGrades();
        System.out.println("Grade AVG: " + jim.getGradeAverage());

        jack.addGrade(50.0);
        jack.addGrade(30.0);
        jack.addGrade(95.0);
        System.out.println(jack.getGrades().get(0));;
        for (int i = 0; i < jack.getGrades().size(); i++) {
            System.out.println("Jack Grade: "+(i+1)+" "+jack.getGrades().get(i));
        }




    }
}


