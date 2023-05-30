import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener {
    Maestro maestro;
    private Biblioteca biblioteca;

    Container contenedor, contenedorAux, contenedor1;
    JLabel Mensaje, TipoU, mensaje1, usuario, contrasena, bienvenida, NuevoU, NuevaC, decision, Prestar, Devolver,
            pMora;
    JButton BMaestro, BNormal, confirmar, prestar, devolver, Pmora, prestamo, aceptar, aceptar1, devolucion, Pmulta,
            Crear, salir;
    JLabel libros, terror, clasicos, ingenieria, genero, indice, persona, Plibro, Nlibros, terrorN, clasicosN,
            ingenieriaN;
    JLabel Dlibro, generoD, indiceD, personaM, diaDevolucion, Npersona, Cmulta, multa, Ppersona, Pcantidad, crear;
    JTextField usser, password, UNuevo, CNuevo, generoT, personaT, diaD, libroD;
    Color Color_Botones, colorBotones2, ColorFondo, Color_Fuente, ColorTitulo2, comparacion;
    Timer timer;
    private boolean esMaestro = false;

    public Ventana() {
        biblioteca = new Biblioteca();
        // Paleta de Colores
        Color_Botones = new Color(100, 116, 162);
        colorBotones2 = new Color(176, 154, 148);
        ColorFondo = new Color(195, 198, 209);
        Color_Fuente = new Color(59, 59, 76);
        ColorTitulo2 = new Color(153, 118, 105);

        contenedor = getContentPane();// Ejecutar métodos sobre el contenedor, como añadir otros elementos
        animacionColorFondo(contenedor, ColorFondo);

        Mensaje = new JLabel("*◦..°Bienvenido a su biblioteca virtual°◦.*");
        Mensaje.setFont(new Font("Century Gothic", Font.BOLD, 20));
        Mensaje.setForeground(Color_Fuente);
        Mensaje.setBounds(35, 20, 400, 30);

        mensaje1 = new JLabel("Digite sus datos para el ingreso");
        mensaje1.setFont(new Font("Century Gothic", Font.BOLD, 14));
        mensaje1.setForeground(Color_Fuente);
        mensaje1.setBounds(123, 50, 300, 40);

        usuario = new JLabel("°Ingrese su nombre de usuario");
        usuario.setFont(new Font("Century Gothic", Font.BOLD, 12));
        usuario.setForeground(Color_Fuente);
        usuario.setBounds(30, 90, 300, 40);

        contrasena = new JLabel("°Ingrese su contraseña");
        contrasena.setFont(new Font("Century Gothic", Font.BOLD, 12));
        contrasena.setForeground(Color_Fuente);
        contrasena.setBounds(30, 140, 300, 40);

        usser = new JTextField();
        usser.setBounds(210, 90, 200, 30);

        password = new JTextField();
        password.setBounds(210, 140, 200, 30);

        TipoU = new JLabel("*Escoja el tipo de usuario*");
        TipoU.setFont(new Font("Century Gothic", Font.BOLD, 12));
        TipoU.setForeground(Color_Fuente);
        TipoU.setBounds(115, 200, 220, 40);

        BMaestro = new JButton("Bibliotecario maestro");
        BMaestro.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 12));
        BMaestro.setForeground(Color.WHITE);
        BMaestro.setBackground(Color_Botones);
        BMaestro.addActionListener(this);
        BMaestro.setBounds(30, 240, 180, 60);

        BNormal = new JButton("Bibliotecario normal");
        BNormal.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 12));
        BNormal.setForeground(Color.WHITE);
        BNormal.setBackground(Color_Botones);
        BNormal.addActionListener(this);
        BNormal.setBounds(250, 240, 160, 60);

        // Añadir los componentes al contenedor
        contenedor.add(Mensaje);
        contenedor.add(TipoU);
        contenedor.add(BMaestro);
        contenedor.add(BNormal);
        contenedor.add(mensaje1);
        contenedor.add(usuario);
        contenedor.add(contrasena);
        contenedor.add(usser);
        contenedor.add(password);

        // Creacion de la ventana
        setSize(470, 400);
        setTitle("Biblioteca Virtual");
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void Ventana1() {
        getContentPane().removeAll();
        setTitle("Ventana Bibliotecario Maestro");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        bienvenida = new JLabel("° Creacion de usuario °");
        bienvenida.setFont(new Font("Century Gothic", Font.BOLD, 17));
        bienvenida.setForeground(Color_Fuente);
        bienvenida.setBounds(140, 30, 250, 30);

        NuevoU = new JLabel("°Ingrese el nombre de usuario");
        NuevoU.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        NuevoU.setForeground(Color_Fuente);
        NuevoU.setBounds(20, 80, 300, 40);

        NuevaC = new JLabel("°Ingrese la contraseña");
        NuevaC.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        NuevaC.setForeground(Color_Fuente);
        NuevaC.setBounds(20, 130, 300, 40);

        UNuevo = new JTextField();
        UNuevo.setBounds(240, 85, 200, 30);

        CNuevo = new JTextField();
        CNuevo.setBounds(240, 135, 200, 30);

        confirmar = new JButton("Corfirmar");
        confirmar.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        confirmar.setForeground(Color.WHITE);
        confirmar.setBackground(Color_Botones);
        confirmar.addActionListener(this);
        confirmar.setBounds(175, 190, 120, 50);

        add(bienvenida);
        add(NuevoU);
        add(NuevaC);
        add(UNuevo);
        add(CNuevo);
        add(confirmar);

        setSize(470, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana2() {
        getContentPane().removeAll();
        setTitle("Ventana Bibliotecario Normal");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        decision = new JLabel("° Escoja la accion a realizar °");
        decision.setFont(new Font("Century Gothic", Font.BOLD, 17));
        decision.setForeground(Color_Fuente);
        decision.setBounds(85, 25, 250, 30);

        Prestar = new JLabel("°Prestar un libro");
        Prestar.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Prestar.setBounds(25, 75, 150, 30);

        prestar = new JButton("Prestar");
        prestar.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        prestar.setForeground(Color.WHITE);
        prestar.setBackground(Color_Botones);
        prestar.addActionListener(this);
        prestar.setBounds(260, 75, 100, 30);

        Devolver = new JLabel("°Devolver un libro");
        Devolver.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Devolver.setBounds(25, 135, 150, 30);

        devolver = new JButton("Devolver");
        devolver.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        devolver.setForeground(Color.WHITE);
        devolver.setBackground(Color_Botones);
        devolver.addActionListener(this);
        devolver.setBounds(260, 135, 100, 30);

        pMora = new JLabel("Listado de personas en mora");
        pMora.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        pMora.setBounds(25, 195, 250, 30);

        Pmora = new JButton("Multados");
        Pmora.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        Pmora.setForeground(Color.WHITE);
        Pmora.setBackground(Color_Botones);
        Pmora.addActionListener(this);
        Pmora.setBounds(260, 195, 105, 30);

        salir = new JButton("Salir");
        salir.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        salir.setForeground(Color.WHITE);
        salir.setBackground(Color_Botones);
        salir.addActionListener(this);
        salir.setBounds(120, 240, 105, 30);

        add(decision);
        add(Prestar);
        add(prestar);
        add(Devolver);
        add(devolver);
        add(pMora);
        add(Pmora);
        add(salir);

        setSize(400, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana3() {
        getContentPane().removeAll();
        setTitle("Libros disponibles");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        libros = new JLabel("Lista de libros disponibles");
        libros.setFont(new Font("Century Gothic", Font.BOLD, 19));
        libros.setForeground(Color_Fuente);
        libros.setBounds(215, 20, 250, 30);

        terror = new JLabel("Libros de terror");
        terror.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        terror.setForeground(Color_Fuente);
        terror.setBounds(55, 60, 250, 30);

        clasicos = new JLabel("Libros clasicos");
        clasicos.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        clasicos.setForeground(Color_Fuente);
        clasicos.setBounds(235, 60, 250, 30);

        ingenieria = new JLabel("Libros de ingenieria");
        ingenieria.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        ingenieria.setForeground(Color_Fuente);
        ingenieria.setBounds(460, 60, 250, 30);

        prestamo = new JButton("Prestar libro");
        prestamo.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        prestamo.setForeground(Color.WHITE);
        prestamo.setBackground(Color_Botones);
        prestamo.addActionListener(this);
        prestamo.setBounds(260, 310, 150, 40);

        add(libros);
        add(terror);
        add(clasicos);
        add(ingenieria);
        add(prestamo);

        setSize(710, 425);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana4() {
        getContentPane().removeAll();
        setTitle("Prestamo libros");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        Plibro = new JLabel("PRESTAR UN LIBRO");
        Plibro.setFont(new Font("Century Gothic", Font.BOLD, 19));
        Plibro.setForeground(Color_Fuente);
        Plibro.setBounds(180, 20, 250, 30);

        /*genero = new JLabel("°Ingrese el genero del libro: ");
        genero.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        genero.setForeground(Color_Fuente);
        genero.setBounds(30, 65, 300, 40);*/
        
        indice = new JLabel("°Ingrese el libro a prestar: ");
        indice.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        indice.setForeground(Color_Fuente);
        indice.setBounds(30, 85, 300, 40);

        generoT= new JTextField();
        generoT.setBounds(250, 85, 240, 40);
        
        persona = new JLabel("°Ingrese el nombre de la persona: ");
        persona.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        persona.setForeground(Color_Fuente);
        persona.setBounds(30, 145, 400, 50);

        personaT= new JTextField();
        personaT.setBounds(280, 145, 240, 40);

        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        aceptar.setForeground(Color.WHITE);
        aceptar.setBackground(Color_Botones);
        aceptar.addActionListener(this);
        aceptar.setBounds(190, 200, 150, 40);

        add(Plibro);
        //add(genero);
        add(generoT);
        add(indice);
        add(persona);
        add(personaT);
        add(aceptar);

        setSize(550, 290);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void Ventana5() {
        getContentPane().removeAll();
        setTitle("Devolucion libros");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        Nlibros = new JLabel("Lista de libros en prestamo");
        Nlibros.setFont(new Font("Century Gothic", Font.BOLD, 19));
        Nlibros.setForeground(Color_Fuente);
        Nlibros.setBounds(220, 20, 250, 30);

        terrorN = new JLabel("Libros de terror");
        terrorN.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        terrorN.setForeground(Color_Fuente);
        terrorN.setBounds(55, 60, 250, 30);

        clasicosN = new JLabel("Libros clasicos");
        clasicosN.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        clasicosN.setForeground(Color_Fuente);
        clasicosN.setBounds(235, 60, 250, 30);

        ingenieriaN = new JLabel("Libros de ingenieria");
        ingenieriaN.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        ingenieriaN.setForeground(Color_Fuente);
        ingenieriaN.setBounds(460, 60, 250, 30);

        devolucion = new JButton("Devolver libro");
        devolucion.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        devolucion.setForeground(Color.WHITE);
        devolucion.setBackground(Color_Botones);
        devolucion.addActionListener(this);
        devolucion.setBounds(260, 310, 150, 40);

        add(Nlibros);
        add(terrorN);
        add(clasicosN);
        add(ingenieriaN);
        add(devolucion);

        setSize(710, 425);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana6() {
        getContentPane().removeAll();
        setTitle("Devolucion libros");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        Dlibro = new JLabel("DEVOLVER UN LIBRO");
        Dlibro.setFont(new Font("Century Gothic", Font.BOLD, 19));
        Dlibro.setForeground(Color_Fuente);
        Dlibro.setBounds(215, 20, 250, 30);

        /*generoD = new JLabel("Ingrese el genero del libro: ");
        generoD.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        generoD.setBounds(30, 80, 200, 40);*/

        indiceD = new JLabel("Ingrese el libro a devolver:");
        indiceD.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        indiceD.setBounds(30, 85, 200, 40);

        libroD = new JTextField();
        libroD.setBounds(230, 85, 200, 40);

        persona = new JLabel("Ingrese el dia de devolucion: ");
        persona.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        persona.setBounds(30, 170, 400, 40);

        diaD = new JTextField();
        diaD.setBounds(290,170,40,40);

        aceptar1 = new JButton("Aceptar");
        aceptar1.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        aceptar1.setBackground(Color_Botones);
        aceptar1.addActionListener(this);
        aceptar1.setBounds(230, 230, 150, 40);

        add(Dlibro);
        //add(generoD);
        add(indiceD);
        add(libroD);
        add(persona);
        add(diaD);
        add(aceptar1);

        setSize(600, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana7() {
        getContentPane().removeAll();
        setTitle("Personas en mora");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        personaM = new JLabel("Listado de personas en Mora");
        personaM.setFont(new Font("Century Gothic", Font.BOLD, 19));
        personaM.setForeground(Color_Fuente);
        personaM.setBounds(85, 20, 300, 30);

        Npersona = new JLabel("Nombre de la persona");
        Npersona.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Npersona.setBounds(70, 60, 250, 30);

        Cmulta = new JLabel("Multa");
        Cmulta.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Cmulta.setForeground(Color_Fuente);
        Cmulta.setBounds(290, 60, 250, 30);

        diaDevolucion = new JLabel("Dia de la devolucion");
        diaDevolucion.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        diaDevolucion.setForeground(Color_Fuente);
        diaDevolucion.setBounds(430, 60, 250, 30);

        Pmulta = new JButton("Pagar multa");
        Pmulta.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        Pmulta.setForeground(Color.WHITE);
        Pmulta.setBackground(Color_Botones);
        Pmulta.addActionListener(this);
        Pmulta.setBounds(140, 380, 150, 40);

        add(personaM);
        add(Npersona);
        add(Cmulta);
        add(diaDevolucion);
        add(Pmulta);

        setSize(420, 480);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana8() {
        getContentPane().removeAll();
        setTitle("Pagar multa");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        multa = new JLabel("PAGAR UNA MULTA");
        multa.setFont(new Font("Century Gothic", Font.BOLD, 19));
        multa.setForeground(Color_Fuente);
        multa.setBounds(215, 20, 250, 30);

        Ppersona = new JLabel("Ingrese el nombre de la persona: ");
        Ppersona.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Ppersona.setForeground(Color_Fuente);
        Ppersona.setBounds(50, 80, 250, 40);

        Pcantidad = new JLabel("Ingrese la cantidad a pagar: ");
        Pcantidad.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Pcantidad.setForeground(Color_Fuente);
        Pcantidad.setBounds(50, 130, 250, 40);

        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        aceptar.setForeground(Color.WHITE);
        aceptar.setBackground(Color_Botones);
        aceptar.addActionListener(this);
        aceptar.setBounds(230, 200, 150, 40);

        add(multa);
        add(Ppersona);
        add(Pcantidad);
        // add(persona);
        add(aceptar);

        setSize(600, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana9() {
        getContentPane().removeAll();
        setTitle("Ventana Bibliotecario Normal");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        decision = new JLabel("° Escoja la accion a realizar °");
        decision.setFont(new Font("Century Gothic", Font.BOLD, 17));
        decision.setForeground(Color_Fuente);
        decision.setBounds(85, 25, 250, 30);

        crear = new JLabel("° Crear nuevo usuario");
        crear.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        crear.setBounds(25, 75, 170, 30);

        Crear = new JButton("Crear");
        Crear.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        Crear.setForeground(Color.WHITE);
        Crear.setBackground(Color_Botones);
        Crear.addActionListener(this);
        Crear.setBounds(260, 75, 100, 30);

        Prestar = new JLabel("°Prestar un libro");
        Prestar.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Prestar.setBounds(25, 135, 150, 30);

        prestar = new JButton("Prestar");
        prestar.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        prestar.setForeground(Color.WHITE);
        prestar.setBackground(Color_Botones);
        prestar.addActionListener(this);
        prestar.setBounds(260, 135, 100, 30);

        Devolver = new JLabel("°Devolver un libro");
        Devolver.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Devolver.setBounds(25, 195, 150, 30);

        devolver = new JButton("Devolver");
        devolver.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        devolver.setForeground(Color.WHITE);
        devolver.setBackground(Color_Botones);
        devolver.addActionListener(this);
        devolver.setBounds(260, 195, 100, 30);

        pMora = new JLabel("°Listado de personas en mora");
        pMora.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        pMora.setBounds(25, 255, 250, 30);

        Pmora = new JButton("Multados");
        Pmora.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        Pmora.setForeground(Color.WHITE);
        Pmora.setBackground(Color_Botones);
        Pmora.addActionListener(this);
        Pmora.setBounds(260, 255, 105, 30);

        salir = new JButton("Salir");
        salir.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        salir.setForeground(Color.WHITE);
        salir.setBackground(Color_Botones);
        salir.addActionListener(this);
        salir.setBounds(140, 300, 105, 30);

        add(decision);
        add(crear);
        add(Crear);
        add(Prestar);
        add(prestar);
        add(Devolver);
        add(devolver);
        add(pMora);
        add(Pmora);
        add(salir);

        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

<<<<<<< HEAD
    public void mostarNombresLibrosT(ArrayList<Libro> Terror) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(30, 100, 160, 190);
        StringBuilder nombresLibros = new StringBuilder();
        for (Libro libro : Terror) {
            if (libro.isEstado() == true) {
                nombresLibros.append("\n" + " " + libro.getNombre() + "\n");
                // nombresLibros.append("\n").append(" " +libro.getNombre()).append("\n");
            }
        }
        areaTexto.setText(nombresLibros.toString());

        contenedor.add(areaTexto);
        revalidate();
        repaint();
        setVisible(true);
    }

    public void mostarNombresLibrosNoT(ArrayList<Libro> Terror) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(30, 100, 160, 190);
        StringBuilder nombresLibros = new StringBuilder();
        for (Libro libro : Terror) {
            if (libro.isEstado() == false) {
                nombresLibros.append("\n" + " " + libro.getNombre() + "\n");
            }
        }
        areaTexto.setText(nombresLibros.toString());

=======
    //Mostrar los libros dispobiles para el prestamo en la ventana por medio de un JTextArea
    public void mostarNombresLibrosT(ArrayList<Libro> Terror){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(30, 100,160,190);
        StringBuilder nombresLibros= new StringBuilder();
        for(Libro libro : Terror){
            if(libro.isEstado()==true){ //Si el libro esta disponible se imprime el nombre en la lista de disponibles
                nombresLibros.append("\n" + " " + libro.getNombre() +"\n"); 
            }
        }
        areaTexto.setText(nombresLibros.toString());
>>>>>>> 9390fd72adeb393cc53453ed5a31132fbad5dc74
        contenedor.add(areaTexto);
        revalidate();
        repaint();
    }

    public void mostarNombresLibrosC(ArrayList<Libro> Clasicos) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
<<<<<<< HEAD
        areaTexto.setBounds(210, 100, 160, 190);
        StringBuilder nombresLibros = new StringBuilder();
        for (Libro libro : Clasicos) {
            if (libro.isEstado() == true) {
                nombresLibros.append("\n" + " " + libro.getNombre() + "\n");
=======
        areaTexto.setBounds(210, 100,160,190);
        StringBuilder nombresLibros= new StringBuilder();
        for(Libro libro : Clasicos){
            if(libro.isEstado()==true){//Si el libro esta disponible se imprime el nombre en la lista de disponibles
                nombresLibros.append("\n" + " " + libro.getNombre() +"\n");
            }
        }  
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
    }
    
    public void mostarNombresLibrosI(ArrayList<Libro> Ingenieria){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(400, 100,275,190);
        StringBuilder nombresLibros= new StringBuilder();
        for(Libro libro : Ingenieria){
            if(libro.isEstado()==true){//Si el libro esta disponible se imprime el nombre en la lista de disponibles
                nombresLibros.append("\n" + " " + libro.getNombre() +"\n");
            }
        }
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
    }
    
     //Mostrar los libros que estan en la lista de no disponibles en la ventana por medio de un JTextArea
    public void mostarNombresLibrosNoT(ArrayList<Libro> Terror){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(30, 100,160,190);
        StringBuilder nombresLibros= new StringBuilder();
        for(Libro libro: Terror){
            if(libro.isEstado()==false){
                nombresLibros.append("\n" + " " + libro.getNombre() +"\n");
            }
        }
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
    }
    
    public void mostarNombresLibrosNoC(ArrayList<Libro> Clasicos){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(210, 100,160,190);
        StringBuilder nombresLibros= new StringBuilder();
        for(Libro libro : Clasicos){
            if(libro.isEstado()==false){
                nombresLibros.append("\n" + " " + libro.getNombre() +"\n");
            }
        }  
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
    }

    public void mostarNombresLibrosNoI(ArrayList<Libro> Ingenieria){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(390, 100,275,180);
        StringBuilder nombresLibros= new StringBuilder();
        for(Libro libro : Ingenieria){
            if(libro.isEstado()==false){
                nombresLibros.append("\n" + " " + libro.getNombre() +"\n");
>>>>>>> 9390fd72adeb393cc53453ed5a31132fbad5dc74
            }
        }
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
    }

<<<<<<< HEAD
    public void mostarNombresLibrosNoC(ArrayList<Libro> Clasicos) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(210, 100, 160, 190);
        StringBuilder nombresLibros = new StringBuilder();
        for (Libro libro : Clasicos) {
            if (libro.isEstado() == false) {
                nombresLibros.append("\n" + " " + libro.getNombre() + "\n");
            }
        }
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
        // setVisible(true);
    }

    public void mostarNombresLibrosI(ArrayList<Libro> Ingenieria) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(400, 100, 275, 190);
        StringBuilder nombresLibros = new StringBuilder();
        for (Libro libro : Ingenieria) {
            if (libro.isEstado() == true) {
                nombresLibros.append("\n" + " " + libro.getNombre() + "\n");
            }
        }
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
        // setVisible(true);
    }

    public void mostarNombresLibrosNoI(ArrayList<Libro> Ingenieria) {
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        areaTexto.setBounds(390, 100, 275, 180);
        StringBuilder nombresLibros = new StringBuilder();
        for (Libro libro : Ingenieria) {
            if (libro.isEstado() == false) {
                nombresLibros.append("\n" + " " + libro.getNombre() + "\n");
            }
        }
        areaTexto.setText(nombresLibros.toString());
        contenedor.add(areaTexto);
        revalidate();
        repaint();
    }

    public void CambiarEstadoT(ArrayList<Libro> Terror) {
        /*
         * for(Libro libro:Terror){
         * libro.setEstado(false);
         * }
         */
    }

    public void CambiarEstadoC(ArrayList<Libro> Clasicos) {
        for (Libro libro : Clasicos) {
            libro.setEstado(false);
        }
    }

    public void CambiarEstadoI(ArrayList<Libro> Ingenieria) {
        for (Libro libro : Ingenieria) {
            libro.setEstado(false);
=======
    //Asignar el libro a un usuario y cambiar el estado de a False
    public void CambiarEstadoT(ArrayList<Libro> Terror){
        for(Libro libro : Terror){
            if(libro.getNombre().equalsIgnoreCase(generoT.getText())){
                libro.setEstado(false);
                libro.setNombrePersona(personaT.getText());
                System.out.println(libro.isEstado() +libro.getNombrePersona());
            }else{
                System.out.println(libro.isEstado()+libro.getNombrePersona());
            }
        
        }
    }

    public void CambiarEstadoC(ArrayList<Libro> Clasicos){
        for(Libro libro : Clasicos){
            if(libro.getNombre().equalsIgnoreCase(generoT.getText())){
                libro.setEstado(false);
                libro.setNombrePersona(personaT.getText());
                System.out.println(libro.isEstado() +libro.getNombrePersona());
            }else{
                System.out.println(libro.isEstado()+libro.getNombrePersona());
            }
        
        }
    }

    public void CambiarEstadoI(ArrayList<Libro> Ingenieria){
        for(Libro libro : Ingenieria){
            if(libro.getNombre().equalsIgnoreCase(generoT.getText())){
                libro.setEstado(false);
                libro.setNombrePersona(personaT.getText());
                System.out.println(libro.isEstado() +libro.getNombrePersona());
            }else{
                System.out.println(libro.isEstado()+libro.getNombrePersona());
            }
        
>>>>>>> 9390fd72adeb393cc53453ed5a31132fbad5dc74
        }
    }

    //Devolver el libro y cambiar el estado a True
    public void CambiarEstadoNoT(ArrayList<Libro> Terror){
        for(Libro libro : Terror){
            if(libro.getNombre().equalsIgnoreCase(libroD.getText())){
                libro.setEstado(true);
                System.out.println(libro.isEstado()+libro.getNombrePersona());        
            }
        }
    }

    public void CambiarEstadoNoC(ArrayList<Libro> Clasicos){
        for(Libro libro : Clasicos){
            if(libro.getNombre().equalsIgnoreCase(libroD.getText())){
                libro.setEstado(true);
                System.out.println(libro.isEstado()+libro.getNombrePersona());        
            }       
        }
    }

    public void CambiarEstadoNoI(ArrayList<Libro> Ingenieria){
        for(Libro libro : Ingenieria){
            if(libro.getNombre().equalsIgnoreCase(libroD.getText())){
                libro.setEstado(true);
                System.out.println(libro.isEstado()+libro.getNombrePersona());        
            }        
        }
    }

    //Comparar los datos ingresados en el JTextField con los valores predeterminados
    public void CompararMaestro() {
        String usser2 = usser.getText();
        String password2 = password.getText();
        Maestro maestro = new Maestro("BibliotecaM", "189Maestro");
<<<<<<< HEAD
        boolean verificar = maestro.Cuenta(usser2, password2);
        if (verificar) {
            Ventana9();
        } else {
=======
        boolean verificar = maestro.Cuenta(usser2, password2);//Determinar si es true o false
        if (verificar) {// True, continua el programa
        	Ventana9();
        }else {// False, borra los datos
>>>>>>> 9390fd72adeb393cc53453ed5a31132fbad5dc74
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
            usser.setText(" ");
            password.setText(" ");
        }

    }

    public void actionPerformed(ActionEvent e) {
        JButton pb = (JButton) e.getSource();
        if (pb == BMaestro) {
            esMaestro = true;
            CompararMaestro();
        }
        if (pb == BNormal) {
            Ventana2();
        }
        if (pb == confirmar) {
            Ventana9();
        }
        if (pb == prestar) {
            Ventana3();
            mostarNombresLibrosT(biblioteca.getLibrosTerror());
            mostarNombresLibrosC(biblioteca.getLibrosClasicos());
            mostarNombresLibrosI(biblioteca.getLibrosIngenieria());
        }
        if (pb == devolver) {
            Ventana5();
            mostarNombresLibrosNoT(biblioteca.getLibrosTerror());
            mostarNombresLibrosNoC(biblioteca.getLibrosClasicos());
            mostarNombresLibrosNoI(biblioteca.getLibrosIngenieria());
        }
        if (pb == Pmora) {
            Ventana7();
        }
        if (pb == prestamo) {
            Ventana4();
        }
        if (pb == aceptar) {
<<<<<<< HEAD
            if (esMaestro) {
                Ventana9();
            } else {
=======
            if (esMaestro){
                CambiarEstadoT(biblioteca.getLibrosTerror());
                CambiarEstadoC(biblioteca.getLibrosClasicos());
                CambiarEstadoI(biblioteca.getLibrosIngenieria());
                Ventana9();
            }else{
                CambiarEstadoT(biblioteca.getLibrosTerror());
                CambiarEstadoC(biblioteca.getLibrosClasicos());
                CambiarEstadoI(biblioteca.getLibrosIngenieria());
                Ventana2();
            }  
        }
        if (pb == aceptar1) {
            if (esMaestro){
                CambiarEstadoNoT(biblioteca.getLibrosTerror());
                CambiarEstadoNoC(biblioteca.getLibrosClasicos());
                CambiarEstadoNoI(biblioteca.getLibrosIngenieria());
                Ventana9();
            }else{
                CambiarEstadoNoT(biblioteca.getLibrosTerror());
                CambiarEstadoNoC(biblioteca.getLibrosClasicos());
                CambiarEstadoNoI(biblioteca.getLibrosIngenieria());
>>>>>>> 9390fd72adeb393cc53453ed5a31132fbad5dc74
                Ventana2();
            }
        }
        if (pb == devolucion) {
            Ventana6();
        }
        if (pb == Pmulta) {
            Ventana8();
        }
        if (pb == Crear) {
            Ventana1();
        }
        if (pb == salir) {
            esMaestro = !esMaestro;
            setVisible(false);
            new Ventana().setVisible(true);
        }

    }

<<<<<<< HEAD
    // Metodo que anima el fondo con un degradado
=======


    //Metodo que anima el fondo con un degradado
>>>>>>> 9390fd72adeb393cc53453ed5a31132fbad5dc74
    public void animacionColorFondo(Container c, Color initialColor) {
        comparacion = new Color(initialColor.getRed() - 59, initialColor.getGreen() - 59,
                initialColor.getBlue() - 59);

        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (initialColor.getRed() == comparacion.getRed() &&
                        initialColor.getGreen() == comparacion.getGreen() &&
                        initialColor.getBlue() == comparacion.getBlue()) {
                    timer.stop();
                    // System.out.println("No se");
                } else {
                    // System.out.println("Sera");
                    c.setBackground(comparacion);
                    comparacion = new Color(comparacion.getRed() + 1, comparacion.getGreen() + 1,
                            comparacion.getBlue() + 1);
                }
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        new Ventana();
    }

}
