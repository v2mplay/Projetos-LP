public class ExemploRevisao {
    public static void main(String[] args) { // main = tornar um programa java executavel

        //tipos que mais usaremos:

        // class = primeira letra da palavra sempre em caixa alta

        // tipos wrapper = são classes, ou seja possuem métodos que ajudam,
        // não possue valor inicial

        String nome = "Bob da Silva";
        Integer idade = 42;
        Double altura = 1.55;
        Boolean bloqueado = false; // guarda um valor de uma variavel que seja falsa

        //declarar e inicializar
        // \n = quebra linha


        System.out.println("Meu nome é " + nome + "\n minha altura é " + altura + " Minha idade é " +
                idade);

        System.out.println(("Meu nome é %s, minha altura é %.2f e minha idade é %d").formatted(nome, altura, idade));

        // println usando iterpolação e text block
        System.out.println("""
                Nome: %s
                Idade: %d
                Altura: %.2f 
                Nome do pet: %s
                """.formatted(nome, idade, altura, "Caramelo"));

        // %s = representar string
        // %d = representar num inteiro
        // .2f = representar quantidade de casas

//        // tipo primitivo = não são class, sem métodos, só armazena valores
//        // sempre tem valor inicial
//        boolean bloqueado02 = false; //não é uma class


    }
}
