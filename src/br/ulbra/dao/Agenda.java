package br.ulbra.dao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author s.lucas
 */
public class Agenda {

    public ArrayList<Pessoa> lista = new ArrayList();

    public void gravar(Pessoa p) {
        lista.add(p);
        System.out.println("Dados salvos com sucesso!");
    }

    public String listarAgenda() {
        String result = "Lista de contatos\n";
        if (lista.isEmpty()) {
            result = "A sua agenda está vazia";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                result += lista.get(i).getName() + " - "
                        + lista.get(i).getPhone() + " - "
                        + lista.get(i).getEmail();

            }
        }
        return result;
    }

    public Pessoa getPessoa(int indice) {
        return lista.get(indice);
    }

    public int encontrarPessoa(Pessoa p) {
        int aux = -1;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getName().equals(p.getName())) {
                aux = i;
            }
        }
        return aux;
    }

    public void excluir(int i) {
        int op;
        Scanner input = new Scanner(System.in);

        System.out.println("Tem certeza? (1) Sim  (2) Não");
        op = input.nextInt();
        if (op == 1) {
            lista.remove(i);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Cancelado.");
        }
        
    }
    public void alterar(int i, Pessoa p){
        lista.set(i, p);
        System.out.println("Contato alterado com sucesso!");
    }
    
    public void consultar(int i){
        System.out.println("CONSULTA");
        System.out.println("==================");
        System.out.println("Nome: " + lista.get(i).getName());
        System.out.println("Telefone: " + lista.get(i).getPhone());
        System.out.println("Email: " + lista.get(i).getEmail());
        System.out.println("==================");
        
    
    }
}
