import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class AplikasiPemesananMakanan {
    private JTextField textFieldNama;
    private JTextField textFieldAlamat;
    private JTextField textFieldTelp;
    private JCheckBox steakCheckBox;
    private JCheckBox pizzaCheckBox;
    private JCheckBox spaghetiCheckBox;
    private JButton TAMBAHButton;
    private JLabel fieldNama;
    private JPanel Field;
    private JPanel FiledLabel;
    private JTextField textFieldTotalBayar;
    private JTextArea textAreaDataPenjualan;
    private JLabel fieldAlamat;
    private JLabel fieldNoTelp;
    private JLabel labelTotalBayar;
    private JPanel main;
    private int totalBayar = 0;


    public AplikasiPemesananMakanan() {
        TAMBAHButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tambahPesanan();
            }
        });

        spaghetiCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotalBayar();
            }
        });

        pizzaCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalBayar();
            }
        });

        steakCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateTotalBayar();
            }
        });
    }

    private void updateTotalBayar() {
        totalBayar = 0;

        if (spaghetiCheckBox.isSelected()) {
            totalBayar += 40000;
        }
        if (pizzaCheckBox.isSelected()) {
            totalBayar += 80000;
        }
        if (steakCheckBox.isSelected()) {
            totalBayar += 100000;
        }

        labelTotalBayar.setText("Rp. " + totalBayar);
    }


    private void tambahPesanan() {
        totalBayar = 0;
        StringBuilder strPesanan = new StringBuilder();

        strPesanan.append("Nama : ").append(textFieldNama.getText()).append("\n");
        strPesanan.append("Alamat : ").append(textFieldAlamat.getText()).append("\n");
        strPesanan.append("Telp : ").append(textFieldTelp.getText()).append("\n");
        strPesanan.append("----------------------------------------------------------------------------------\n");
        strPesanan.append("Pesanan :\n");

        if (spaghetiCheckBox.isSelected()) {
            strPesanan.append("- Spagheti (40000)\n");
            totalBayar += 40000;
        }
        if (pizzaCheckBox.isSelected()) {
            strPesanan.append("- Pizza (80000)\n");
            totalBayar += 80000;
        }
        if (steakCheckBox.isSelected()) {
            strPesanan.append("- Steak (100000)\n");
            totalBayar += 100000;
        }

        strPesanan.append("----------------------------------------------------------------------------------\n");
        strPesanan.append("Total Bayar:\n");
        strPesanan.append("    Rp. ").append(totalBayar);

        textAreaDataPenjualan.setText(strPesanan.toString());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplikasi Pemesanan Makanan");
        frame.setContentPane(new AplikasiPemesananMakanan().main);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
