package br.ulbra.view;

import br.ulbra.dao.Agenda;
import br.ulbra.dao.Pessoa;
import java.util.Scanner;

/**
 * @author s.lucas
 */
public class AgendaEletronica {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Agenda banco = new Agenda();

        int op = 1;
        while (op != 0) {
            System.out.println("AGENDA ELETRÔNICA\n"
                    + "==================\n"
                    + "1 - CRIAR CONTATO\n"
                    + "2 - LISTAR CONTATO\n"
                    + "3 - EXCLUIR CONTATO\n"
                    + "4 - EDITAR CONTATO\n"
                    + "5 - CONSULTAR CONTATO\n"
                    + "0 - SAIR DA AGENDA\n"
                    + "DIGITE SUA OPÇÃO:");
            op = input.nextInt();

            switch (op) {
                case 1:
                    input.nextLine();
                    Pessoa pessoa = new Pessoa();
                    System.out.println("===== Agenda Eletrônica =====");
                    System.out.println("Nome:");
                    pessoa.setName(input.nextLine());
                    System.out.println("Telefone:");
                    pessoa.setPhone(input.nextLine());
                    System.out.println("Email:");
                    pessoa.setEmail(input.nextLine());
                    banco.gravar(pessoa);
                    break;
                case 2:
                    System.out.println(banco.listarAgenda());
                    break;
                case 3:
                    Pessoa p = new Pessoa();
                    input.nextLine();
                    System.out.println("EXCULIR CONTATOS");
                    System.out.println("================");
                    System.out.println("Informe o nome do contato:");
                    p.setName(input.nextLine());

                    int i = banco.encontrarPessoa(p);

                    if (banco.encontrarPessoa(p) != -1) {
                        banco.excluir(i);
                    } else {
                        System.out.println("Este contato não existe.");
                    }
                    break;
                case 4:
                    input.nextLine();
                    Pessoa pe = new Pessoa();
                    System.out.println("ALTERAR CONTATOS");
                    System.out.println("================");
                    System.out.println("Informe o nome do contato:");
                    pe.setName(input.nextLine());
                    int ind = banco.encontrarPessoa(pe);
                    if(ind != -1){
                        System.out.println("Informe os novos dados.");
                        System.out.println("Nome");
                        pe.setName(input.nextLine());
                        System.out.println("Telefone");
                        pe.setPhone(input.nextLine());
                        System.out.println("Email");
                        pe.setEmail(input.nextLine());
                        banco.alterar(ind, pe);
                    }
                    break;
                case 5:
                    
                    Pessoa pc = new Pessoa(); 
                    input.nextLine();
                    System.out.println("CONSULTAR CONTATO");
                    System.out.println("==================");
                    System.out.println("Digite o nome:");
                    pc.setName(input.nextLine());
                    int ii = banco.encontrarPessoa(pc);
                    if(ii!=-1){
                        banco.consultar(ii);
                    } else {
                        System.out.println("Este contato não existe!");
                    }
                case 0:
                    System.out.println("Saindo.");
                    break;

                default:
                    System.out.println("Número inválido");
            }
        }
    }
}
