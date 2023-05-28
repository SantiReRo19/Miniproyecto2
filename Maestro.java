public class Maestro {
    public String Usuario;
    public String password1;

    // private String UBibliotecario;
    // private String CBibliotecario;

    public Maestro(String Usuario, String password1) {
        this.Usuario = Usuario;
        this.password1 = password1;
    }

    /*
     * public void setUBibliotecario(String uBibliotecario) {
     * UBibliotecario = uBibliotecario;
     * }
     * public String getUBibliotecario() {
     * return UBibliotecario;
     * }
     * 
     * public void setCBibliotecario(String cBibliotecario) {
     * CBibliotecario = cBibliotecario;
     * }
     * public String getCBibliotecario() {
     * return CBibliotecario;
     * }
     */

    public boolean Cuenta(String usser2, String password2) {
    	return usser2.equals(Usuario) && password2.equals(password1);  
    }

    /*public void Cuenta(String usser2, String password2) {
        if (Usuario.equals(usser2) && password1.equals(password2)) {
            System.out.println("go");
        } else {
            System.out.println("3333");
        }
    }*/

    /*
     * public void CuentasCreadas(){
     * ArrayList<String> cuentas = new ArrayList<String>();
     * }
     */

    /*
     * public void setUBibliotecario(String uBibliotecario) {
     * /*Scanner UB = new Scanner(System.in);
     * System.out.println("Ingrese el nombre de usuario: ");
     * String UBibliotecario=UB.nextLine();
     * 
     * }
     * public String getUBibliotecario() {
     * return UBibliotecario;
     * }
     * public void setCBibliotecario(String cBibliotecario) {
     * Scanner CB= new Scanner(System.in);
     * System.out.println("Ingrese el nombre de usuario ");
     * String CBibliotecario=CB.nextLine();
     * }
     * public String getCBibliotecario() {
     * return CBibliotecario;
     * }
     * 
     * public void CuentasCreadas(){
     * 
     * }
     */

}
