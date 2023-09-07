package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 * TODO: [Omissão] A documentação não especifica o propósito detalhado da classe e seu funcionamento.
 * TODO: [Inconsistência] O método inserir() compara a entrada com `papelMoeda[1]` em vez de `papelMoeda[i]`, o que pode ser um erro de digitação.
 * TODO: [Ambiguidade] A mensagem de erro lançada por PapelMoedaInvalidaException e SaldoInsuficienteException não é descrita de forma clara e específica.
 * TODO: [Fato incorreto] O atributo `valor` não está sendo usado em nenhum lugar do código, o que pode indicar uma informação incorreta.
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length && !achou; i++) {
            if (papelMoeda[1] == quantia) {
                achou = true;
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException(); // Ambiguidade: A mensagem de erro não está definida de forma específica.
        }
        this.saldo += quantia;
    }

    public int getSaldo() {
        return saldo;
    }

    public Iterator<Integer> getTroco() {
        return null; // Omissão: Método não implementado e sua funcionalidade não está definida.
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException(); 
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n"; 
        result += "*****************\n";
        return result;
    }
}

