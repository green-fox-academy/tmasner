package TeacherStudent;

public class Student {

    public Student() {
    }
    public String question(Teacher teacher) {
        return teacher.answer();
    }

    public String learn() {
        return ("How should I apply the method ?");
    }
}