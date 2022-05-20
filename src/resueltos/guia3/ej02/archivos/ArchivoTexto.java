package resueltos.guia3.ej02.archivos;

public class ArchivoTexto extends Archivo {

    private String codificacion;

    public ArchivoTexto(String cod, String nom, double peso, String path) {
        super(nom, peso, path);
        this.codificacion = cod;
    }

    public void cifrarContenido() {
        System.out.println("Contenido cifrado");
    }
}
