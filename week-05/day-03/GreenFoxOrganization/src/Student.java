

public class Student extends Person {
    public String previousOrganization;
    public int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization=previousOrganization;
        this.skippedDays=0;
    }

    public Student() {
        this.name="Jane Doe";
        this.age=30;
        this.gender="female";
        this.previousOrganization="The School of Life";
        this.skippedDays=0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization
                + ", who skipped " + skippedDays + " days from the course already.");
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void skipDays(int numberOfDays) {
        this.skippedDays+=numberOfDays;
    }
}
