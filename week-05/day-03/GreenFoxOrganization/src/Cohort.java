import java.util.ArrayList;



public class Cohort {
    public String name;
    public ArrayList<Student> students;
    public ArrayList<Mentor> mentors;

    public Cohort(String name) {
        this.name=name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " +
                mentors.size() + " mentors.");
    }

    public void addStudent(Student student) {this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }
}
