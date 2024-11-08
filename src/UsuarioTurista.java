public class UsuarioTurista implements Observador {
    private String nombre;

    public UsuarioTurista(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String nombreMoneda, double tasaCambio) {
        System.out.println("Turista " + nombre + " notificado - " + nombreMoneda + ": nueva tasa de cambio es " + tasaCambio);
    }
}
