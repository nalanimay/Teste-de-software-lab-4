package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoeda {

    protected int valor;
    protected int quantidade;
    
    // Omissão: Falta de documentação que explique a finalidade da classe e o propósito dos campos.

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Ambiguidade: Os nomes dos métodos "getValor" e "getQuantidade" podem não ser autoexplicativos e podem levar a interpretações diferentes.
    
    public int getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    // Fato incorreto: Pode haver uma contradição entre os valores definidos nos construtores e o conhecimento do domínio da aplicação.

   
    
   
}