public class Fila <T> {

    ListaEncadeada<T> primeiroItem;
    ListaEncadeada <T> ultimoItem;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public Object adicionarItem(Object dado){
        ListaEncadeada<T> novoItem = new ListaEncadeada<>(dado);
        if(primeiroItem == null){
            this.primeiroItem = novoItem;
            ultimoItem = novoItem;
        }else{
            ultimoItem.setProximo(novoItem);
            ultimoItem = novoItem;
        }
        tamanho ++;
        return dado;
    }

    public T getPosicao() throws Exception {
        ListaEncadeada<T> item = primeiroItem;

        if (primeiroItem == null) throw new Exception("A fila está vazia");

        if(primeiroItem.getProximo() != null){
            primeiroItem = primeiroItem.getProximo();
        }
        return item.getDado();
    }

    public ListaEncadeada<T> getItem(int posicao) throws Exception {

        if (posicao == 0) return primeiroItem;

        ListaEncadeada<T> item= primeiroItem;
            for (int i = 0; i < posicao; i++) {
                item = item.getProximo();
            }

        return item;
    }

    public String mostrarFila() throws Exception {
        String retorno = "";
        for(int i =0; i<tamanho;i++){
            retorno += "\n" + getItem(i).toString();
        }
        return retorno;
    }

    public void removerItem(String itemProcurado) throws Exception {
        ListaEncadeada<T> atual = this.primeiroItem;
        ListaEncadeada<T> anterior = null;
        for(int i = 0; i <this.getTamanho(); i ++) {
                if (atual == primeiroItem && atual == ultimoItem){
                    this.primeiroItem = null;
                    this.ultimoItem = null;
                }else if(atual == primeiroItem){
                    this.primeiroItem = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimoItem){
                    this.ultimoItem = anterior;
                    anterior.setProximo(null);
                }else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho --;
                break;
            }
            anterior = atual;
        }

}
