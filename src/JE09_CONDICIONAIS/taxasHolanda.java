package JE09_CONDICIONAIS;

public class taxasHolanda {
    static void main(String[] args) {
        double salarioAnual = 31000;
        double salarioSemTaxas;

        if (salarioAnual > 0 && salarioAnual < 34712.0) {
            salarioSemTaxas = salarioAnual * 0.0970;
            salarioAnual -= salarioSemTaxas;
        } else if (salarioAnual >= 34712.0 && salarioAnual < 68507.0) {
            salarioSemTaxas = salarioAnual * 0.3735;
            salarioAnual -= salarioSemTaxas;
        } else {
            salarioSemTaxas = salarioAnual * 0.4950;
            salarioAnual -= salarioSemTaxas;
        }
        System.out.println(salarioAnual);
    }
}
