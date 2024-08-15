public class ExemploOperadores {
    public static void main(String[] args) {
        //%
        // / div
        // ** potencia, no java usamos um método de classe


        Double numero01 = 42.0;
        Double numero02 = 10.0;

        Double soma = numero01 + numero02;

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado potência: " + resultadoPotencia);
    }
}
