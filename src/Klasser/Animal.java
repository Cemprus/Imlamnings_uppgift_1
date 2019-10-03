package Klasser;

public class Animal {
    private String name;
    private int weight;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public Animal() {}
    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
}