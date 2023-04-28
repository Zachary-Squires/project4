public class Main {
    public static void main(String[] args) {
        Student John = new Student("John", "Smith", 3, "Computer Science", "Freshman");
        Student Joe = new Student("Joe", "Schmidt", 7, "Architecture", "Sophomore");
        John.addCourse(0, "AH101");
        John.addCourse(1, "CS120");
        John.addCourse(2, "DA230");
        Joe.addCourse(0, "DANA430");
        Joe.addCourse(1, "INS123");
        Joe.addCourse(2, "ABD786");
        John.getStudentInfo();
        Joe.getStudentInfo();
        John.displayStudentCourses();
        Joe.displayStudentCourses();
        John.removeCourse(2);
        Joe.removeCourse(1);
        John.displayStudentCourses();
        Joe.displayStudentCourses();
    }
}