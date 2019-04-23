package GreenFoxOrganization;

public class Sponsor extends Person {
    String name;
    int age;
    String gender;
    String company;
    int hireStudents;

    public Sponsor(){
        name = "Jaromir Jagr";
        age = 68;
        gender = "male";
        company = "StickToIt";
        hireStudents = 1;
    }
    public Sponsor(String name, int age, String gender, String company){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hireStudents = hireStudents;
    }
    public void introduce(){
        System.out.println("Hi, I'm" + name + ",a" + age + "year old" + gender + "who represents" + company + "and hired" + hireStudents + "student.");
    }
    public void hire(){
        System.out.println("increase" + hireStudents + "by 1");
    }
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }
}
