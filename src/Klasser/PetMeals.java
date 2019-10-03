package Klasser;

public interface PetMeals {
    enum animalType {                  //Enums
            CAT("kattfoder"),
            DOG("hundfoder"),
            SNAKE( "ormpellets");
        public final String mealType;
        animalType(String mealType) {
            this.mealType = mealType;
        }
    }

    int calcPortion();
    String getMealType();
}
