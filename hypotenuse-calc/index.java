import javax.swing.JOptionPane;

public class index {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        JOptionPane.showMessageDialog(null, "Welcome to hypotenuse calculator!");
        a = Double.parseDouble(JOptionPane.showInputDialog(null, "The A side is: "));
        b = Double.parseDouble(JOptionPane.showInputDialog(null, "The B side is: "));

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        JOptionPane.showMessageDialog(null, "The C side is: " + c);
    }
}

