import java.util.ArrayList;
import java.util.List;


public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
     
        Student student1 = new Student("abhjv", 20, 78);
        Student student2 = new Student("njkm", 22, 102);
        Course mathCourse = new Course("Math");
        Course physicsCourse = new Course("Physics");
        physicsCourse.addPrerequisite(mathCourse);
        mathCourse.enrollStudent(student1);
        mathCourse.enrollStudent(student2);

        physicsCourse.enrollStudent(student2
        mathCourse.displayEnrolledStudents();
        physicsCourse.displayEnrolledStudents();
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}

class Professor extends Person {
    private int employeeId;

    public Professor(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Course {
    private String courseName;
    private List<Course> prerequisites;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.prerequisites = new ArrayList<>();
        this.enrolledStudents = new ArrayList<>();
    }

    public void addPrerequisite(Course prerequisite) {
        prerequisites.add(prerequisite);
    }

    public void enrollStudent(Student student) {
        if (hasCompletedPrerequisites(student)) {
            enrolledStudents.add(student);
            System.out.println("Enrolled student: " + student.getName() + " (ID: " + student.getStudentId() + ")");
        } else {
            System.out.println("Student " + student.getName() + " cannot be enrolled in " + courseName +
                    " due to incomplete prerequisites.");
        }
    }

    private boolean hasCompletedPrerequisites(Student student) {
        for (Course prerequisite : prerequisites) {
            boolean hasCompleted = false;
            for (Student enrolledStudent : enrolledStudents) {
                if (enrolledStudent.equals(student)) {
                    hasCompleted = true;
                    break;
                }
            }
            if (!hasCompleted) {
                return false;
            }
        }
        return true; 
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("Name: " + student.getName() + " (ID: " + student.getStudentId() + ")");
        }
    }
}

