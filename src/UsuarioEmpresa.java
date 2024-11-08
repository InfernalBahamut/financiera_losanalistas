public class UsuarioEmpresa implements Observador {
    private String nombre;

    public UsuarioEmpresa(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String nombreMoneda, double tasaCambio) {
        System.out.println("Empresa " + nombre + " notificada - " + nombreMoneda + ": nueva tasa de cambio es " + tasaCambio);
    }
}

