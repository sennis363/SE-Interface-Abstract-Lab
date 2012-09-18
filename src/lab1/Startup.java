package lab1;

public class Startup {
    public static void main(String[] args) {
        AdvancedJavaCourse advJava1 = new AdvancedJavaCourse();
        IntroJavaCourse intJava1 = new IntroJavaCourse();
        IntroToProgrammingCourse intProg1 = new IntroToProgrammingCourse();
        
        advJava1.setCourseName("Advanced Java");
        advJava1.setCourseNumber("12345");
        advJava1.setTeacherName("Bob McBob");
        advJava1.setStudentName("Larry Wing");
        
        intJava1.setCourseName("Intro to Java");
        intJava1.setCourseNumber("55455");
        
        intProg1.setCourseName("Intro to Programming");
        intProg1.setCourseNumber("99999");
        
        System.out.println("Course : " + advJava1.getCourseName());
        System.out.println("Course # : " + advJava1.getCourseNumber());
        System.out.println("Teacher : " + advJava1.getTeacherName());
        System.out.println("Student : " + advJava1.getStudentName());
        System.out.println("");
        System.out.println("Course : " + intJava1.getCourseName());
        System.out.println("Course # : " + intJava1.getCourseNumber());
        System.out.println("");
        System.out.println("Course : " + intProg1.getCourseName());
        System.out.println("Course # : " + intProg1.getCourseNumber());
        /*I like how it is harder for the program to fail due to the fact that
         * all abstract methods must be overidden. The one thing I don't like
         * about this is having to actually overide all of the abstract methods,
         * which could get troublesome down the road when I would have to 
         * overide more then just 1 or 2 methods in each subclass.
        */
    }
}
