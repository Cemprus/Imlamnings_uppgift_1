import Klasser.Pet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String namn, svar, regPets = "";
        Pet[] pets = Pet.createHealthyPetsAnimals();
        Pet pet;

        for (Pet p: pets) {
            regPets += p + ", ";
        }

        while (true) {
            namn = JOptionPane.showInputDialog("Vilket djur ska få mat? \n   Det finns djur med följande namn registrerad på hotellet\n   "+regPets);

            if (namn == null) {
                JOptionPane.showMessageDialog(null, "Du har valt att avbryta programmet!\n Hej då!");
                System.exit(0);
            }

            try {
                pet = Pet.getPetInArray(pets, namn);
                svar = String.format("%s%d%s", pet + " ska få ", pet.calcPortion(), " gramm av " + pet.getMealType());
                JOptionPane.showMessageDialog(null, svar);
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Det gick inte att finna djuren med namnet \"" + namn + "\"! \nDet finns bara djur med följande namn: " + regPets, "FEL!", JOptionPane.ERROR_MESSAGE);
                continue;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Något gick fel! \nFörsök igen!", "FEL!", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(null, "Sluta programmet?", "Slut?", JOptionPane.YES_NO_OPTION)) {
                System.exit(0);
            }
        }
    }
}