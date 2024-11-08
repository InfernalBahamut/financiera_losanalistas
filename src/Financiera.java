public class Financiera {
    public static void main(String[] args) {
        // Crear monedas
        Moneda usd = new Moneda("USD", 1.12);
        Moneda eur = new Moneda("EUR", 0.85);

        // Crear usuarios
        Observador corredorJuan = new UsuarioCorredor("Juan");
        Observador turistaMaria = new UsuarioTurista("Maria");
        Observador empresaXYZ = new UsuarioEmpresa("Empresa XYZ");

        // Registrar suscripciones de los usuarios a las monedas
        usd.registrarObservador(corredorJuan);
        usd.registrarObservador(turistaMaria);
        eur.registrarObservador(corredorJuan);
        eur.registrarObservador(empresaXYZ);

        // Simular cambios en las tasas de cambio
        System.out.println("Actualización en la tasa de cambio del USD:");
        usd.actualizarTasaCambio(1.15);

        System.out.println("\nActualización en la tasa de cambio del EUR:");
        eur.actualizarTasaCambio(0.88);

        usd.removerObservador(turistaMaria);
        System.out.println("\nActualización en la tasa de cambio del USD:");
        usd.actualizarTasaCambio(2.20);

        eur.registrarObservador(turistaMaria);
        System.out.println("\nActualización en la tasa de cambio del EUR:");
        eur.actualizarTasaCambio(0.95);
    }
}




