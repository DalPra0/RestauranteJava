public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;
    private String cep;

    public Cliente(String nome, String telefone, String cpf, String cep) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.cep = cep;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Cliente: " + nome + " | Telefone: " + telefone);
    }
}