package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements SoftwareDevelopmentCourses{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    private String major;

//    public IntroJavaCourse(String courseName, String courseNumber) {
//        this.courseName = courseName;
//        this.courseNumber = courseNumber;
//    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
 
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        //validate
        this.major = major;
    }
    
}
