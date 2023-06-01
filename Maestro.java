
public class Maestro {
    public String Usuario = "";
    public String password1 = "";

    Maestro(String Usuario, String password1) {
        this.Usuario = Usuario;
        this.password1 = password1;
    }

    // Metodo Valida si ambas cadenas son iguales
    public boolean Cuenta(String usser2, String password2) {
        return usser2.equals(Usuario) && password2.equals(password1);
    }

}
