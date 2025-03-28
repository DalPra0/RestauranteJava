import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Restaurante restaurante;
    private Cliente cliente;
    private Pedido pedido;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.restaurante = new Restaurante("Restaurante BCC");
        inicializarMenuRestaurante();
    }

    public void executar() {
        cadastrarCliente();
        criarPedido();
        processarPedido();
        scanner.close();
    }

    private void inicializarMenuRestaurante() {
        restaurante.adicionarPratoAoMenu(new Prato(1, "Lasanha", 35.0));
        restaurante.adicionarPratoAoMenu(new Prato(2, "Feijoada", 50.0));
        restaurante.adicionarPratoAoMenu(new Prato(3, "Pizza", 60.0));
        restaurante.adicionarPratoAoMenu(new Prato(4, "Hambúrguer", 25.0));
        restaurante.adicionarPratoAoMenu(new Prato(5, "Arroz", 20.0));
        restaurante.adicionarPratoAoMenu(new Prato(6, "Salada", 15.0));
    }

    private void cadastrarCliente() {
        System.out.println("*** CADASTRAR CLIENTE ***");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfCliente = scanner.nextLine();

        if (!Validador.validarCPF(cpfCliente)) {
            System.out.println("Informação Incorreta");
        }

        System.out.print("CEP: ");
        String cepCliente = scanner.nextLine();

        if (!Validadore.validarCep(cepCliente)) {
            System.out.println("Informação incorreta");
        }

        cliente = new Cliente(nomeCliente, telefoneCliente, cpfCliente, cepCliente);
    }

    private void criarPedido() {
        pedido = new Pedido(cliente);
        restaurante.listarPratos();
    }

    private void processarPedido() {
        boolean continuar = true;
        while (continuar) {
            adicionarPratoAoPedido();
            pedido.exibirPedido();
            removerPratosSeNecessario();
            continuar = verificarSeContinua();
        }
        pedido.exibirPedido();
    }

    private void adicionarPratoAoPedido() {
        System.out.print("\nDigite o código do prato desejado: ");
        int codigoPrato = scanner.nextInt();
        scanner.nextLine();
        Prato prato = restaurante.buscarPrato(codigoPrato);
        if (prato != null) {
            pedido.adicionarPrato(prato);
        } else {
            System.out.println("\nPrato não encontrado, tente novamente.");
        }
    }

    private void removerPratosSeNecessario() {
        System.out.print("Deseja remover algum prato? (s/n): ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            pedido.exibirPedidoRemover();
            System.out.print("Digite o código do prato a remover: ");
            int codigoPratoRemover = scanner.nextInt();
            scanner.nextLine();
            pedido.removerPrato(codigoPratoRemover);
            System.out.println("Pedido atualizado:");
            pedido.exibirPedido();
        }
    }

    private boolean verificarSeContinua() {
        System.out.print("Deseja encerrar? (s/n): ");
        String respostaEncerrar = scanner.nextLine();
        return !respostaEncerrar.equalsIgnoreCase("s");
    }
}