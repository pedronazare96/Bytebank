public class TesteTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100.0);

        SeguraDeVidas segura = new SeguraDeVidas();
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(segura);

        System.out.println(calc.getTotalImposto());
    }
}
