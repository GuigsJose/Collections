package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atribytos
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set Convidados");

        conjuntoConvidados.adicionarConvidado("marcos",1234);
        conjuntoConvidados.adicionarConvidado("maria",1235);
        conjuntoConvidados.adicionarConvidado("laura",1236);
        conjuntoConvidados.adicionarConvidado("guilherme",1237);
        conjuntoConvidados.adicionarConvidado("lucas",1238);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro de set convidados");


    }
}
