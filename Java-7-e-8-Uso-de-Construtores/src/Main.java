public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Aya Brea", "1988", "98765432100", "32987654321");
        Cliente cliente2 = new Cliente("Marvin Branagh", "98712365400");

        Database database = new Database();
        database.connect();
        database.createTableClientes();
        database.cadastrarCliente(cliente1);
        System.out.println("Cliente 1 cadastrado");
        database.cadastrarCliente(cliente2);
        System.out.println("Cliente 2 cadastrado");
        database.close();
    }
}