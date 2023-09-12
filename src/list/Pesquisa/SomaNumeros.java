package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
   //atributos
    private List<Integer> numeros;
    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer numero : numeros){
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero >= maiorNumero){
                    maiorNumero = numero;
                }
            }
        }else {
            throw new RuntimeException("Alista está vazia");
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()){
            for (Integer numero : numeros){
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
        }else {
            throw new RuntimeException("Alista está vazia");
        }
        return menorNumero;
    }

    public void exibirNumero(){
        if (!numeros.isEmpty()){
            System.out.println(this.numeros);
        }else {
            System.out.println("Alista esta vazia!");
        }
    }

    public static void main(String[] args) {
        //instanciando classe
        SomaNumeros somaNumeros = new SomaNumeros();

        // add numeros a lista

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(15);

        //exibindo numeros adicionados

        System.out.println("Números adicionados: ");
        somaNumeros.exibirNumero();

        //calculando e demonstrando a soma da lista

        System.out.println("Soma dos números =" + somaNumeros.calcularSoma());

        //encontrando maior numero

        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());

        //encontrando menor numero

        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());

    }
}
