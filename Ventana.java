import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
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
    Color colorBotones1, colorBotones2, ColorFondo, ColorTitulo1, ColorTitulo2;

    public Ventana() {
        colorBotones1 = new Color(100, 116, 162);
        colorBotones2 = new Color(176, 154, 148);
        ColorFondo = new Color(195, 198, 209);
        ColorTitulo1 = new Color(59, 59, 76);
        ColorTitulo2 = new Color(153, 118, 105);

        contenedor = getContentPane();// Ejecutar métodos sobre el contenedor, como añadir otros elementos
        contenedor.setBackground(ColorFondo);

        Mensaje = new JLabel("Bienvenido a su biblioteca virtual");
        Mensaje.setFont(new Font("Times New Roman", Font.BOLD, 18));
        Mensaje.setForeground(ColorTitulo1);
        Mensaje.setBounds(105, 20, 300, 30);

        mensaje1 = new JLabel("Digite sus datos para el ingreso");
        mensaje1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mensaje1.setBounds(123, 50, 300, 40);

        usuario = new JLabel("Ingrese su nombre de usuario");
        usuario.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        usuario.setBounds(30, 90, 300, 40);

        contrasena = new JLabel("Ingrese su contraseña");
        contrasena.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        contrasena.setBounds(30, 140, 300, 40);

        usser = new JTextField();
        usser.setBounds(210, 90, 200, 30);

        password = new JTextField();
        password.setBounds(210, 140, 200, 30);

        TipoU = new JLabel("*Escoja el nombre tipo de usuario*");
        TipoU.setFont(new Font("Times New Roman", Font.BOLD, 14));
        TipoU.setBounds(115, 200, 220, 40);

        BMaestro = new JButton("Blibliotecario maestro");
        BMaestro.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 14));
        BMaestro.setBackground(colorBotones1);
        BMaestro.addActionListener(this);
        BMaestro.setBounds(30, 240, 180, 60);

        BNormal = new JButton("Bibliotecario normal");
        BNormal.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 14));
        BNormal.setBackground(colorBotones1);
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

        bienvenida = new JLabel("Creacion de usuario");
        bienvenida.setFont(new Font("Times New Roman", Font.BOLD, 17));
        bienvenida.setForeground(ColorTitulo2);
        bienvenida.setBounds(170, 30, 250, 30);

        NuevoU = new JLabel("Ingrese el nombre de usuario: ");
        NuevoU.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NuevoU.setBounds(30, 80, 300, 40);

        NuevaC = new JLabel("Ingrese la contraseña");
        NuevaC.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        NuevaC.setBounds(30, 130, 300, 40);

        UNuevo = new JTextField();
        UNuevo.setBounds(210, 80, 200, 30);

        CNuevo = new JTextField();
        CNuevo.setBounds(210, 130, 200, 30);

        confirmar = new JButton("Corfirmar");
        confirmar.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        confirmar.setBackground(colorBotones2);
        confirmar.addActionListener(this);
        confirmar.setBounds(190, 190, 120, 50);

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

        decision = new JLabel("Escoja la accion a realizar");
        decision.setFont(new Font("Times New Roman", Font.BOLD, 17));
        decision.setForeground(ColorTitulo2);
        decision.setBounds(100, 25, 250, 30);

        Prestar = new JLabel("Prestar un libro");
        Prestar.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Prestar.setBounds(25, 75, 100, 30);

        prestar = new JButton("Prestar");
        prestar.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        prestar.setBackground(colorBotones2);
        prestar.addActionListener(this);
        prestar.setBounds(150, 75, 100, 30);

        Devolver = new JLabel("Devolver un libro");
        Devolver.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Devolver.setBounds(25, 135, 120, 30);

        devolver = new JButton("Devolver");
        devolver.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        devolver.setBackground(colorBotones2);
        devolver.addActionListener(this);
        devolver.setBounds(160, 135, 100, 30);

        pMora = new JLabel("Listado de personas en mora");
        pMora.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        pMora.setBounds(25, 195, 200, 30);

        Pmora = new JButton("Multados");
        Pmora.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        Pmora.setBackground(colorBotones2);
        Pmora.addActionListener(this);
        Pmora.setBounds(220, 195, 100, 30);

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

        libros = new JLabel("Lista de libros disponibles");
        libros.setFont(new Font("Times New Roman", Font.BOLD, 19));
        libros.setForeground(ColorTitulo2);
        libros.setBounds(200, 20, 250, 30);

        terror = new JLabel("Libros de terror");
        terror.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        terror.setBounds(70, 60, 250, 30);

        clasicos = new JLabel("Libros clasicos");
        clasicos.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        clasicos.setBounds(230, 60, 250, 30);

        ingenieria = new JLabel("Libros de ingenieria");
        ingenieria.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ingenieria.setBounds(430, 60, 250, 30);

        prestamo = new JButton("Prestar libro");
        prestamo.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        prestamo.setBackground(colorBotones2);
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

        Plibro = new JLabel("PRESTAR UN LIBRO");
        Plibro.setFont(new Font("Times New Roman", Font.BOLD, 19));
        Plibro.setForeground(ColorTitulo2);
        Plibro.setBounds(215, 20, 250, 30);

        genero = new JLabel("Ingrese el genero del libro ");
        genero.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        genero.setBounds(50, 80, 200, 40);

        indice = new JLabel("Ingrese el libro a prestar");
        indice.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        indice.setBounds(350, 80, 200, 40);

        persona = new JLabel("Ingrese el nombre de la persona a cargo del libro");
        persona.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        persona.setBounds(30, 140, 300, 40);

        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        aceptar.setBackground(colorBotones2);
        aceptar.addActionListener(this);
        aceptar.setBounds(230, 200, 150, 40);

        add(Plibro);
        add(genero);
        add(indice);
        add(persona);
        add(aceptar);

        setSize(600, 350);
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

        Nlibros = new JLabel("Lista de libros en prestamo");
        Nlibros.setFont(new Font("Times New Roman", Font.BOLD, 19));
        Nlibros.setForeground(ColorTitulo2);
        Nlibros.setBounds(200, 20, 250, 30);

        terrorN = new JLabel("Libros de terror");
        terrorN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        terrorN.setBounds(70, 60, 250, 30);

        clasicosN = new JLabel("Libros clasicos");
        clasicosN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        clasicosN.setBounds(230, 60, 250, 30);

        ingenieriaN = new JLabel("Libros de ingenieria");
        ingenieriaN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ingenieriaN.setBounds(430, 60, 250, 30);

        devolucion = new JButton("Devolver libro");
        devolucion.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        devolucion.setBackground(colorBotones2);
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

        Dlibro = new JLabel("DEVOLVER UN LIBRO");
        Dlibro.setFont(new Font("Times New Roman", Font.BOLD, 19));
        Dlibro.setForeground(ColorTitulo2);
        Dlibro.setBounds(215, 20, 250, 30);

        generoD = new JLabel("Ingrese el genero del libro ");
        generoD.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        generoD.setBounds(50, 80, 200, 40);

        indiceD = new JLabel("Ingrese el libro a prestar");
        indiceD.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        indiceD.setBounds(350, 80, 200, 40);

        persona = new JLabel("Ingrese el nombre de la persona a cargo del libro");
        persona.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        persona.setBounds(30, 140, 300, 40);

        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        aceptar.setBackground(colorBotones2);
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

        personaM = new JLabel("Listado de personas en Mora");
        personaM.setFont(new Font("Times New Roman", Font.BOLD, 19));
        personaM.setForeground(ColorTitulo2);
        personaM.setBounds(90, 20, 250, 30);

        Npersona = new JLabel("Nombre de la persona");
        Npersona.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Npersona.setBounds(70, 60, 250, 30);

        Cmulta = new JLabel("Multa");
        Cmulta.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Cmulta.setBounds(290, 60, 250, 30);

        diaDevolucion = new JLabel("Dia de la devolucion");
        diaDevolucion.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        diaDevolucion.setBounds(430, 60, 250, 30);

        Pmulta = new JButton("Pagar multa");
        Pmulta.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        Pmulta.setBackground(colorBotones2);
        Pmulta.addActionListener(this);
        Pmulta.setBounds(230, 380, 150, 40);

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

        multa = new JLabel("PAGAR UNA MULTA");
        multa.setFont(new Font("Times New Roman", Font.BOLD, 19));
        multa.setForeground(ColorTitulo2);
        multa.setBounds(215, 20, 250, 30);

        Ppersona = new JLabel("Ingrese el nombre de la persona ");
        Ppersona.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Ppersona.setBounds(50, 80, 200, 40);

        Pcantidad = new JLabel("Ingrese la cantidad a pagar");
        Pcantidad.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        Pcantidad.setBounds(350, 80, 200, 40);

        /*
         * persona = new JLabel("Ingrese el nombre de la persona a cargo del libro");
         * persona.setFont(new Font("Times New Roman",Font.PLAIN, 15));
         * persona.setBounds(30,140,300,40);
         */

        aceptar = new JButton("Aceptar");
        aceptar.setFont(new Font("Times New Roman", Font.ITALIC + Font.BOLD, 15));
        aceptar.setBackground(colorBotones2);
        aceptar.addActionListener(this);
        aceptar.setBounds(230, 200, 150, 40);

        add(multa);
        add(Ppersona);
        add(Pcantidad);
        // add(persona);
        add(aceptar);

        setSize(600, 350);
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

    public static void main(String[] args) {
        new Ventana();
    }

}