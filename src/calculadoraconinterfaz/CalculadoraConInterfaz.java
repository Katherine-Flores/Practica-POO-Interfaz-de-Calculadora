/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraconinterfaz;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

/**
 *
 * @author kathe
 */
public class CalculadoraConInterfaz extends JFrame implements ActionListener{

    /**
     * @param args the command line arguments
     */
    private Color fondo = new Color(0, 183, 178);
    private Color pantalla = new Color(240, 238, 200);
    private Color btOperaciones = new Color(4, 140, 151);
    private Color btIgual = new Color(9, 99, 134);
    
    private JPanel panel1;
    private JLabel titulo, marca, carnet, texto, texto2;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
            btnBorrarTodo, btnBorrar, btnDiv, btnMult, btnSum, btnRest, btnPunto,
            btnIgual;
    
    public CalculadoraConInterfaz(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0, 183, 178));
        setTitle("Calculadora");
        setIconImage(new ImageIcon(getClass().getResource("/img/calculadora.png")).getImage());
        
        titulo = new JLabel("By. Katherine Flores");
        titulo.setBounds(25,10,200,15);
        titulo.setFont(new Font("Roboto", 1, 11));
        titulo.setForeground(btIgual);
        add(titulo);
        
        carnet = new JLabel("0909-22-1883");
        carnet.setBounds(250,10,200,15);
        carnet.setFont(new Font("Roboto", 1, 11));
        carnet.setForeground(btIgual);
        add(carnet);
        
        marca = new JLabel();
        marca.setBounds(160,30,200,15);
        marca.setFont(new Font("Roboto", 1, 18));
        marca.setForeground(Color.BLACK);
        add(marca);
        
        texto = new JLabel("¡BIENVENIDO!");
        texto.setBounds(130,20,300,160);
        texto.setFont(new Font("Roboto", 1, 16));
        texto.setForeground(btIgual);
        add(texto);
        
        texto2 = new JLabel("Presione  =  para continuar");
        texto2.setBounds(100,45,300,160);
        texto2.setFont(new Font("Roboto", 1, 14));
        texto2.setForeground(btIgual);
        add(texto2);
        
        btnBorrarTodo = new JButton("C");
        btnBorrarTodo.setBounds(25,220,65,65);
        btnBorrarTodo.setFont(new Font("Roboto", 1, 20));
        btnBorrarTodo.setForeground(pantalla);
        btnBorrarTodo.setBackground(btOperaciones);
        add(btnBorrarTodo);
        
        btnDiv = new JButton("/");
        btnDiv.setBounds(108,220,65,65);
        btnDiv.setFont(new Font("Roboto", 1, 20));
        btnDiv.setForeground(pantalla);
        btnDiv.setBackground(btOperaciones);
        add(btnDiv);
        
        btnMult = new JButton("*");
        btnMult.setBounds(188,220,65,65);
        btnMult.setFont(new Font("Roboto", 1, 20));
        btnMult.setForeground(pantalla);
        btnMult.setBackground(btOperaciones);
        add(btnMult);
        
        btnBorrar = new JButton("<-");
        btnBorrar.setBounds(270,220,65,65);
        btnBorrar.setFont(new Font("Roboto", 1, 20));
        btnBorrar.setForeground(pantalla);
        btnBorrar.setBackground(btOperaciones);
        add(btnBorrar);
        
        btn7 = new JButton("7");
        btn7.setBounds(25,295,65,65);
        btn7.setFont(new Font("Roboto", 1, 20));
        btn7.setForeground(Color.BLACK);
        btn7.setBackground(pantalla);
        add(btn7);
        
        btn8 = new JButton("8");
        btn8.setBounds(108,295,65,65);
        btn8.setFont(new Font("Roboto", 1, 20));
        btn8.setForeground(Color.BLACK);
        btn8.setBackground(pantalla);
        add(btn8);
        
        btn9 = new JButton("9");
        btn9.setBounds(188,295,65,65);
        btn9.setFont(new Font("Roboto", 1, 20));
        btn9.setForeground(Color.BLACK);
        btn9.setBackground(pantalla);
        add(btn9);
        
        btnRest = new JButton("-");
        btnRest.setBounds(270,295,65,65);
        btnRest.setFont(new Font("Roboto", 1, 20));
        btnRest.setForeground(pantalla);
        btnRest.setBackground(btOperaciones);
        add(btnRest);
        
        btn4 = new JButton("4");
        btn4.setBounds(25,370,65,65);
        btn4.setFont(new Font("Roboto", 1, 20));
        btn4.setForeground(Color.BLACK);
        btn4.setBackground(pantalla);
        add(btn4);
        
        btn5 = new JButton("5");
        btn5.setBounds(108,370,65,65);
        btn5.setFont(new Font("Roboto", 1, 20));
        btn5.setForeground(Color.BLACK);
        btn5.setBackground(pantalla);
        add(btn5);
        
        btn6 = new JButton("6");
        btn6.setBounds(188,370,65,65);
        btn6.setFont(new Font("Roboto", 1, 20));
        btn6.setForeground(Color.BLACK);
        btn6.setBackground(pantalla);
        add(btn6);
        
        btnSum = new JButton("+");
        btnSum.setBounds(270,370,65,65);
        btnSum.setFont(new Font("Roboto", 1, 20));
        btnSum.setForeground(pantalla);
        btnSum.setBackground(btOperaciones);
        add(btnSum);
        
        btn1 = new JButton("1");
        btn1.setBounds(25,445,65,65);
        btn1.setFont(new Font("Roboto", 1, 20));
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(pantalla);
        add(btn1);
        
        btn2 = new JButton("2");
        btn2.setBounds(108,445,65,65);
        btn2.setFont(new Font("Roboto", 1, 20));
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(pantalla);
        add(btn2);
        
        btn3 = new JButton("3");
        btn3.setBounds(188,445,65,65);
        btn3.setFont(new Font("Roboto", 1, 20));
        btn3.setForeground(Color.BLACK);
        btn3.setBackground(pantalla);
        add(btn3);
        
        btnIgual = new JButton("=");
        btnIgual.setBounds(270,445,65,140);
        btnIgual.setFont(new Font("Roboto", 1, 20));
        btnIgual.setForeground(pantalla);
        btnIgual.setBackground(btIgual);
        btnIgual.addActionListener(this);
        add(btnIgual);
        
        btn0 = new JButton("0");
        btn0.setBounds(25,520,145,65);
        btn0.setFont(new Font("Roboto", 1, 20));
        btn0.setForeground(Color.BLACK);
        btn0.setBackground(pantalla);
        add(btn0);
        
        btnPunto = new JButton(".");
        btnPunto.setBounds(188,520,65,65);
        btnPunto.setFont(new Font("Roboto", 1, 20));
        btnPunto.setForeground(Color.BLACK);
        btnPunto.setBackground(pantalla);
        add(btnPunto);
        
        panel1 = new JPanel();
        panel1.setBounds(25,50,310,150);
        panel1.setBackground(pantalla);
        add(panel1);
    }
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource()== btnIgual){
        InterfazOperaciones pantallaPrincipal = new InterfazOperaciones();
        pantallaPrincipal.setSize(750,650);
        pantallaPrincipal.setResizable(false);
        pantallaPrincipal.setLocationRelativeTo(null);
        pantallaPrincipal.setVisible(true);
        this.setVisible(false);
    }    
   }
    
    public static void main(String[] args) {
        CalculadoraConInterfaz pantalla = new CalculadoraConInterfaz();
        pantalla.setSize(375,650);
        pantalla.setResizable(false);
        pantalla.setLocationRelativeTo(null);
        pantalla.setVisible(true);
    }
}
