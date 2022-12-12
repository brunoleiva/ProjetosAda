
public class ListaEncadeada<T> {

    private T dado;

    private ListaEncadeada<T> proximo;

    private ListaEncadeada<T> anterior;

    private Integer proximoNum;

    private Integer numAnterior;

    public ListaEncadeada() {
    }

    public ListaEncadeada(Object dado) {
        this.dado = (T) dado;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public ListaEncadeada<T> getProximo() {
        return proximo;
    }

    public void setProximo(ListaEncadeada<T> proximo) {
        this.proximo = proximo;
    }

    public ListaEncadeada<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(ListaEncadeada<T> anterior) {
        this.anterior = anterior;
    }

    public Integer getProximoNum() {
        return proximoNum;
    }

    public void setProximoNum(Integer proximoNum) {
        this.proximoNum = proximoNum;
    }

    public Integer getNumAnterior() {
        return numAnterior;
    }

    public void setNumAnterior(Integer numAnterior) {
        this.numAnterior = numAnterior;
    }

    @Override
    public String toString() {
        return (String) dado;
    }
}
