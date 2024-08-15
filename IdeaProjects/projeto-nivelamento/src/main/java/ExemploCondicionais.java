public class ExemploCondicionais {
    public static void main(String[] args) {

        Integer idade = 19;

        if (idade >= 18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        // cuidado com ==, nunca usar para string


        String nome01 = "Bob";
        String nome02 = "Bob";

        if (nome01.equals(nome02)){
            System.out.println("O nome é igual");
        } else {
            System.out.println("O nome é diferente");
        }

        //operador ternário

        String resultadoMaioridade = idade >=18 ? "Sim" : "Não";
        Boolean ehMaiorDeIdade = idade >= 18;
        System.out.println("É maior de idade: " + resultadoMaioridade);



        // exemplo do que nunca fazer
//        Boolean bloqueadoOuNao = false;
//        if (!bloqueado)
    }
}
