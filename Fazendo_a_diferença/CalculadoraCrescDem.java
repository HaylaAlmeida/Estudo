public class CalculadoraCrescDem {
    public static void main(String[] args) {
        long populacao, total;
        double taxa_de_crescimento;
        populacao = 7735000000L;
        taxa_de_crescimento = 0.011;
        total = (long)(populacao + populacao * taxa_de_crescimento);
        System.out.println("A população em um ano é " + total);
        total = (long)(total + total * taxa_de_crescimento);
        System.out.println("A população em dois anos é " + total);
        total = (long)(total + total * taxa_de_crescimento);
        System.out.println("A população em três anos é " + total);
        total = (long)(total + total * taxa_de_crescimento);
        System.out.println("A população em quatro anos é " + total);
        total = (long)(total + total * taxa_de_crescimento);
        System.out.println("A população em cinco anos é " + total);
    }
}
