import org.junit.*;
import static org.junit.Assert.*;



public class StudentTest {
    Student stu1 = new Student("Jim",12312324);
    Student stu2 = new Student("jack",2133545);



    @Test
    public void testIfNameIsEquals() {


        String expected = "Jim";
        String actual = stu1.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testAverage(){
        stu1.addGrade(85.0);
        stu1.addGrade(70.9);
        stu1.addGrade(90.4);
        double output = 82.1;
        double result = stu1.getGradeAverage();

        assertEquals(output,result, .1);


    }



}
