import java.util.ArrayList;

public class Restaurante {
    private String nome;
    private ArrayList<Prato> pratos;
    private ArrayList<Pedido> pedidos;

    public Restaurante(String nome) {
        this.nome = nome;
        this.pratos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void adicionarPratoAoMenu(Prato prato) {
        pratos.add(prato);
    }

    public void listarPratos() {
        System.out.println("\nPratos disponíveis no " + nome + ":");

        for(int i = 0; i < pratos.size(); i++){
            pratos.get(i).exibirDetalhes();
        }
    }

    public Prato buscarPrato(int codigoPrato) {

        for(int i = 0; i < pratos.size(); i++){
            if (pratos.get(i).getId() == codigoPrato) {
                return pratos.get(i);
            }
        }
        return null;
    }
}
