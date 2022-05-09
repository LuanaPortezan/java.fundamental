package conceitos;

public class main {
    public static void main(String[] args) {

        int i;
        //int i; // erro por declarar outra variavel com o mesmo nome
        int I; //case sensitive
        // int 1a; //variaveis em java não pode começar em numeros
        int _1a; // não boa prática
        int $aq; // não boa prática

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //constante
        //j =15;
        int asrn24678nd; //é permetido
        //int asrn246 78nd; //espaço não é permetido
        int asrn2$678_md = 10; //pode, mas não é muito recomendado
        //int asrn2$46%78_md = 10; //% @ dão erros

        asrn24678nd = 100;
        asrn2$678_md = 10;


        //expressividade das variáveis
        int quantidadeProduto = 50; //modelo
        //int QuantidadeProduto; //não é um boa prática
        final int NUMERO_TENTATIVAS = 5; // constantes esse é o modelo
        //final int numeroTentativas = 5; //não é uma boa prática
        int QUANTIDADE_OPCOES = 25; //não é uma boa pratica por não ser final
        //int qtdProd; //não é uma pratica

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println ($aq);

        System.out.println(j);
        System.out.println(asrn24678nd);
        System.out.println(asrn2$678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
