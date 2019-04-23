package GreenFoxOrganization;

public class Person {
    String name;
    int age;
    String gender;

    public Person(){
        name = "Jaromir Jagr";
        age = 68;
        gender = "male";
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce(){
        System.out.println("I'm" + name + ",a" + age + "year old" + gender);
    }
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }
}
