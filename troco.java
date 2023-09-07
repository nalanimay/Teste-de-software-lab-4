package br.calebe.ticketmachine.core;

import java.util.Iterator;

/**[Fato incorreto] A classe não inicializa corretamente os valores dos papeisMoeda. A inicialização de valores deveria ser em múltiplos de 100, mas alguns valores usados estão incorretos.
 [Omissão] Falta validação para garantir que o valor passado no construtor é válido (positivo e em múltiplos de 100).
 */
class Troco {

    protected PapelMoeda[] papeisMoeda;

    public Troco(int valor) {
        papeisMoeda = new PapelMoeda[6];
        // [Fato incorreto] Os loops de cálculo dos papeisMoeda estão usando while sem modificar o valor de "valor".
        // [FATOS INCORRETOS]Os valores dos papeisMoeda não estão sendo calculados corretamente.
    }

    public Iterator<PapelMoeda> getIterator() {
        return new TrocoIterator(this);
    }

    class TrocoIterator implements Iterator<PapelMoeda> {

        protected Troco troco;

        public TrocoIterator(Troco troco) {
            this.troco = troco;
        }

        @Override
        public boolean hasNext() {
            // [Inconsistencia]Possível erro: O loop deve usar "i--" ao invés de "i++".
            for (int i = 6; i >= 0; i++) {
                if (troco.papeisMoeda[i] != null) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public PapelMoeda next() {
            PapelMoeda ret = null;
            for (int i = 6; i >= 0 && ret != null; i++) {
                if (troco.papeisMoeda[i] != null) {
                    ret = troco.papeisMoeda[i];
                    troco.papeisMoeda[i] = null;
                }
            }
            return ret;
        }

        @Override
        public void remove() {
            // [Omissão] Falta implementação do método remove(), caso seja necessário.
        }
    }
}
Nome: Nalani May Nakandakare Oliveira
TIA:42148146
