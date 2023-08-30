public interface Subject {
    void adicionarSeguidor(Observer observer);
    void removerSeguidor(Observer observer);
    void notificarSeguidores(String mensagem);
    void mostrarSeguidores();
    String getNome();
}
