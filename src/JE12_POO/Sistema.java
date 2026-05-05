package JE12_POO;

public class Sistema {
    static void main(String[] args) {
        Cliente jose = new Cliente();
        jose.name = "Jose Victor";
        jose.limite = 300.0;
        System.out.println(jose.limite);

        jose.solicitarLimite(450.0);
        System.out.println(jose.limite);

        jose.comprar(50.0);
        System.out.println(jose.limite);

        Cliente ana = new Cliente();
        ana.name = "Ana Julia";
        ana.limite = 500.0;
        System.out.println("Limite da Ana " + ana.limite);
    }
}
