package Klasser;

public class Animal implements Meals {
    public enum animalType {CAT, DOG, WORM}
    private String name;
    private animalType type;
    private int weight;


    private int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    String getName() { return name; }
    public void setName(String name) { this.name = name; }

    animalType getType() { return type; }
    public void setType(animalType type) { this.type = type; }

    public Animal() {}
    Animal(String name, animalType type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    static Animal getAnimal(Animal[] animals, String name) {
        for (Animal animal : animals) {
            if (animal.getName().toUpperCase().equals(name.toUpperCase())) {
                return animal;
            }
        }
        return null;
    }

    @Override
    public int calcPortion() {
        switch (this.getType()) {
            case DOG:
                return (this.getWeight()*1000/100);
            case CAT:
                return (this.getWeight()*1000/150);
            case WORM:
                return 20;
        }
        return -1;
    }
}
