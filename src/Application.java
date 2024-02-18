import java.util.Scanner;

import com.vainubank.controllers.ContaController;

public class Application {

    public static void main(String[] args) {
        // Menu de interação com o usuário
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem vindo ao VainuBank!");
            System.out.println("Escolha uma opção:" +
                    "\n1 - Criar conta" +
                    "\n2 - Excluir conta" +
                    "\n3 - Editar conta" +
                    "\n4 - Visualizar todas as contas" +
                    "\n0 - Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    ContaController.criarConta();
                    break;
                case 2:
                    ContaController.excluirConta();
                    break;
                case 3:
                    ContaController.editarConta();
                    break;
                case 4:
                    ContaController.visualizarTodasAsContas();
                    break;
                case 0:
                    System.out.println("Até mais!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}