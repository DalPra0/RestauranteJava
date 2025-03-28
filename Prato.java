class Prato {
    private int id;
    private String nome;
    private Double preco;

    public Prato(int id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + id + " | Prato: " + nome + " | Preço: R$ " + preco);
    }

    public void exibirDetalhesRemover() {
        System.out.println(" | Prato: " + nome + " | Preço: R$ " + preco);
    }
}