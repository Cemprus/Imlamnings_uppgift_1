import Klasser.Pet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String namn;
        String svar;
        String regPets = "";
        Pet[] pets = Pet.createHealthyPetsAnimals();
        Pet pet;

        for (Pet p: pets) {
            regPets += p.getName()+", ";
        }

        while (true) {
            namn = JOptionPane.showInputDialog("Vilket djur ska få mat? \n   Det finns djur med följande namn registrerad på håtellet\n   "+regPets);
            try {
                pet = Pet.getPetInArray(pets, namn);
                svar = String.format("%s%d%s", pet.getName() + " ska få ", pet.calcPortion(), " gramm av " + pet.getMealType());
                JOptionPane.showMessageDialog(null, svar);
            } catch (NullPointerException e) {

                JOptionPane.showMessageDialog(null, "Det gick inte att finna djuren med namnet \"" + namn+"\"! \nDet finns bara djur med följande namn: " + regPets, "FEL!", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Något gick fel! \nFörsök igen!", "FEL!", JOptionPane.ERROR_MESSAGE);
            }

            slut();
        }
    }

    static void slut() {
        int returnValue = JOptionPane.showConfirmDialog(null, "Sluta programmet?", "Slut?", JOptionPane.YES_NO_OPTION);
        if (returnValue == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
