public class Main {
    public static void main(String[] args) {
        UsuarioTwitter alice = new UsuarioTwitter("Alice");
        UsuarioTwitter joao = new UsuarioTwitter("Joao");
        UsuarioYahoo bob = new UsuarioYahoo("Bob");
        UsuarioYahoo carol = new UsuarioYahoo("Carol");

        alice.adicionarSeguidor(bob);
        alice.adicionarSeguidor(carol);
        alice.adicionarSeguidor(joao);

        alice.postarMensagem("Olá, mundo!");
        alice.postarMensagem("Novo tweet!");
        alice.postarMensagem("Mais um tweet!");

        // Imprimir mensagens postadas pelos usuários do Twitter
        alice.imprimirMensagensPostadas();
        joao.imprimirMensagensPostadas();

        // Imprimir mensagens recebidas pelos usuários do Yahoo
        bob.imprimirMensagensRecebidas();
        carol.imprimirMensagensRecebidas();
    }
}
