package lab1;

public class IntroJavaCourse extends SoftwareDevelopmentCourses{
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

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


    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

        public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    @Override
    void setStudentName(String studentName) {
        //validate
        this.studentName = studentName;
    }

    @Override
    void setTeacherName(String teacherName) {
        //validate
        this.teacherName = teacherName;
    }

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        //validate
        this.courseName = courseName;
    }

}
