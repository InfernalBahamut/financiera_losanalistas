public class UsuarioCorredor implements Observador {
    private String nombre;

    public UsuarioCorredor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String nombreMoneda, double tasaCambio) {
        System.out.println("Corredor " + nombre + " notificado - " + nombreMoneda + ": nueva tasa de cambio es " + tasaCambio);
    }
}
