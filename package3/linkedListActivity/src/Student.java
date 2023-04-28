import java.util.LinkedList;

public class Student {
    String firstName;
    String lastName;
    int studentID;
    String major;
    String cStanding;
    Double gpa;
    LinkedList courseList = new LinkedList();

    Student(String fName, String lName, int ID, String m, String cS){
        firstName = fName;
        lastName = lName;
        studentID = ID;
        major = m;
        cStanding = cS;
    }

    public void addCourse(int Index, String course){
        courseList.add(Index, course);
    }

    public void removeCourse(int Index){
        courseList.remove(Index);
    }

    public String getStudentInfo(){
        return firstName + lastName + studentID + major + cStanding;
    }

    public void displayStudentCourses(){
        System.out.println("Course list: ");
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i) + " ");
        }
    }


}
