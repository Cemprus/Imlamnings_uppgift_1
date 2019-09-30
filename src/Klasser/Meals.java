package Klasser;

public interface Meals {
    default int calcPortion(){return -1;};

    static String mealType(Animal animal) {
        switch (animal.getType()) {
            case WORM:
                return "ormpellets";
            case DOG:
                return "hundfoder";
            case CAT:
                return "kattfoder";
        }
        return null;
    }
}
