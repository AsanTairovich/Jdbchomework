package PeaksoftMoskov;

public class Leaders {
    private int id;
    private String name;
    private int age;
    private String weight;
    private int growth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Leaders " +
                " \n id " + id +
                " \n name " + name +
                " \n age " + age +
                " \n weight '" + weight +
                " \n growth " + growth;
    }
}
