import javax.swing.JOptionPane;

public class Venda {

    private Carro carro; 
    private Cliente cliente;

    public void realizarVenda() {
        this.carro = new Carro();
        carro.cadastrarCarro();
        this.cliente = new Cliente();
        cliente.cadastrarCliente();
        
        double parcela = this.carro.getValorVenda() / 36; // Cálculo da parcela

        // Verifica se a venda é válida
        if (validarVenda(parcela, this.cliente.getRenda())) {
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Venda NÃO realizada! A parcela é muito alta.");
        }
    }

    public boolean validarVenda(double valorParcela, double renda) {
        // Verifica se o valor da parcela é menor que 30% da renda do cliente
        double limite = renda * 0.3; 
        return valorParcela < limite; // Retorna true se a parcela for menor que 30% da renda
    }
    public static void main(String[] args) {
        Venda venda = new Venda();
        venda.realizarVenda();
    }
}
