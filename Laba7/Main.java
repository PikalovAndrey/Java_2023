package Laba7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Клас Студент
class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private double averageGrade;

    public Student(String firstName, String lastName, int studentID, double averageGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.averageGrade = averageGrade;
    }

    // Геттери та сеттери 

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}

// Клас Факультет
class Faculty {
    private String name;
    private List<Student> students;

    public Faculty(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
   }

    // Геттери та сеттери 
}

// Клас Інститут
class Institute {
    private String name;
    private List<Faculty> faculties;

    public Institute(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public int getTotalStudents() {
    int totalStudents = 0;
    for (Faculty faculty : faculties) {
        Iterator<Student> iterator = faculty.getStudents().iterator();
        while (iterator.hasNext()) {
            iterator.next();
            totalStudents++;
        }
    }
    return totalStudents;
}


   public Faculty findLargestFaculty() {
    Faculty largestFaculty = null;
    int maxStudentCount = 0;

    for (Faculty faculty : faculties) {
        if (faculty.getStudents().size() > maxStudentCount) {
            maxStudentCount = faculty.getStudents().size();
            largestFaculty = faculty;
        }
    }

    return largestFaculty;
}


   public List<Student> getHighAchievingStudents() {
    List<Student> highAchievingStudents = new ArrayList<>();

    for (Faculty faculty : faculties) {
        Iterator<Student> iterator = faculty.getStudents().iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageGrade() >= 95 && student.getAverageGrade() <= 100) {
                highAchievingStudents.add(student);
            }
        }
    }

    return highAchievingStudents;
}


    // Геттери та сеттери 
}

public class Main {
    public static void main(String[] args) {
        // Створення об'єктів
        Student student1 = new Student("Iван", "Середа", 1, 85.5);
        Student student2 = new Student("Петро", "Iваненко", 2, 98.0);
        Student student3 = new Student("Марiя", "Iвашкевич", 3, 92.0);

        Faculty faculty1 = new Faculty("Факультет програмування.");
        faculty1.addStudent(student1);
        faculty1.addStudent(student2);
        faculty1.addStudent(student3);

        Institute institute = new Institute("Iнститут технологiй");
        institute.addFaculty(faculty1);

        // Отримання загальної кількості студентів
        int totalStudents = institute.getTotalStudents();
        System.out.println("Загальна кiлькiсть студентiв: " + totalStudents);

        // Знаходження факультету з найбільшою кількістю студентів
        Faculty largestFaculty = institute.findLargestFaculty();
        if (largestFaculty != null) {
            System.out.println("Факультет з найбiльшою кiлькiстю студентiв: " + largestFaculty.getName());
        } else {
            System.out.println("Iнститут не має факультетiв");
        }

        // Отримання студентів з високим середнім балом
        List<Student> highAchievingStudents = institute.getHighAchievingStudents();
        System.out.println("Студенти з високим середнiм балом:");

        // Використання нетипізованого ітератора
        Iterator<Student> iterator = highAchievingStudents.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("Iм'я: " + student.getFirstName() + ", Прiзвище: " + student.getLastName() + ", Бал: " + student.getAverageGrade());
        }
    }
}
