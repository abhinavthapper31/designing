package lowLevelDesign.designPatterns.prototypePattern;

public class App {
    //  Used to make copy/clone from an existing object
    public static void main(String[] args) {

        Student student = new Student(1,"Thapper", 123);

        Student cloneObj = (Student) student.clone();

        System.out.println(student.hashCode());
        System.out.println(cloneObj.hashCode());


    }
}
