import java.util.ArrayList;
import java.util.List;

public class UsuarioTwitter implements Subject, Observer {
    private String nome;
    private List<Observer> seguidores;
    private List<String> mensagensPostadas; // Rename 'mensagens' to 'mensagensPostadas'

    public UsuarioTwitter(String nome) {
        this.nome = nome;
        this.seguidores = new ArrayList<>();
        this.mensagensPostadas = new ArrayList<>(); // Rename 'mensagens' to 'mensagensPostadas'
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void adicionarSeguidor(Observer observer) {
        if (!seguidores.contains(observer)) {
            seguidores.add(observer);
        } else {
            System.out.println("Você já segue " + observer.getNome() + ".");
        }
    }

    @Override
    public void removerSeguidor(Observer observer) {
        seguidores.remove(observer);
    }

    @Override
    public void notificarSeguidores(String mensagem) {
        for (Observer seguidor : seguidores) {
            seguidor.receberMensagem("@" + nome + ": " + mensagem);
        }
    }

    public void postarMensagem(String mensagem) {
        System.out.println(nome + " postou mensagem: " + mensagem);
        mensagensPostadas.add(mensagem);
        notificarSeguidores(mensagem); // Notify followers about the new message
    }

    public void imprimirMensagensPostadas() {
        System.out.println("Mensagens postadas por @" + nome + ":");
        for (String mensagem : mensagensPostadas) {
            System.out.println("- " + mensagem);
        }
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu mensagem: " + mensagem);
    }

    public void mostrarSeguidores() {
        System.out.println("Seguidores de @" + nome + ":");
        for (Observer seguidor : seguidores) {
            System.out.println(seguidor.getNome());
        }
        System.out.println();
    }
}
