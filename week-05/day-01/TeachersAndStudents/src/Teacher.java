public class Teacher {
    String name;
    int teachedThing;

    public Teacher(String name) {
        this.name=name;
        this.teachedThing=0;
    }

    public void teach(Student student) {
        student.learn();
    }

    public void answer() {
        this.teachedThing+=1;
    }
}

