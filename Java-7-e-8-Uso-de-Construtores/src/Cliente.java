public class Cliente {

    public String nome;
    public String nascimento;
    public String cpf;
    public String telefone;

    // Atributos do Cliente usando construtor
    public Cliente(String nome, String nascimento, String cpf, String telefone) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Atributos do Cliente usando construtor (somente o uso de nome e cpf)
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}