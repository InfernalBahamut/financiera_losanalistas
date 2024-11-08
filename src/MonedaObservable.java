public interface MonedaObservable {
    void registrarObservador(Observador observador);
    void removerObservador(Observador observador);
    void notificarObservadores();
}
