public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double maxValue = Double.MAX_VALUE;

        int operacao = 1;
        double num1 = 1;
        double num2 = maxValue;

        switch(operacao){
            case 1: 
                System.out.println("Resultado: " + calc.somar(num1, num2));
                break;
            case 2: 
                System.out.println("Resultado: " + calc.subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + calc.multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Resultado: " + calc.dividir(num1, num2));
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }
}
