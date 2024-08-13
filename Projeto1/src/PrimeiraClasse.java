public class PrimeiraClasse {
    public static void main(String[] args) {
        System.out.println("Olá Vinicius");
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        cliente.setNome("Rodolfo");
        // System.out.println(cliente.getCodigo());
        // System.out.println(cliente.getEndereco());
        cliente.imprimirCodigo();
        cliente.imprimirNome();
        cliente.imprimirEndereco();
     
    }
}
