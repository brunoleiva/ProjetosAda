import java.util.Scanner;

public class main {


    public static void pilha(Pilha pilha) throws Exception {
        System.out.println("Escolheu: pilha");
        System.out.println("1 - Adicionar  2 - Remover  3 - Listar");
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Digite o nome a adicionar:");
                String nomeAdd = sc.next();
                pilha.adicionarItemPilha(nomeAdd);
                System.out.println("Adicionado!");
                break;

            case 2:
                System.out.println("Digite o nome a remover:");
                String nomeRemove = sc.next();
                pilha.removerItemPilha();
                System.out.println(nomeRemove + " foi removido!");
                break;
            case 3:
                System.out.println(pilha.mostrarPilha());
                break;
        }

    }

    public static void fila(Fila fila) throws Exception {
        System.out.println("Escolheu: fila");
        System.out.println("1 - Adicionar  2 - Remover  3 - Listar");
        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();
        switch (escolha){
            case 1:
                System.out.println("Digite o nome a adicionar:");
                String nomeAdd = sc.next();
                fila.adicionarItem(nomeAdd);
                System.out.println("Adicionado!");
                break;

            case 2:
                System.out.println("Digite o nome a remover:");
                String nomeRemove = sc.next();
                fila.removerItem(nomeRemove);
                System.out.println(nomeRemove + " foi removido!");
                break;
            case 3:
                System.out.println(fila.mostrarFila());
                break;
        }

    }

    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        fila.adicionarItem("Bruno");
        fila.adicionarItem("Felipe");
        fila.adicionarItem("Luiza");
        fila.adicionarItem("Adalberto");
        fila.adicionarItem("Will");
        fila.adicionarItem("Nakajima");

        Pilha pilha = new Pilha<>();

        pilha.adicionarItemPilha("Maria");
        pilha.adicionarItemPilha("Joaquim");
        pilha.adicionarItemPilha("Henrique");
        pilha.adicionarItemPilha("Collie");


        //Faça um programa que mostre um menu com escolhas entre utilizar pilha ou fila e após selecionar uma delas,
        // mostre 3 opções de operações, adicionar, remover (Mostrando qual foi o dado removido) e listar.
        Scanner sc = new Scanner(System.in);
        int escolha = -1;
        while(escolha != 0) {
            System.out.println("Informe a estrutura 0-Sair 1-Fila  2-Pilha");
            escolha = sc.nextInt();

            if (escolha != 1 && escolha != 2) throw new Exception("Escolha inválida");

            switch (escolha) {
                case 1:
                    fila(fila);
                    break;

                case 2:
                    pilha(pilha);
                    break;
            }
        }
        sc.close();
    }
}
