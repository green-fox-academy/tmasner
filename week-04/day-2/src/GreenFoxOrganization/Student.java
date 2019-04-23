package GreenFoxOrganization;

public class Student extends Person {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays;

    public Student(){
        name = "Jaromir Jagr";
        age = 68;
        gender = "male";
        previousOrganization = "Hockey";
        skippedDays = 0;
    }
    public Student(String name, int age, String gender, String previousOrganization, int skippedDays){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    public Student(String john_doe, int i, String male, String bme) {
    }

    public void getGoal () {
        System.out.println("Be a junior software develpper.");
    }

    public void introduce() {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender + " from "
                + previousOrganization + " who skipped " + skippedDays + " from the course already.");
    }

    public void skipDays (int numberOfDays) {
        skippedDays += numberOfDays;
    }
}
