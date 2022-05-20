package resueltos.guia3.ej02;

import resueltos.guia3.ej02.archivos.ArchivoVideo;
import resueltos.guia3.ej02.archivos.Archivo;
import java.util.ArrayList;

public class Computadora {

    private ArrayList<Archivo> archivos; // Una sola lista de Archivos, no una lista de cada tipo.
    
    public Computadora() {
        archivos = new ArrayList<>();
    }
    
    // Todos los archivos llegan como 'Archivo'
    public void agregarArchivo(Archivo arch) {
        this.archivos.add(arch);
        
        if (arch instanceof ArchivoVideo) { // Me aseguro que sea de video
            ArchivoVideo av = (ArchivoVideo) arch; // Hago downcasting
            av.reproducir(); // Sin downcasting no hubiera podido hacer esto
        }
        
    }
}
