import java.util.ArrayList;
import java.util.Collections;


public class Family {
    private ArrayList<Uncle> uncles;
    private ArrayList<Niece> nieces;

    public Family() {
        this.uncles = new ArrayList<>();
        this.nieces = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) return false;
        }
        nieces.add(new Niece(name, day, month));
        return true;
    }

    public boolean addUncle(String name) {

        // Add a new uncle. If there is already an uncle of the name, false is returned and nothing is added
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) return false;
        }
        uncles.add(new Uncle(name));
        return true;
    }

    public Niece findNiece(String name) {
        // Lookup a niece by name; return null if not found.
        for (Niece niece : nieces) {
            if (niece.getName().equals(name)) return niece;
        }
        return null;
    }


    public Uncle findUncle(String name) {
        // Lookup an uncle by name; return null if not found
        for (Uncle uncle : uncles) {
            if (uncle.getName().equals(name)) return uncle;
        }
        return null;
    }

    public void listNieces() {
        // List (to the console) the nieces recorded.
        Collections.sort(nieces);
        System.out.println("List Niece:");
        for (Niece niece : nieces) {
            System.out.println(niece.getName() + " - " + niece.getBirthday());
        }
    }

    public void listUncles() {
        // List (to the console) the uncles recorded.
        Collections.sort(uncles);
        System.out.println("List Uncle:");
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }
}
