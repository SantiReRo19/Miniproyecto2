import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Maestro implements Serializable{
    public String Usuario;
    public String password1;

    Maestro(String Usuario, String password1) {
        this.Usuario = Usuario;
        this.password1 = password1;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usser2) {
        this.Usuario = usser2 ;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password2) {
        this.password1 = password2;
    }
    
    public void CompararMaestro(Ventana ventana, ArrayList<Maestro> BibMaestros) {
    	String usser2 = ventana.usser.getText();
        String password2 = ventana.password.getText();
        boolean verificacion = false;
        
        BibMaestros.add(new Maestro("BibliotecaM", "189Maestro"));
        for (Maestro m : BibMaestros) {

            if (m.getUsuario().equals(usser2) && m.getPassword1().equals(password2)) {

                System.out.println(m.getUsuario());
                System.out.println(m.getPassword1());
                verificacion = true;
                ventana.Ventana9();
                break;

            }

        }
        if (verificacion == false) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
            ventana.usser.setText("");
            ventana.password.setText("");
        }
    }

}
