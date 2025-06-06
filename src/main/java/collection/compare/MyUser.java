package collection.compare;

public class MyUser implements Comparable<MyUser> {

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(MyUser o) {
        System.out.println(this + " vs " + o);
        return this.age < o.age ? -1 : (this.age == 0) ? 0 : 1;
    }

    @Override
    public String toString() {
        return "MyUser{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
