import java.util.*;
import java.awt.*;
import javax.swing.*;


public class Biblioteca {
    public ArrayList<Libro> Terror = new ArrayList<Libro>();
    private ArrayList<Libro> Clasicos = new ArrayList<Libro>();
    private ArrayList<Libro> Ingenieria = new ArrayList<Libro>();
    private ArrayList<Persona> infoPersonas = new ArrayList<Persona>();
    public ArrayList<BNormal> BibNormales = new ArrayList<BNormal>();
    public ArrayList<Maestro> BibMaestros = new ArrayList<Maestro>();
    public HashMap<String, ArrayList<Libro>> listas = new HashMap<String, ArrayList<Libro>>();

    public void HashListas (){
        listas.put("Terror", Terror);
        listas.put("Clasicos", Clasicos);
        listas.put("Ingenieria", Ingenieria);
        //listas.put("infoPersonas", infoPersonas);
        //listas.put("BibNormales", BibNormales);
        //listas.put("BibMaestros", BibMaestros);
    }

    public ArrayList<Libro> HashTerror = (ArrayList<Libro>) listas.get("Terror");
    ArrayList<Libro> HashClasicos = (ArrayList<Libro>) listas.get("Clasicos");
    ArrayList<Libro> HashIngenieria = (ArrayList<Libro>) listas.get("Ingenieria");

    
    public void addCategory(String newLibro,String nombreCategoria){
        ArrayList<Libro> CategoriaSelect = new ArrayList<Libro>();
        listas.put(nombreCategoria, CategoriaSelect); 

    }
    public ArrayList<Libro> getCategoria(String nombreCategoria){
        ArrayList<Libro> cateSelect = (ArrayList<Libro>) (listas.get(nombreCategoria));
        return cateSelect;
    }
    public void LibroCateSelec(String nombreCategoria,String newLibro){   
        ArrayList<Libro> cateSelect = (ArrayList<Libro>) (listas.get(nombreCategoria));     
        cateSelect.add(new Libro(newLibro, "-", true, 7, 0, 0));
    }
    public HashMap<String, ArrayList<Libro>>  getHashListas(){
        return listas;
    }
    public ArrayList<Libro> getHashTerror(){
        
        return HashTerror;
    }
    
    
    
    public Biblioteca() {
        LibrosTerror();
        LibrosClasicos();
        LibrosIngenieria();
        personas();
        bibliotecarios();
        HashListas();
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
    /*Para almacenar las listas de objetos de distintas clases en la clase Biblioteca.java, puedes crear un HashMap que tenga como clave el nombre de la clase y como valor el ArrayList correspondiente. Por ejemplo:

    Copy codeHashMap<String, ArrayList<?>> listas = new HashMap<String, ArrayList<?>>();
    listas.put("Libro", listaLibros);
    listas.put("Revista", listaRevistas);
    listas.put("Pelicula", listaPeliculas);
    De esta forma, puedes acceder a cada lista de objetos de la siguiente manera:

    Copy codeArrayList<Libro> listaLibros = (ArrayList<Libro>) listas.get("Libro");
    ArrayList<Revista> listaRevistas = (ArrayList<Revista>) listas.get("Revista");
    ArrayList<Pelicula> listaPeliculas = (ArrayList<Pelicula>) listas.get("Pelicula");
    De esta forma, puedes acceder a la información de cada lista de manera fácil y organizada.


    Estas seguro de que se escreibe asi: HashMap<String, ArrayList<?>> listas = new HashMap<String, ArrayList<?>>();


    Sí, es correcto. La declaración de la variable 
    listas
    es un HashMap que tiene como clave un String y como valor un ArrayList de cualquier tipo de objeto (
    ArrayList<?>
    ). El signo de interrogación indica que el tipo de objeto que se almacena en el ArrayList puede ser cualquier tipo, lo que permite almacenar listas de objetos de distintas clases en el mismo HashMap.

    La sintaxis completa de la declaración de la variable sería:

    Copy codeHashMap<String, ArrayList<?>> listas = new HashMap<String, ArrayList<?>>();
    Es importante destacar que, al utilizar el signo de interrogación, se pierde la información del tipo de objeto que se almacena en cada lista. Por lo tanto, al acceder a cada lista, es necesario hacer un casting al tipo de objeto correspondiente. */

}
