/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class InterfazOperaciones extends JFrame implements ActionListener, ChangeListener, ItemListener{
    
    Calculadora calculadora = new Calculadora("JP");
    CalculadoraEspecial especial = new CalculadoraEspecial("KF");
    
    //Declaración de las variables de los colores que se utilizarán
    private Color fondo = new Color(0, 183, 178);
    private Color pantalla = new Color(240, 238, 200);
    private Color btOperaciones = new Color(4, 140, 151);
    private Color btIgual = new Color(9, 99, 134);
    
    //Componentes de la interfaz
    private JPanel panel1, panel2;
    private JLabel titulo, texto, texto2, carnet, marca, textTipoCalculadora, num1, num2;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnBorrarTodo, 
            btnBorrar, btnDiv, btnMult, btnSum, btnRest, btnPunto, btnIgual, calcular;
    private JComboBox tipoCalculadora1, tipoCalculadora2;
    private JRadioButton radio1, radio2;
    private ButtonGroup bg;
    private JTextField numero1, numero2;
    
    public InterfazOperaciones(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0, 183, 178));
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
        
        texto = new JLabel();
        texto.setBounds(130,20,300,160);
        texto.setFont(new Font("Roboto", 1, 16));
        texto.setForeground(btIgual);
        add(texto);
        texto.setVisible(false);
        
        texto2 = new JLabel();
        texto2.setBounds(100,45,300,160);
        texto2.setFont(new Font("Roboto", 1, 14));
        texto2.setForeground(btIgual);
        add(texto2);
        texto2.setVisible(false);
        
        textTipoCalculadora = new JLabel("Elija el tipo de calculadora que desea utilizar");
        textTipoCalculadora.setBounds(385,0,300,50);
        textTipoCalculadora.setFont(new Font("Roboto", 1, 14));
        textTipoCalculadora.setForeground(Color.WHITE);
        add(textTipoCalculadora);
        
        bg = new ButtonGroup();
        radio1 = new JRadioButton("Básica");
        radio1.setBounds(385,50,150,30);
        radio1.setBackground(btOperaciones);
        radio1.setFont(new Font("Roboto", 1, 14));
        radio1.setForeground(Color.WHITE);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);

        radio2 = new JRadioButton("Especial");
        radio2.setBounds(585,50,150,30);
        radio2.setBackground(btOperaciones);
        radio2.setFont(new Font("Roboto", 1, 14));
        radio2.setForeground(Color.WHITE);
        radio2.addChangeListener(this);
        add(radio2);
        bg.add(radio2);
        
        tipoCalculadora1 = new JComboBox();
        tipoCalculadora1.setBounds(385,350,250,30);
        tipoCalculadora1.setFont(new Font("Roboto", 1, 14));
        tipoCalculadora1.setBackground(btOperaciones);
        tipoCalculadora1.setForeground(Color.WHITE);
        add(tipoCalculadora1);
        tipoCalculadora1.addItem("Operaciones Básicas");
        tipoCalculadora1.addItem("Suma");
        tipoCalculadora1.addItem("Resta");
        tipoCalculadora1.addItem("Multiplicación");
        tipoCalculadora1.addItem("División");
        tipoCalculadora1.addItemListener(this);
        tipoCalculadora1.setVisible(false);

        tipoCalculadora2 = new JComboBox();
        tipoCalculadora2.setBounds(385,350,250,30);
        tipoCalculadora2.setFont(new Font("Roboto", 1, 14));
        tipoCalculadora2.setBackground(btOperaciones);
        tipoCalculadora2.setForeground(Color.WHITE);
        add(tipoCalculadora2);
        tipoCalculadora2.addItem("Operaciones Avanzadas");
        tipoCalculadora2.addItem("Raiz Cuadrada");
        tipoCalculadora2.addItem("Raiz Cubica");
        tipoCalculadora2.addItem("Potencia");
        tipoCalculadora2.addItem("Seno de un ángulo");
        tipoCalculadora2.addItem("Coseno de un ángulo");
        tipoCalculadora2.addItem("Tangente de un ángulo");
        tipoCalculadora2.addItem("Número primo");
        tipoCalculadora2.addItem("Hipotenusa");   
        tipoCalculadora2.addItemListener(this);
        tipoCalculadora2.setVisible(false);
        
        num1 = new JLabel("Ingrese el primer número");
        num1.setBounds(385,100,300,50);
        num1.setFont(new Font("Roboto", 1, 14));
        num1.setForeground(Color.WHITE);
        add(num1);
        num1.setVisible(true);
        
        numero1 = new JTextField();
        numero1.setBounds(385,150,300,30);
        numero1.setFont(new Font("Roboto", 1, 14));
        numero1.setBackground(btOperaciones);
        numero1.setForeground(Color.WHITE);
        add(numero1);
        numero1.setVisible(true);
        
        num2 = new JLabel("Ingrese el segundo número");
        num2.setBounds(385,200,300,50);
        num2.setFont(new Font("Roboto", 1, 14));
        num2.setForeground(Color.WHITE);
        add(num2);
        num2.setVisible(true);
        
        numero2 = new JTextField();
        numero2.setBounds(385,250,300,30);
        numero2.setFont(new Font("Roboto", 1, 14));
        numero2.setBackground(btOperaciones);
        numero2.setForeground(Color.WHITE);
        add(numero2);
        numero2.setVisible(true);
        
        calcular = new JButton("Calcular");
        calcular.setBounds(500,500,100,50);
        calcular.setBackground(btIgual);
        calcular.setFont(new Font("Roboto", 1, 16));
        calcular.setForeground(Color.WHITE);
        add(calcular);
        calcular.addActionListener(this);

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
        
        panel2 = new JPanel();
        panel2.setBounds(360,0,400,650);
        panel2.setBackground(btOperaciones);
        add(panel2);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== calcular){
            texto.setVisible(true);
            texto2.setVisible(true);
        }else{
            texto.setVisible(false);
            texto2.setVisible(false);
        }    
    }
    
    public void stateChanged(ChangeEvent e){
        if (radio1.isSelected()){
            setTitle("Calculadora Básica");
            marca.setText(calculadora.marcaCalculadora);
            tipoCalculadora1.setVisible(true);
            tipoCalculadora2.setVisible(false);
        }
        if(radio2.isSelected()){
            setTitle("Calculadora Especial");
            marca.setText(especial.marcaCalculadora);
            tipoCalculadora2.setVisible(true);
            tipoCalculadora1.setVisible(false);
        }
    }
    
    public void itemStateChanged(ItemEvent e){
        int opc = 0;
        if(e.getSource()== tipoCalculadora1){
            String seleccion = tipoCalculadora1.getSelectedItem().toString();
            
            switch(seleccion){
                case "Suma":
                    numero2.setVisible(true);
                    num2.setVisible(true);
                    num1.setText("Ingrese el primer numero");
                    num2.setText("Ingrese el segundo numero");
                    opc = 1;
                    calcular(opc);
                    break;
                case "Resta":
                    numero2.setVisible(true);
                    num2.setVisible(true);
                    num1.setText("Ingrese el primer numero");
                    num2.setText("Ingrese el segundo numero");
                    opc = 2;
                    calcular(opc);
                    break;
                case "División":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(true);
                    num2.setVisible(true);
                    num1.setText("Ingrese el primer numero");
                    num2.setText("Ingrese el segundo numero");
                    opc = 3;
                    calcular(opc);
                    break;
                case "Multiplicación":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(true);
                    num2.setVisible(true);
                    num1.setText("Ingrese el primer numero");
                    num2.setText("Ingrese el segundo numero");
                    opc = 4;
                    calcular(opc);
                    break; 
                default:
                    System.out.println("error");
                    break;
            }
        }
        if(e.getSource()== tipoCalculadora2){
            String seleccion = tipoCalculadora2.getSelectedItem().toString();
            switch(seleccion){
                case "Raiz Cuadrada":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(false);
                    num2.setVisible(false);
                    num1.setText("Ingrese un numero mayor o igual a 0");
                    opc = 5;
                    calcular(opc);
                    break; 
                case "Raiz Cubica":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(false);
                    num2.setVisible(false);
                    num1.setText("Ingrese un numero");
                    opc = 6;
                    calcular(opc);
                    break;
                case "Potencia":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(true);
                    num2.setVisible(true);
                    num1.setText("Ingrese la base de la potencia");
                    num2.setText("Ingrese el valor de la potencia");
                    opc = 7;
                    calcular(opc);
                    break;
                case "Seno de un ángulo":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(false);
                    num2.setVisible(false);
                    num1.setText("Ingrese el valor del angulo");
                    opc = 8;
                    calcular(opc);
                    break;    
                case "Coseno de un ángulo":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(false);
                    num2.setVisible(false);
                    num1.setText("Ingrese el valor del angulo");
                    opc = 9;
                    calcular(opc);
                    break; 
                case "Tangente de un ángulo":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(false);
                    num2.setVisible(false);
                    num1.setText("Ingrese el valor del angulo");
                    opc = 10;
                    calcular(opc);
                    break; 
                case "Número primo":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(false);
                    num2.setVisible(false);
                    num1.setText("Ingrese un número");
                    opc = 11;
                    calcular(opc);
                    break; 
                case "Hipotenusa":
                    numero1.setVisible(true);
                    num1.setVisible(true);
                    numero2.setVisible(true);
                    num2.setVisible(true);
                    num1.setText("Ingrese el valor del primer cateto");
                    num2.setText("Ingrese el valor del segundo cateto");
                    opc = 12;
                    calcular(opc);
                    break; 
                default:
                    System.out.println("error");
                    break;
            }
        }
    }
    
    public void calcular(int opc){
        double valor1 = 0, valor2 = 0;
        String resultado = "";
        if(valor1 == 0 && valor2 == 0){
            
        }
        switch(opc){
            case 1:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                valor2 = Double.parseDouble(numero2.getText());
                resultado = String.valueOf(calculadora.sumar(valor1, valor2));
                texto2.setText(resultado);
                break;
            case 2:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                valor2 = Double.parseDouble(numero2.getText());
                resultado = String.valueOf(calculadora.restar(valor1, valor2));
                texto2.setText(resultado);
                break;
            case 3:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                valor2 = Double.parseDouble(numero2.getText());
                resultado = String.valueOf(calculadora.dividir(valor1, valor2));
                texto2.setText(resultado);
                break;
            case 4:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                valor2 = Double.parseDouble(numero2.getText());
                resultado = String.valueOf(calculadora.multiplicar(valor1, valor2));
                texto2.setText(resultado);
                break;
            case 5:
                valor1 = Double.parseDouble(numero1.getText());
                    if(valor1 >= 0){
                        texto.setText("Resultado");
                        resultado = String.valueOf(especial.raizCuadrada(valor1));
                        texto2.setText(resultado); 
                    }else{
                        num2.setText("Error!, El numero ingresado debe ser positivo");
                        num2.setVisible(true);
                    }   
                break;
            case 6:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                resultado = String.valueOf(especial.raizCubica(valor1));
                texto2.setText(resultado);
                break;
            case 7:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                valor2 = Double.parseDouble(numero2.getText());
                resultado = String.valueOf(especial.potencia(valor1, valor2));
                texto2.setText(resultado);
                break;
            case 8:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                resultado = String.valueOf(especial.senoDeUnAngulo(valor1));
                texto2.setText(resultado);
                break;
            case 9:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                resultado = String.valueOf(especial.cosenoDeUnAngulo(valor1));
                texto2.setText(resultado);
                break;
            case 10:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                resultado = String.valueOf(especial.tangenteDeUnAngulo(valor1));
                texto2.setText(resultado);
                break;
            case 11:
                texto.setText("Resultado");
                resultado = Boolean.toString(especial.esPrimo(Integer.parseInt(numero1.getText())));
                if(resultado == "true"){
                    texto2.setText("El número ingresado es primo");
                }else{
                    texto2.setText("El número ingresado no es primo");
                }
                break;
            case 12:
                texto.setText("Resultado");
                valor1 = Double.parseDouble(numero1.getText());
                valor2 = Double.parseDouble(numero2.getText());
                resultado = String.valueOf(especial.hipotenusa(valor1, valor2));
                texto2.setText(resultado);
                break;
        }
    }
    public static void main(){
        InterfazOperaciones pantallaPrincipal = new InterfazOperaciones();
        pantallaPrincipal.setSize(750,650);
        pantallaPrincipal.setResizable(false);
        pantallaPrincipal.setLocationRelativeTo(null);
        pantallaPrincipal.setVisible(true);
    }
}
    
