
package resueltos.guia3.ej05;

import resueltos.guia3.ej05.archivos.formatos.FormatoAudio;
import resueltos.guia3.ej05.archivos.formatos.FormatoVideo;
import resueltos.guia3.ej05.archivos.ArchivoTexto;
import resueltos.guia3.ej05.archivos.ArchivoVideo;
import resueltos.guia3.ej05.archivos.Archivo;
import resueltos.guia3.ej05.archivos.ArchivoAudio;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        
        Computadora c = new Computadora();
        
        ArchivoVideo av = new ArchivoVideo(new Dimension(1920,1080), FormatoVideo.MP4, 180, "Videoclip", 80000, "D:/Videos");
        
        c.agregarArchivo(av);
        c.agregarArchivo(new ArchivoTexto("UTF-8", "listaDeCompras", 2, "C:/Documentos"));
        c.agregarArchivo(new ArchivoAudio("Vicente Lopez y Planes", "Greatest Hits", FormatoAudio.MP3, 194, "Himno Nacional Argentino", 4050, "F:"));
        c.agregarArchivo(new Archivo("Archivo generico", 3, "C:"));
    }

}
