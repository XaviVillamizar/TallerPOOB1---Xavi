
import static java.lang.Character.toUpperCase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LabSispc01
 */
public class Persona {
    private String nombre;
    private byte edad;
    private int cedula;
    private char sexo;
    private float peso;
    private float altura;
    
    public Persona(){
        
        }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(byte edad) {
        this.edad = edad;
    }

    public Persona(int cedula) {
        this.cedula = cedula;
    }


    public Persona(char sexo) {
        this.sexo = sexo;
    }

    public Persona(float peso) {
        this.peso = peso;
    }

    public Persona(String nombre, byte edad, int cedula, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.peso = 40;
        this.altura = (float) 4.6;
    }

    
    
public float calcularIMC(float peso, float altura){
    
    float pesoIdeal=(float)(peso/Math.pow(altura, 2));
        if(pesoIdeal<20){
            return 14;
        }
        else if (pesoIdeal<=20&&pesoIdeal<=25){
            return 0;
        }
        else{
            return 1;
        }
}

public boolean esMayorDeEdad(byte edad){

    if(edad>=18){
        return true;
    }
    else{
        return false;
    }
        
}

public char comprobarSexo(char sexo){
    if(toUpperCase(sexo)=='H'||toUpperCase(sexo)=='M'){
        return sexo;
    }
    else{
        System.out.print("Sexo incorrecto");
        return toUpperCase('H');
    }
}

@Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }



public int generaCedula(int cedula){
    cedula=(int)(Math.random()*10);
        return cedula;
}
}