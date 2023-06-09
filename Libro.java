public class Libro {
    private String nombreLibro, nombrePersona;
    private boolean estado;
    int diaPrestamo, diaDevolucion, multa;

    Libro(String nombreLibro, String nombrePersona, boolean estado, int diaPrestamo, int diaDevolucion, int multa) {
        this.nombreLibro = nombreLibro;
        this.nombrePersona = nombrePersona;
        this.estado = estado;
        this.diaPrestamo = diaPrestamo;
        this.diaDevolucion = diaDevolucion;
        this.multa = multa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombreLibro;
    }

    public void setNombre(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

}
