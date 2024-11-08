import java.util.ArrayList;
import java.util.List;

public class Moneda implements MonedaObservable {
    private List<Observador> observadores;
    private String nombreMoneda;
    private double tasaCambio;

    public Moneda(String nombreMoneda, double tasaCambioInicial) {
        this.nombreMoneda = nombreMoneda;
        this.tasaCambio = tasaCambioInicial;
        this.observadores = new ArrayList<>();
    }

    @Override
    public void registrarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(nombreMoneda, tasaCambio);
        }
    }

    // Método para simular una actualización en la tasa de cambio
    public void actualizarTasaCambio(double nuevaTasaCambio) {
        this.tasaCambio = nuevaTasaCambio;
        notificarObservadores();
    }
}



//    public String getNombreMoneda() {
//        return nombreMoneda;
//    }