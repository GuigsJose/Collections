package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavrasUnicasSet.isEmpty()){
            if (palavrasUnicasSet.contains(palavra)){
                palavrasUnicasSet.remove(palavra);
            }else {
                System.out.println("palavra não encontrada no conjunto");
            }
        }else {
            System.out.println("conjunto está vazio");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasUnicasSet.isEmpty()){
            System.out.println(palavrasUnicasSet);
        }else{
            System.out.println("o conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        //instanciando e testando as palavras unicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("C#");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        //exibindo estas palavras
        conjuntoLinguagens.exibirPalavrasUnicas();

        //removendo uma linguagem
        conjuntoLinguagens.removerPalavra("JavaScript");
        conjuntoLinguagens.exibirPalavrasUnicas();

        //verificando linguagens no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Swift' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Swift"));
    }


}
