package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra){
       String descricaoPorNome = null;
       if (!dicionarioMap.isEmpty()){
        descricaoPorNome = dicionarioMap.get(palavra);
       }
       return descricaoPorNome;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("marreta", "ferramenta utilizada em obras");
        dicionario.adicionarPalavra("serra mármore", "ferramenta utilizada para corte de mármore");
        dicionario.adicionarPalavra("pirulito", "doce caramelizado em um palito de plastico na grande maioria");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("pirulito");
        dicionario.exibirPalavras();

        System.out.println("A descrição: " + dicionario.pesquisarPorPalavra("marreta"));


    }
}
