package JE12_POO;

public class Cliente {
    String name;
    Double limite;

    public void solicitarLimite(Double limiteSolicitado) {
        limite = limite + limiteSolicitado;
    }

    public void comprar (Double valorCompra) {
        limite = limite - valorCompra;
    }
}
