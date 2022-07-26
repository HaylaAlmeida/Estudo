import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double peso, altura, imc;
        peso = input.nextDouble();
        altura = input.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf("Seu IMC é %.1f\n", imc);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        }
        else if (imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso");
        }
        else if (imc >= 30) {
            System.out.println("Obeso");
        }

    }
}
