import java.util.HashMap;


public class Uncle implements Comparable<Uncle> {
    private String name;
    private HashMap<Niece, String> hadiah;

    Uncle (String name) {
        this.name = name;
        this.hadiah = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        if (hadiah.containsValue(description)) return false; // Cegah duplikasi hadiah dari paman ini
        hadiah.put(recipient, description);
        recipient.addReceivedPresent(this, description); // Tambahkan hadiah ke Niece
        return true;
    }

    public void listPresents() {
        // Lists (to the console) the presents given by this uncle, showing the recipient.
        // Nieces with no present from this uncle are also listed

        System.out.println("List hadiah dari Uncle " + name + " kepada:");
        for (Niece niece:hadiah.keySet()) {
            System.out.println(niece.getName() + " deskripsi: " + hadiah.get(niece));
        }
    }

    @Override
    public int compareTo(Uncle other) {
        return this.name.compareTo(other.name);
    }

}
