
public class Sponsor extends Person {
    public String company;
    public int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company=company;
        this.hiredStudents=0;
    }

    public Sponsor() {
        this.name="Jane Doe";
        this.age=30;
        this.gender="female";
        this.company="Google";
        this.hiredStudents=0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name+ ", a " + age + " year old " + gender + " who represents " + company
                + " and hired " + hiredStudents + " students so far.");
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }

    public void hire() {
        this.hiredStudents++;
    }
}
