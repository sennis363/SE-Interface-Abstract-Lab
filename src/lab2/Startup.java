package lab2;


public class Startup {
    public static void main(String[] args) {
        AdvancedJavaCourse advJava1 = new AdvancedJavaCourse();
        advJava1.setMajor("Programming");
        System.out.println(advJava1.getMajor());
        
        IntroJavaCourse intJava1 = new IntroJavaCourse();
        intJava1.setMajor("Still programming");
        System.out.println(intJava1.getMajor());
        
        IntroToProgrammingCourse intToProg = new IntroToProgrammingCourse();
        intToProg.setMajor("Even more programming");
        System.out.println(intToProg.getMajor());
    }
}
