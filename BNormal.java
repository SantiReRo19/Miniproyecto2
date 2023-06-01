
public class BNormal {
    public String UsuarioN;
    public String passwordN;

    BNormal(String UNormal, String PNormal) {
        this.UsuarioN = UNormal;
        this.passwordN = PNormal;
    }

    public String getUsuarioN() {
        return UsuarioN;
    }

    public void setUsuarioN(String UNormal) {
        this.UsuarioN = UNormal;
    }

    public String getPasswordN() {
        return passwordN;
    }

    public void setPasswordN(String passwordN) {
        this.passwordN = passwordN;
    }

    /*
     * public boolean CuentaNormal(String usser2N, String password2N) {
     * return usser2N.equals(UsuarioN) && password2N.equals(passwordN);
     * }
     */

}
