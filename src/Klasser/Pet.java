package Klasser;

public class Pet extends Animal implements PetMeals {
    private animalType type;


    public Pet() {}
    public Pet(String name, animalType type, int weight) {
        super(name, weight);
        this.type = type;
    }

    animalType getType() { return type; }
    public void setType(animalType type) { this.type = type; }

    public static Pet getPetInArray(Pet[] pets, String name) {
        for (Pet pet : pets) {
            if (pet.getName().toUpperCase().equals(name.toUpperCase())) {
                return pet;
            }
        }
        return null;
    }

    public static Pet[] createHealthyPetsAnimals() {
        return new Pet[]{
                new Pet("Sixten", animalType.DOG, 5),
                new Pet("Dogge", animalType.DOG, 10),
                new Pet("Venus", animalType.CAT, 5),
                new Pet("Ove", animalType.CAT, 3),
                new Pet("Hypno", animalType.SNAKE, 1)
        };
    }


    @Override
    public int calcPortion() {
        switch (type) {
            case DOG:
                return (this.getWeight()*1000/100);
            case CAT:
                return (this.getWeight()*1000/150);
            case SNAKE:
                return 20;
        }
        return -1;
    }

    @Override
    public String getMealType() {
        return type.mealType;
    }
}
