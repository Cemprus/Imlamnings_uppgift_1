package Klasser;

public interface AnimalMeals {
    enum animalType {
            CAT("kattfoder"),
            DOG("hundfoder"),
            WORM( "ormpellets");
        public final String mealType;
        animalType(String mealType) {
            this.mealType = mealType;
        }
    }

    default int calcPortion(){return -1;};
}
