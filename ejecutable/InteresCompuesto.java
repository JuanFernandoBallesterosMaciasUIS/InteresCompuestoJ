package ejecutable;

import javax.swing.JOptionPane;

public class InteresCompuesto {
    public static void main(String[] args) {
        // Declaración de variables
        Double c1, c2, c3, c4;
        int m = 0;

        c1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital de Pedro en pesos: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital de Juan en pesos: "));
        c3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita la inversión total del negocio en pesos: "));

        while ((c1 + c2) <= c3) {

            c1 = c1 + (c1 * 0.03);
            c2 = c2 + (c2 * 0.04);
            m = m + 1;
        }
        c4 = c1 + c2;

        JOptionPane.showMessageDialog(null, "Se necesitaron " + m
                + " meses para alcanzar al capital de la inversión del negocio, con un total de " + c4 + " pesos.");
    }
}