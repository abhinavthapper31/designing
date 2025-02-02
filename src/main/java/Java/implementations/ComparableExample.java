package Java.implementations;

public class ComparableExample {

    public class Person implements Comparable<Person> {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public int compareTo(Person other) {
            // First compare by age
            if (this.age < other.age) {
                return -1;
            } else if (this.age > other.age) {
                return 1;
            } else {
                // If ages are equal, compare by name
                return this.name.compareTo(other.name);
            }
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + '}';
        }
    }
}
