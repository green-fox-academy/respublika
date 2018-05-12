public class Main {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Klári néni");
        Student student=new Student("Petike");

        System.out.println(teacher.teachedThing);
        System.out.println(student.learnedThing);

        teacher.teach(student);
        student.question(teacher);
        teacher.answer();
        student.learn();

        System.out.println(teacher.teachedThing);
        System.out.println(student.learnedThing);
    }
}
