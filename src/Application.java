import java.util.HashMap;
import java.util.Scanner;


import com.vainubank.controllers.ContaController;
import com.vainubank.models.Conta;

public class Application {

    public static void main(String[] args) {
        HashMap<Integer, Conta> contas = new HashMap<>();
        // Menu de interação com o usuário
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem vindo ao VainuBank!");
            System.out.println("Escolha uma opção:" +
                    "\n1 - Criar conta" +
                    "\n2 - Editar conta" +
                    "\n3 - Excluir conta" +
                    "\n4 - Visualizar todas as contas" +
                    "\n0 - Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Conta conta = ContaController.criarConta();
                    contas.put(conta.getNumero(), conta);
                    break;
                case 2:
                    ContaController.editarConta();
                    break;
                case 3:
                    ContaController.excluirConta();

                    break;
                case 4:
                    ContaController.visualizarTodasAsContas(contas);
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