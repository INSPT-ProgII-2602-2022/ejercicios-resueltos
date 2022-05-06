package resueltos.guia1.ej14;

public class ModuloAgua {

    private static final int TEMP_MIN = 70;
    private int temperatura;
    private boolean requiereMantenimiento;
    
    public void calentarAgua() {
        temperatura = TEMP_MIN;
    }
    
    public boolean estaOk() {
        return temperatura >= TEMP_MIN 
            && !requiereMantenimiento;
    }
}
