package lowLevelDesign.designPatterns.prototypePattern;

public class Student implements Prototype {
    private Integer id;
    private String name;
    private Integer height;

    public Student(Integer id, String name, Integer height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public Prototype clone() {
        Student clone = new Student(this.id, this.name, this.height);
        return clone;

    }
}
