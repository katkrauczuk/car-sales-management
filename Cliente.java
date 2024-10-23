import javax.swing.JOptionPane;

public class Cliente {
    private int id; 
    private String nome;
    private int idade; 
    private double renda;

    public void cadastrarCliente() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente"));
        this.nome = JOptionPane.showInputDialog("Digite o nome do cliente");
        
        // Validação da idade
        do {
            this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente (deve ser maior que 18 anos)"));
            if (this.idade <= 18) {
                JOptionPane.showMessageDialog(null, "Idade inválida! Apenas clientes com mais de 18 anos podem ser cadastrados.");
            }
        } while (this.idade <= 18);
        
        this.renda = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do cliente"));
    }
    
    public String imprimirResumoCliente() {
        String msg = "Id: " + this.id + "\n";
        msg += "Nome: " + this.nome + "\n";
        msg += "Idade: " + this.idade + "\n";  
        msg += "Renda: " + this.renda + "\n"; 
        return msg;
    }

    public double getRenda() {
        return this.renda;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        // Cadastrar cliente
        cliente.cadastrarCliente();
        
        // Imprimir resumo do cliente
        String resumo = cliente.imprimirResumoCliente();
        JOptionPane.showMessageDialog(null, resumo, "Resumo do Cliente", JOptionPane.INFORMATION_MESSAGE);
    }
}
