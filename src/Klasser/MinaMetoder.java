package Klasser;

import javax.swing.*;

public class MinaMetoder {
    public static void CalcMealsForHealthyPets() {
        String namn;
        String svar = "";
        Pet[] pets;
        Pet pet = null;

        while (true) {
            pets = Pet.createHealthyPetsAnimals();
            namn = JOptionPane.showInputDialog("Vilket djur ska få mat?");

            try {
                pet = Pet.getPetInArray(pets, namn);
                svar = String.format("%s%d%s", pet.getName() + " ska få ", pet.calcPortion(), " gramm av " + pet.getMealType());
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Det gick inte att finna djuren med namnet \"" + namn+"\"!", "FEL!", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Något gick fel! \nFörsök igen!", "FEL!", JOptionPane.ERROR_MESSAGE);
            }

            if (pet != null) {
                JOptionPane.showMessageDialog(null, svar);
            }

            int returnValue = JOptionPane.showConfirmDialog(null, "Sluta programmet?", "Slut?", JOptionPane.YES_NO_OPTION);
            if (returnValue == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}
