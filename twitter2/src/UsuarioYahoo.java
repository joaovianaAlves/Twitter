import java.util.ArrayList;
import java.util.List;

public class UsuarioYahoo implements Observer {
    private String nome;
    private List<String> mensagensRecebidas = new ArrayList<>();

    public UsuarioYahoo(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu mensagem: " + mensagem);
        mensagensRecebidas.add(mensagem);
    }

    @Override
    public void mostrarSeguidores() {
        System.out.println(nome + " não possui seguidores no Yahoo.");
    }

    public void imprimirMensagensRecebidas() {
        System.out.println("Mensagens recebidas por " + nome + ":");
        for (String mensagem : mensagensRecebidas) {
            System.out.println("- " + mensagem);
        }
    }

    @Override
    public String getNome() {
        return nome;
    }
}
