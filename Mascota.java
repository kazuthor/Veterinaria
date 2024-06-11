
/**
 * Write a description of class Mascota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private String raza;

    public Mascota(String nombre, String especie, int edad, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad + ", Raza: " + raza;
    }
}