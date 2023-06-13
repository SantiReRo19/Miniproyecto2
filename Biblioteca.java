import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Biblioteca {
    public ArrayList<Libro> Terror = new ArrayList<Libro>();
    private ArrayList<Libro> Clasicos = new ArrayList<Libro>();
    private ArrayList<Libro> Ingenieria = new ArrayList<Libro>();
    private ArrayList<Persona> infoPersonas = new ArrayList<Persona>();
    public ArrayList<BNormal> BibNormales = new ArrayList<BNormal>();
    public ArrayList<Maestro> BibMaestros = new ArrayList<Maestro>();

    public Biblioteca() {
        LibrosTerror();
        LibrosClasicos();
        LibrosIngenieria();
        personas();
        bibliotecarios();
    }

    public ArrayList<Libro> getLibrosTerror() {
        return Terror;
    }

    public ArrayList<Libro> getLibrosClasicos() {
        return Clasicos;
    }

    public ArrayList<Libro> getLibrosIngenieria() {
        return Ingenieria;
    }

    public ArrayList<Persona> getPersonas() {
        return infoPersonas;
    }

    public ArrayList<BNormal> getBibliotecarios() {
        return BibNormales;
    }
    
    public ArrayList<Maestro> getBibliotecariosMaestro() {
        return BibMaestros;
    }

    public void LibrosTerror() {
        Terror.add(new Libro("It", "-", true, 7, 0, 0));
        Terror.add(new Libro("El resplandor", "-", true, 7, 0, 0));
        Terror.add(new Libro("El visitante", "-", true, 7, 0, 0));
        Terror.add(new Libro("Narraciones extraordinarias", "-", true, 7, 0, 0));
        Terror.add(new Libro("Frankestein", "-", true, 7, 0, 0));
    }

    public void LibrosClasicos() {
        Clasicos.add(new Libro("Orgullo y prejuicio", "-", true, 7, 0, 0));
        Clasicos.add(new Libro("Don quijote de la mancha", "-", true, 7, 0, 0));
        Clasicos.add(new Libro("La metamorfosis", "-", true, 7, 0, 0));
        Clasicos.add(new Libro("El principito", "-", true, 7, 0, 0));
        Clasicos.add(new Libro("Crimen y castigo", "-", true, 7, 0, 0));
    }

    public void LibrosIngenieria() {
        Ingenieria.add(new Libro("La ingenieria es humana", "-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Numeros Gordos en el proyecto de estructuras", "-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Ciencia e ingenieria de materiales", "-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Termodinamica", "-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Sin energia", "-", true, 7, 0, 0));

    }

    public String PrestarLibros() {

        return null;
    }

    public void personas() {
        infoPersonas.add(new Persona("-", 7, 0, 0));
    }

    public void bibliotecarios() {
        BibNormales.add(new BNormal("-", "-"));
    }

    public void bibliotecariosMaestro() {
    	 BibMaestros.add(new Maestro("BibliotecaM", "189Maestro"));
    }
    
    public boolean eliminarBibliotecarioNormal(String usuari) {
        for (BNormal bibliotecario : BibNormales) {
            if (bibliotecario.getUsuarioN().equals(usuari)) {
                BibNormales.remove(bibliotecario);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarBibliotecarioMaestro(String usuari) {
        for (Maestro bibliotecario : BibMaestros) {
            if (bibliotecario.getUsuario().equals(usuari)) {
                BibMaestros.remove(bibliotecario);
                return true;
            }
        }
        return false;
    }
    public void eliminarCuenta(String usuari, Ventana ventana) {
        boolean eliminada = eliminarBibliotecarioNormal(usuari) || eliminarBibliotecarioMaestro(usuari);

        if (eliminada) {
            JOptionPane.showMessageDialog(null, "Cuenta eliminada correctamente");
            ventana.Ventana9();
        } else {
            JOptionPane.showMessageDialog(null, "La cuenta no existe");
            ventana.Ueliminar.setText("");
            ventana.Ventana9();
        }
    }

}
