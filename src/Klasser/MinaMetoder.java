package Klasser;

import javax.swing.*;

public class MinaMetoder implements AnimalMeals {
    private static Animal[] createHealthyPetsAnimals() {
        return new Animal[]{
                new Animal("Sixten", animalType.DOG, 5),
                new Animal("Dogge", animalType.DOG, 10),
                new Animal("Venus", animalType.CAT, 5),
                new Animal("Ove", animalType.CAT, 3),
                new Animal("Hypno", animalType.WORM, 1)
        };
    }

    private static String getMessage(Animal[] animals, String svar) {
        return String.format("%s%s%d%s%s", Animal.getAnimal(animals, svar).getName(), " ska få ", Animal.getAnimal(animals, svar).calcPortion(), " gramm av ", Animal.getAnimal(animals, svar).getMealType());
    }

    public static void CalcMealsForHealthyPets() {
        while (true) {
            try {
                Animal[] animals = MinaMetoder.createHealthyPetsAnimals();
                JOptionPane.showMessageDialog(null, MinaMetoder.getMessage(animals, JOptionPane.showInputDialog("Vilket djur ska få mat?")));
                int returnValue = JOptionPane.showConfirmDialog(null, "Sluta programmet?", "Slut?", JOptionPane.YES_NO_OPTION);
                if (returnValue == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Något gick fel! \nFörsök igen!", "FEL!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
