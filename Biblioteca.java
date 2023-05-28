import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> Terror=new ArrayList<Libro>() ;
    private ArrayList<Libro> Clasicos=new ArrayList<Libro>() ;
    private ArrayList<Libro> Ingenieria=new ArrayList<Libro>() ;

    public Biblioteca(){
        LibrosTerror();
        LibrosClasicos();
        LibrosIngenieria();
    }

    public ArrayList<Libro> getLibrosTerror(){
        return Terror;
    }
    
    public ArrayList<Libro> getLibrosClasicos(){
        return Clasicos;
    }

    public ArrayList<Libro> getLibrosIngenieria(){
        return Ingenieria;
    }

    public void LibrosTerror(){
        Terror.add(new Libro("It", "-", true, 7, 0, 0));
        Terror.add(new Libro("El resplandor","-", true, 7, 0, 0));
        Terror.add(new Libro("El visitante","-", true, 7, 0, 0));
        Terror.add(new Libro("Narraciones extraordinarias","-", true,7, 0, 0));
        Terror.add(new Libro("Frankestein","-", true, 7, 0, 0));
    }

    public void LibrosClasicos(){
        Clasicos.add(new Libro("Orgullo y prejuicio","-", true,7, 0, 0));
        Clasicos.add(new Libro("Don quijote de la mancha","-", true,7, 0, 0));
        Clasicos.add(new Libro("La metamorfosis","-", true, 7, 0, 0));
        Clasicos.add(new Libro("El principito","-", true, 7, 0, 0));
        Clasicos.add(new Libro("Crimen y castigo","-", true, 7, 0, 0));
    }

    public void LibrosIngenieria(){
        Ingenieria.add(new Libro("La ingeniería es humana","-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Números Gordos en el proyecto de estructuras","-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Ciencia e ingeniería de materiales","-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Termodinámica","-", true, 7, 0, 0));
        Ingenieria.add(new Libro("Sin energía","-", true, 7, 0, 0));
    }
    

    public String PrestarLibros(){
        
        return null;

    }

    /*public double Multa(){
        if(diaDevolucion<=7){
            return 0;
        }else{
            multa=(diaDevolucion-7)(1000);
            return multa;
        }
        
        return 0;

    }*/
}
