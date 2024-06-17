import javax.swing.JOptionPane;

public class rectangulaDeSignos {
    public static void main(String[] args) {

        String lista = "";

        for(int i = 1; i <=5 ; i++){
            for (int j = 1; j <= 10; j++) {
                lista += "@";
            }
            lista += "\n";
    }
    JOptionPane.showMessageDialog(null, lista);
  }
}
