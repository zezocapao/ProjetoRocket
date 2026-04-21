package JE06_METODOS;


public class MetodosApp {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        double resultado = m.somar(4,2); //6
        System.out.println(resultado);
        //Aqui estamos instanciando a classe Metodos, para obtermos a funcao de somar. Assim que executa o codigo, ele printa o resultado.

        Metodos datas = new Metodos();
        System.out.println("Data atual é: %s%n" + datas.dataAtual());

        Metodos busca = new Metodos();
        busca.buscaIdeias("8", "9");
    }
}
