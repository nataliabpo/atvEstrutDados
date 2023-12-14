package atividade02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ativ02_Pilha {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);

        Stack<String> pilhaLivros = new Stack<String>();

        // Menu
        while (true) {
        	System.out.println("**************************");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Retirar Livro");
            System.out.println("0 - Sair");
            System.out.println("**************************");
            System.out.println("Entre com a opção desejada:");
            int opcao;
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // Adicionar Livro
                    System.out.println("Informe o nome do livro:");
                  
                    String nomeLivro = leia.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    // Listar Livros
                    System.out.println("Livros na pilha:");
                    for (String livro : pilhaLivros) {
                        System.out.println(livro);
                    }
                    break;
                case 3:
                    // Retirar Livro
                    if (!pilhaLivros.isEmpty()) {
                        System.out.println("Um Livro foi retirado: " + pilhaLivros.pop());
                    } else {
                        System.out.println("A Pilha está vazia!");
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


