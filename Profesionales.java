//Andres picado monge

package Personas;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class Profesionales extends Profesores {
    private String titulos;
    private String grado;
    private String materia;   
    
    
    public Profesionales(){
        
    }

    public Profesionales(String titulos, String grado, String materia, String nombre, int edad, char genero, String profesion) {
        super(nombre, edad, genero, profesion);
        this.titulos = titulos;
        this.grado = grado;
        this.materia = materia;   
    }

    

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public void imprimirDatos(){
     JOptionPane.showMessageDialog(null,"El nombre del alumno es : "+getNombre()
     +"\n la edad es : "+getEdad()
     +"\n el genero es : "+getGenero()
     +"\n Cuantos titulos tiene el docente : "+titulos
     +"\n Que grado da este docente : "+grado
     +"\n Cual materia da : "+materia);
    
    }
    
        public static void main(String[] args) {
        //Nicole
        Profesionales profesional1 = new Profesionales();
        profesional1.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del profesor"));
        profesional1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del profesor")));
        profesional1.setGenero(JOptionPane.showInputDialog("Ingrese el genero del profesor").charAt(0));
        profesional1.setNombre(JOptionPane.showInputDialog("Ingrese cuantos titulos tiene el profesor"));
        profesional1.setNombre(JOptionPane.showInputDialog("Ingrese cual grado da el profesor"));
        profesional1.setNombre(JOptionPane.showInputDialog("Ingrese cual materia da el profesor"));
        profesional1.imprimirDatos();
    }
}

