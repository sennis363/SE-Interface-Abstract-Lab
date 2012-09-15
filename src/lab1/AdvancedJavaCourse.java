package lab1;

import javax.swing.JOptionPane;

public class AdvancedJavaCourse extends SoftwareDevelopmentCourses{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

//    public AdvancedJavaCourse(String courseName, String courseNumber) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }
    
    public double getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        //validate
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        //validate
        this.courseNumber = courseNumber;
    }

    @Override
    public void setStudentName(String studentName) {
        //validate
        this.studentName = studentName;
    }
    
    public String getStudentName() {
        return studentName;
    }

    @Override
    public void setTeacherName(String teacherName) {
        //validate
        this.teacherName = teacherName;
    }
    
    public String getTeacherName() {
        return teacherName;
    }
    

    
}
