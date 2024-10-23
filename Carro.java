import javax.swing.JOptionPane;

public class Carro {
    private int id; 
    private String modelo;
    private double quilometragem;
    private double valorVenda;

    public void cadastrarCarro() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do carro"));
        this.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
        this.quilometragem = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem do carro"));
        this.valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de venda do carro"));
    }
    
    public String imprimirResumoCarro() {
        // Corrigindo a construção da string para incluir todas as informações necessárias
        String msg = "Id: " + this.id + "\n" +
                     "Modelo: " + this.modelo + "\n" +
                     "Quilometragem: " + this.quilometragem + "\n" +
                     "Valor Venda: " + this.valorVenda; 
        return msg;
    }

    public void atualizarValorDesconto(double percentualDesconto) {
        // Corrigindo a lógica para aplicar o desconto corretamente
        this.valorVenda *= (1 - percentualDesconto / 100);
    }

    public double getValorVenda() {
        return this.valorVenda;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.cadastrarCarro();
        JOptionPane.showMessageDialog(null, carro.imprimirResumoCarro());
        
        double desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        carro.atualizarValorDesconto(desconto);
        JOptionPane.showMessageDialog(null, "Resumo após desconto:\n" + carro.imprimirResumoCarro());
    }
}
