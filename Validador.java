public class Validador {
    private Validador() {};

    public static boolean validarCPF(String cpf){
        if(cpf == null || !cpf.matches("/^(0-9){3}.(0-9){3}.(0-9){3}-(0-9){2}/")){
            return false;
        }
        return true;
    }

    public static boolean validarCep(String cep){
        if(cep == null || !cep.matches("/^(0-9){5}-(0-9){3}/")){
            return false;
        }
        return true;
    }
}