package atividade01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ativ01_clientes {
	public static void main(String[] args) {
        Queue<String> filaClientes = new LinkedList<>();

        // Menu
        while (true) {
        	System.out.println("**************************");
        	System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Chamar Cliente");
            System.out.println("0 - Sair");
            System.out.println("**************************");
            System.out.println("Escolha uma opção:");

            Scanner scanner = new Scanner(System.in);
            Scanner leia = new Scanner(System.in);
            int opcao;
          
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar Cliente
                    System.out.println("Informe o nome do cliente:");
                    leia.nextLine();
                    String nomeCliente = scanner.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("Cliente Adicionade!");
                    break;
                case 2:
                    // Listar Clientes
                    System.out.println("Lista de Clientes na fila:");
                    for (String cliente : filaClientes) {
                        System.out.println(cliente);
                    }
                    break;
                case 3:
                    // Chamar Cliente
                    if (!filaClientes.isEmpty()) {
                        System.out.println("Cliente chamade: " + filaClientes.poll());
                    } else {
                        System.out.println("Fila vazia!");
                    }
                    break;
                case 0:
                    // Sair
                    System.out.println("Fim do programa!");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
