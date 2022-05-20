package resueltos.guia3.ej02.archivos;

import resueltos.guia3.ej02.archivos.formatos.FormatoAudio;

public class ArchivoAudio extends ArchivoMultimedia {

    private String artista;
    private String album;
    private FormatoAudio formato;

    public ArchivoAudio(String artista, String album, FormatoAudio formato, int duracion, String nombre, double peso, String localizacion) {
        super(duracion, nombre, peso, localizacion);
        this.artista = artista;
        this.album = album;
        this.formato = formato;
    }
    
    
}
