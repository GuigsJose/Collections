package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Guilherme", 12356);
        agendaContatos.adicionarContato("Guilherme jose", 1897985);
        agendaContatos.adicionarContato("Guilherme silva", 8416156);
        agendaContatos.adicionarContato("Guilherme ze", 189596);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Guilherme");
        agendaContatos.exibirContatos();

        System.out.println("o número é: " + agendaContatos.pesquisarPorNome("Guilherme ze"));
    }

}