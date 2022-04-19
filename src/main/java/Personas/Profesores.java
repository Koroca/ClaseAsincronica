//Isaac Jiménez
package Personas;

public class Profesores {
    private String nombre;
    private int edad;
    private char genero;
    private String profesion;
    
    public Profesores(){
        
    }

    public Profesores(String nombre, int edad, char genero, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
}
