public class Main {
    public static void main (String[] args) {
        Family family = new Family();

        // Tambah data Niece
        family.addNiece("Udin", 10, 11);
        family.addNiece("Ujang", 11, 11);
        family.addNiece("Asep", 12, 11);
        family.addNiece("Jajang", 13, 11);
        family.addNiece("Dadang", 14, 11);
        Niece udin = family.findNiece("Udin");
        Niece ujang = family.findNiece("Ujang");
        Niece asep = family.findNiece("Asep");
        Niece jajang = family.findNiece("Jajang");
        Niece dadang = family.findNiece("Dadang");

        // Tambah data Uncle
        family.addUncle("Robert Flood");
        family.addUncle("John Wick");
        family.addUncle("Alfionso Roberto");
        // di ke objek kan
        Uncle robert = family.findUncle("Robert Flood");
        Uncle john = family.findUncle("John Wick");
        Uncle alfionso = family.findUncle("Alfionso Roberto");

        // Tambah hadiah
        // john ke udin judul sama
        john.addPresent(udin, "Buku Cepat Kaya");
        // buku yang sama ke orang yang berbeda
        robert.addPresent(ujang, "Machine Learning");
        alfionso.addPresent(udin, "Machine Learning Learn");

        udin.clearPresents();
        udin.listPresents();


        family.listUncles();
        family.listNieces();
        robert.listPresents();
        john.listPresents();



    }
}
