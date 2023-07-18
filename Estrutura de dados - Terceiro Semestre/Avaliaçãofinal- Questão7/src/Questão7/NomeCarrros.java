package Questão7;

import java.util.Scanner;


class NomeCarros {
    String nome;
    String fabricante;

    public NomeCarros(String nome, String fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String toString() {
        return "Carro [nome=" + nome + ", fabricante=" + fabricante + "]";
    }
}

class Fila {
    No inicio;
    No fim;

    class No {
        NomeCarros carro;
        No prox;

        public No(NomeCarros carro) {
            this.carro = carro;
            this.prox = null;
        }
    }

    public void enfileirar(NomeCarros carro) {
        No novoNo = new No(carro);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.prox = novoNo;
            fim = novoNo;
        }
    }

    public NomeCarros desenfileirar() {
        if (inicio == null) {
            return null;
        }
        No noRemovido = inicio;
        inicio = inicio.prox;
        if (inicio == null) {
            fim = null;
        }
        return noRemovido.carro;
    }

    public void listar() {
        No atual = inicio;
        while (atual != null) {
            System.out.println(atual.carro);
            atual = atual.prox;
        }
    }
}

class Pilha {
    No topo;

    class No {
        NomeCarros carro;
        No prox;

        public No(NomeCarros carro) {
            this.carro = carro;
            this.prox = topo;
            topo = this;
        }
    }

    public void empilhar(NomeCarros carro) {
        new No(carro);
    }

    public NomeCarros desempilhar() {
        if (topo == null) {
            return null;
        }
        NomeCarros carroRemovido = topo.carro;
        topo = topo.prox;
        return carroRemovido;
    }

    public void listar() {
        No atual = topo;
        while (atual != null) {
            System.out.println(atual.carro);
            atual = atual.prox;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        while (true) {
        	
            System.out.println("I - Inserir novo carro");
            System.out.println("F - Listar fila");
            System.out.println("P - Listar pilha");
            System.out.println("S - Sair do programa");
            System.out.print("Opção: ");
            String opcao = scanner.nextLine();
            
            if (opcao.equalsIgnoreCase("I")) {
                System.out.print("Nome do carro: ");
                String nome = scanner.nextLine();
                System.out.print("Fabricante do carro: ");
                String fabricante = scanner.nextLine();
                NomeCarros carro = new NomeCarros(nome, fabricante);
                if (fabricante.equalsIgnoreCase("Toyota")) {
                    pilha.empilhar(carro);
                } else {
                    fila.enfileirar(carro);
                }
            } else if (opcao.equalsIgnoreCase("F")) {
                fila.listar();
            } else if (opcao.equalsIgnoreCase("P")) {
                pilha.listar();
            } else if (opcao.equalsIgnoreCase("S")) {
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
        scanner.close();
    	}
    }

