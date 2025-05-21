import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String num1= JOptionPane.showInputDialog("¿Dame el primer numero?");
        String num2= JOptionPane.showInputDialog("¿Dame el segundo numero?");
        String num3= JOptionPane.showInputDialog("¿Dame el tercer numero?");
         float suma= Float.parseFloat(num1)+ Float.parseFloat(num2)+ Float.parseFloat(num3);
        System.out.println("El promedio es: " + suma/3);
             
    }
}
