package resueltos.guia3.ej05.archivos;

public class Archivo {

    private String nombre;
    private double peso;
    private String localizacion;
    private boolean abierto;

    public Archivo(String nombre, double peso, String localizacion) {
        super(); // Cuando se invoca sin argumentos, Java lo coloca de forma implícita. Es lo mismo no escribirlo.
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        this.abierto = false;
    } 
    

    public void abrir() {
        this.abierto = true;
    }

    public void cerrar() {
        this.abierto = false;
    }

    public void mover(String path) {
        if (path != null) {
            localizacion = path;
        }
    }

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", peso=" + peso + ", localizacion=" + localizacion + ", abierto=" + abierto + '}';
    }
    
    
}
