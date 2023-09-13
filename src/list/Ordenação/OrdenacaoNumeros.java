package list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    //atributos
    private List<Integer> numerosList;

    //construtor

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAcrescente(){
        List<Integer> numerosAcrescente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(numerosAcrescente);
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        return numerosAcrescente;
    }
    public List<Integer> ordenarDecrescente(){
        List<Integer> numerosDecrescente = new ArrayList<>(this.numerosList);
        if (!numerosList.isEmpty()){
            Collections.sort(numerosDecrescente);
        }else {
            throw new RuntimeException("A lista esta vazia!");
        }
        return numerosDecrescente;
    }
    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        }else {
            System.out.println("A lista está vazia");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAcrescente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDecrescente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
