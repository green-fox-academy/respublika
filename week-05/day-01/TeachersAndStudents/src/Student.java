public class Student {
    String name;
    int learnedThing;

    public Student(String name) {
        this.name=name;
        this.learnedThing=0;
    }

    public void learn() {
        this.learnedThing+=1;
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }
}


