/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraconinterfaz;

/**
 *
 * @author kathe
 */
public class CalculadoraEspecial extends Calculadora{
    
    public String tipoCalculadora;
    public String color;
    public String marcaCalculadora;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    public CalculadoraEspecial(String propietario){
        this.tipoCalculadora = "Calculadora Especial";
        this.dimensionPantalla = 20;
        this.numeroDeSerie = "1883knff";
        this.color = "Negro";
        this.marcaCalculadora = "CASIO";
        this.nombrePropietario = propietario;
    }

    public double senoDeUnAngulo(double angulo){
        double anguloEnRadianes = Math.toRadians(angulo);
        double seno = Math.sin(anguloEnRadianes);
        return seno;
    }
    
    public double cosenoDeUnAngulo(double angulo){
        double anguloEnRadianes = Math.toRadians(angulo);
        double coseno = Math.cos(anguloEnRadianes);
        return coseno;
    }
    
    public double tangenteDeUnAngulo(double angulo){
        double anguloEnRadianes = Math.toRadians(angulo);
        double tangente = Math.tan(anguloEnRadianes);
        return tangente;
    }
    
    public double hipotenusa(double a, double b){
        double c = 0;
        c = Math.hypot(a, b);
        return c;
    }
    
    public double raizCubica(double numero){
        return Math.cbrt(numero);
    }
    
    public double potencia(double numero, double potencia){
        return Math.pow(numero, potencia);
    }
}
