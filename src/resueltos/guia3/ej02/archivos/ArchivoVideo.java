package resueltos.guia3.ej02.archivos;

import resueltos.guia3.ej02.Dimension;
import resueltos.guia3.ej02.archivos.formatos.FormatoVideo;

public class ArchivoVideo extends ArchivoMultimedia {

    private Dimension dimension;
    private FormatoVideo formato;

    public ArchivoVideo(Dimension dimension, FormatoVideo formato, int duracion, String nombre, double peso, String localizacion) {
        super(duracion, nombre, peso, localizacion);
        this.dimension = dimension;
        this.formato = formato;
    }

    @Override
    public String toString() {
        return super.toString() + "ArchivoVideo{" + "dimension=" + dimension + ", formato=" + formato + '}';
    }
    
    
    
}
