import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variaveis
        String nome = "Luciane Costa";
        String tipoConta = "Corrente";
        double saldo = 8900;
        int opcao = 0;

        //Dados
        System.out.println("----------------------------- ");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);

        //Opções
        String menu = """
                \n
                1- Consultar Saldo
                2- Inserir Recebimemto
                3- Inserir Transferência
                4- Sair
                \n """;
        // Lógica

        while (opcao != 4) {
            System.out.println(menu);
            Scanner op = new Scanner(System.in);
            System.out.print("Digite a opção desejada: ");
            opcao = op.nextInt();

            // Condiação
            if (opcao == 1) {
                System.out.println("O saldo atual é: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.print("Insira o valor do Recebimento: ");
                double receber = op.nextDouble();
                saldo += receber;
            } else if (opcao == 3) {
                System.out.print("Insira o valor a transferir: R$");
                double transferir = op.nextDouble();
                if (transferir < saldo) {
                    saldo -= transferir;
                }else {
                    System.out.println("Não é possivel efetuar a transferência! Saldo menor que o valor requerido.");
                }
            }  else if (opcao > 4) {
                System.out.println("Opção invalida! Tente novamente!");
            } else if (opcao == 4) {
                System.out.println("Programa encerrado! \n Volte sempre");
                break;
            }

        }



    }
}

