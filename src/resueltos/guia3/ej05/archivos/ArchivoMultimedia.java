package resueltos.guia3.ej05.archivos;


public abstract class ArchivoMultimedia extends Archivo {

    private int duracion;
    private boolean enReproduccion;

    public ArchivoMultimedia(int duracion, String nombre, double peso, String localizacion) {
        super(nombre, peso, localizacion); // Al enviar argumentos, hay que escribirlo explícitamente
        this.duracion = duracion;
        this.enReproduccion = false;
    }

    public void reproducir() {
        enReproduccion = true;
    }

    public void parar() {
        enReproduccion = false;
    }

    @Override
    public String toString() {
        return super.toString() + "ArchivoMultimedia{" + "duracion=" + duracion + ", enReproduccion=" + enReproduccion + '}';
    }
    
    
}
