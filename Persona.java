public class Persona {
    private String namePersona;
    int diaPrestamo, diaDevolucion, multa;

    Persona(String namePersona, int diaPrestamo, int diaDevolucion, int multa) {
        this.namePersona = namePersona;
        this.diaPrestamo = diaPrestamo;
        this.diaDevolucion = diaDevolucion;
        this.multa = multa;
    }

    public String getNamePersona() {
        return namePersona;
    }

    public void setNamePersona(String nombrePersona) {
        this.namePersona = nombrePersona;
    }

    public int getDiaPrestamo() {
        return diaPrestamo;
    }

    public void setDiaPrestamo(int diaPrestamo) {
        this.diaPrestamo = diaPrestamo;
    }

    public int getDiaDevolucion() {
        return diaDevolucion;
    }

    public void setDiaDevolucion(int diaDevolucion) {
        this.diaDevolucion = diaDevolucion;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

}
