package GreenFoxOrganization;

public class Mentor extends Person {
    String name;
    int age;
    String gender;
    String level;

    public Mentor(){
        name = "Jaromir Jagr";
        age = 68;
        gender = "male";
        level = "senior";
    }
    public Mentor(String name, int age, String gender, String level){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }
    public void introduce(){
        System.out.println("I'm" + name + ",a" + age + "year old" + gender + " , " + level);
    }
    public void getGoal(){
        System.out.println("Educate brilliant junior software developers.");
    }
}
