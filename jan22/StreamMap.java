package jan22;
import java.util.ArrayList;
import java.util.List;

class Person {
    private int id;
    private String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class StreamMap {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "Ajay"));
        personList.add(new Person(2, "Vijay"));
        personList.add(new Person(3, "Vivek"));
        personList.add(new Person(4, "Sanjana"));

        List<String> names = personList.stream()
                .map(Person::getName)
                .toList();

        System.out.println("Person Names:");
        System.out.println(names);
    }
}
