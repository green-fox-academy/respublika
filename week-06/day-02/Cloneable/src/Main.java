public class Main {
    public static void main(String[] args) {
        Student student1=new Student("John", 20, "male", "BME");
        student1.skipDays(5);
        Student studentCopy=student1.clone();
        System.out.println(student1.name + ", " + student1.age + ", " + student1.gender + ", " + student1.previousOrganization +
                ", " + student1.skippedDays);
        System.out.println(studentCopy.name + ", " + studentCopy.age + ", " + studentCopy.gender + ", " +
                studentCopy.previousOrganization + ", " + studentCopy.skippedDays);
    }
}
