import java.util.HashMap;

public class Niece implements Comparable<Niece> {
    private String name;
    private int day;
    private int month;
    private HashMap<Uncle, String> hadiah;

    Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.hadiah = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return day + "/" + month;
    }

    public int clearPresents() {
        // Delete all the presents chosen for this niece. Return the number removed
        int count = hadiah.size();
        hadiah.clear();
        return count;
    }

    public void addReceivedPresent(Uncle uncle, String description) {
        hadiah.put(uncle, description);
    }

    public void listPresents() {
        System.out.println("Daftar Hadiah yang diterima oleh " + name + ":");
        for (Uncle uncle : hadiah.keySet()) {
            System.out.println("Dari " + uncle.getName() + ": " + hadiah.get(uncle));
        }
        if (hadiah.isEmpty()) {
            System.out.println(name + " belum menerima hadiah.");
        }
    }

    @Override
    public int compareTo(Niece yangLain) {
        if (this.month != yangLain.month) return Integer.compare(this.month, yangLain.month);
        return Integer.compare(this.day, yangLain.day);
    }


}
