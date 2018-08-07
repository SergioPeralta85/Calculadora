package Pruebas;

import javax.swing.*;
import java.awt.*;

public class MarcoCalculadora extends JFrame {
    public MarcoCalculadora(){
        Toolkit miPantalla=Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla=miPantalla.getScreenSize();
        setTitle("Calculadora");
        Pantalla Pantalla_1=new Pantalla();
        add(Pantalla_1);
        Image miIcono=miPantalla.getImage("src/Noa.jpeg");
        setIconImage(miIcono);
        setVisible(true);
        pack();
    }
}
class Pantalla extends JPanel{
    public Pantalla(){

        setLayout(new BorderLayout());
        JButton lamina_1=new JButton("0");
        lamina_1.setEnabled(false);
        add(lamina_1,BorderLayout.NORTH);


        lamina_2=new JPanel();
        lamina_2.setLayout(new GridLayout(4,4));
        ponerBoton("7");
        ponerBoton("8");
        ponerBoton("9");
        ponerBoton("/");

        ponerBoton("4");
        ponerBoton("5");
        ponerBoton("6");
        ponerBoton("*");

        ponerBoton("1");
        ponerBoton("2");
        ponerBoton("3");
        ponerBoton("-");

        ponerBoton("0");
        ponerBoton(",");
        ponerBoton("+");
        ponerBoton("=");

        add(lamina_2,BorderLayout.CENTER);
    }
    private void ponerBoton(String rotulo){


        JButton boton=new JButton(rotulo);
        lamina_2.add(boton);
}
    private JPanel lamina_2;
}