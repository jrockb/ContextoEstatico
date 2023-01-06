package test;

import domain.Persona;

/**
 *
 * @author jcd
 */
public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jonny");
        //System.out.println("persona1: "+persona1.toString());
        Persona persona2 = new Persona("Diana");
        //System.out.println("persona2: "+persona2.toString());
        imprimir(persona1); // no se pueden llamar metodos no estaticos desde metodos estaticos
        imprimir(persona2);
        // this.contador = 10 no se púede usar una variable no estatica desde un metodo estatico
        PersonaPrueba persona3 = new PersonaPrueba();
        persona3.getContador();
    }    
    
    public static void imprimir(Persona persona){
        System.out.println("Persona : "+ persona); // el metodo toString se llama por defecto        
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
