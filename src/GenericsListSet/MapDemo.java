package GenericsListSet;

import java.util.List;

class Person{
    private int age;
    private String Name;

    public Person(int age, String name) {
        this.age = age;
        this.Name = name == null ? "" : name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", Name='" + Name + '\'' +
                '}';
    }
}
class MapDemo {
    public static void main(String[] args) {
        Person p = new Person(20,"Ade");
        List<Person> list = List.of(p);
        System.out.println(list);
        p.setName("Shade");
        System.out.println(list);
    }
}
