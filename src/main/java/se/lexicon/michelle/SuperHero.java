package se.lexicon.michelle;

public class SuperHero implements Comparable<SuperHero>{
    //Add fields for Id,Name and Age + getters and setters. Have the class implement the Comparable interface.

    private int     id,
                    age;
    private String  name;

    public SuperHero(int id, int age, String name) {
        setId(id);
        setAge(age);
        setName(name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implement the override method and have it compare the AGE of the superhero.
    @Override
    public int compareTo(SuperHero obj) {
        return Integer.compare(age, obj.age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SuperHero{");
        sb.append("id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        sb.append("\n");
        return sb.toString();
    }
}
