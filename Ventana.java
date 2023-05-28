import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;

public class Ventana extends JFrame implements ActionListener {
    // Maestro maestro;
    // Biblioteca biblioteca;

    Container contenedor, contenedorAux, contenedor1;
    JLabel Mensaje, TipoU, mensaje1, usuario, contrasena, bienvenida, NuevoU, NuevaC, decision, Prestar, Devolver,
            pMora;
    JButton BMaestro, BNormal, confirmar, prestar, devolver, Pmora, prestamo, aceptar, devolucion, Pmulta;
    JLabel libros, terror, clasicos, ingenieria, genero, indice, persona, Plibro, Nlibros, terrorN, clasicosN,
            ingenieriaN;
    JLabel Dlibro, generoD, indiceD, personaM, diaDevolucion, Npersona, Cmulta, multa, Ppersona, Pcantidad;
    JTextField usser, password, UNuevo, CNuevo;
    Color Color_Botones, colorBotones2, ColorFondo, Color_Fuente, ColorTitulo2, comparacion;
    Timer timer;

    public Ventana() {
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

        TipoU = new JLabel("*Escoja el nombre tipo de usuario*");
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

        add(decision);
        add(Prestar);
        add(prestar);
        add(Devolver);
        add(devolver);
        add(pMora);
        add(Pmora);

        setSize(400, 300);
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
        libros.setBounds(195, 20, 250, 30);

        terror = new JLabel("Libros de terror");
        terror.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        terror.setForeground(Color_Fuente);
        terror.setBounds(70, 60, 250, 30);

        clasicos = new JLabel("Libros clasicos");
        clasicos.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        clasicos.setForeground(Color_Fuente);
        clasicos.setBounds(250, 60, 250, 30);

        ingenieria = new JLabel("Libros de ingenieria");
        ingenieria.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        ingenieria.setForeground(Color_Fuente);
        ingenieria.setBounds(400, 60, 250, 30);

        prestamo = new JButton("Prestar libro");
        prestamo.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        prestamo.setForeground(Color.WHITE);
        prestamo.setBackground(Color_Botones);
        prestamo.addActionListener(this);
        prestamo.setBounds(230, 380, 150, 40);

        add(libros);
        add(terror);
        add(clasicos);
        add(ingenieria);
        add(prestamo);

        setSize(600, 480);
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
        Plibro.setBounds(160, 20, 250, 30);

        genero = new JLabel("°Ingrese el genero del libro: ");
        genero.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        genero.setForeground(Color_Fuente);
        genero.setBounds(30, 80, 300, 40);

        indice = new JLabel("°Ingrese el libro a prestar");
        indice.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        indice.setForeground(Color_Fuente);
        indice.setBounds(30, 110, 300, 40);

        persona = new JLabel("°Ingrese el nombre de la persona\n a cargo del libro: ");
        persona.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        persona.setForeground(Color_Fuente);
        persona.setBounds(30, 140, 400, 50);

        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        aceptar.setForeground(Color.WHITE);
        aceptar.setBackground(Color_Botones);
        aceptar.addActionListener(this);
        aceptar.setBounds(170, 200, 150, 40);

        add(Plibro);
        add(genero);
        add(indice);
        add(persona);
        add(aceptar);

        setSize(500, 290);
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
        Nlibros.setBounds(200, 20, 250, 30);

        terrorN = new JLabel("Libros de terror");
        terrorN.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        terrorN.setForeground(Color_Fuente);
        terrorN.setBounds(70, 60, 250, 30);

        clasicosN = new JLabel("Libros clasicos");
        clasicosN.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        clasicosN.setForeground(Color_Fuente);
        clasicosN.setBounds(250, 60, 250, 30);

        ingenieriaN = new JLabel("Libros de ingenieria");
        ingenieriaN.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        ingenieriaN.setForeground(Color_Fuente);
        ingenieriaN.setBounds(400, 60, 250, 30);

        devolucion = new JButton("Devolver libro");
        devolucion.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        devolucion.setForeground(Color.WHITE);
        devolucion.setBackground(Color_Botones);
        devolucion.addActionListener(this);
        devolucion.setBounds(230, 380, 150, 40);

        add(Nlibros);
        add(terrorN);
        add(clasicosN);
        add(ingenieriaN);
        add(devolucion);

        setSize(600, 480);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void Ventana6() {
        getContentPane().removeAll();
        setTitle("Prestamo libros");
        revalidate();
        repaint();
        animacionColorFondo(contenedor, ColorFondo);

        Dlibro = new JLabel("DEVOLVER UN LIBRO");
        Dlibro.setFont(new Font("Century Gothic", Font.BOLD, 19));
        Dlibro.setForeground(Color_Fuente);
        Dlibro.setBounds(215, 20, 250, 30);

        generoD = new JLabel("Ingrese el genero del libro ");
        generoD.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        generoD.setBounds(50, 80, 200, 40);

        indiceD = new JLabel("Ingrese el libro a prestar");
        indiceD.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        indiceD.setBounds(350, 80, 200, 40);

        persona = new JLabel("Ingrese el nombre de la persona a cargo del libro");
        persona.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        persona.setBounds(30, 140, 400, 40);

        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Century Gothic", Font.ITALIC + Font.BOLD, 15));
        aceptar.setBackground(Color_Botones);
        aceptar.addActionListener(this);
        aceptar.setBounds(230, 200, 150, 40);

        add(Dlibro);
        add(generoD);
        add(indiceD);
        add(persona);
        add(aceptar);

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

        Ppersona = new JLabel("Ingrese el nombre de la persona ");
        Ppersona.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Ppersona.setForeground(Color_Fuente);
        Ppersona.setBounds(50, 80, 250, 40);

        Pcantidad = new JLabel("Ingrese la cantidad a pagar");
        Pcantidad.setFont(new Font("Century Gothic", Font.PLAIN, 15));
        Pcantidad.setForeground(Color_Fuente);
        Pcantidad.setBounds(350, 80, 250, 40);

        /*
         * persona = new JLabel("Ingrese el nombre de la persona a cargo del libro");
         * persona.setFont(new Font("Century Gothic",Font.PLAIN, 15));
         * persona.setBounds(30,140,300,40);
         */

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

    public void Comparar() {
        String usser2 = usser.getText();
        String password2 = password.getText();
        Maestro maestro = new Maestro("BibliotecaM", "189Maestro");
        maestro.Cuenta(usser2, password2);
        // Ventana1();
    }

    public void actionPerformed(ActionEvent e) {
        JButton pb = (JButton) e.getSource();
        if (pb == BMaestro) {
            Comparar();
            Ventana1();
        }
        if (pb == BNormal) {
            System.out.println(".|.");
            Ventana2();
        }
        if (pb == confirmar) {
            System.out.println("Hola");
            setVisible(false);
            new Ventana().setVisible(true);
        }
        if (pb == prestar) {
            System.out.println("ggggg");
            Ventana3();
        }
        if (pb == devolver) {
            System.out.println("3493275");
            Ventana5();
        }
        if (pb == Pmora) {
            System.out.println("bjv9r38tgf34");
            Ventana7();
        }
        if (pb == prestamo) {
            setVisible(false);
            Ventana4();
        }
        if (pb == aceptar) {
            Ventana2();
        }
        if (pb == devolucion) {
            Ventana6();
        }
        if (pb == Pmulta) {
            Ventana8();
        }

    }


    //Metodo que anima el fondo con un degradado
    public void animacionColorFondo(Container c, Color initialColor) {
        comparacion = new Color(initialColor.getRed() - 59, initialColor.getGreen() - 59,
                initialColor.getBlue() - 59);

        timer = new Timer(0, new ActionListener() {
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