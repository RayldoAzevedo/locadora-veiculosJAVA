package bean;

public class Aluga {

    private int codigo;
    private long fk_cliente;
    private Veiculo fk_veiculo;
    private String fk_produto;
    private String dtaluguel;
    private String dtdevolucao;
    private int diaslocado;
    private int kmatual;
    private int kmetragem;
    
    public Aluga (String dtaluguel,long fk_cliente, Veiculo fk_veiculo, String dtdevolucao,int kmetragem, int kmatual) {
        this.dtaluguel=dtaluguel;
        this.dtdevolucao = dtdevolucao;
        this.fk_cliente = fk_cliente;
        this.fk_veiculo.setPlaca(fk_veiculo.getPlaca()); 
        this.kmetragem = kmetragem;
        this.kmatual = kmatual;
    }

    public int getCod() {
        return codigo;
    }

    public void setCod(int cod) {
        this.codigo = cod;
    }

    public String getDtaluguel() {
        return dtaluguel;
    }

    public void setDtaluguel(String dtaluguel) {
        this.dtaluguel = dtaluguel;
    }

    public long getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(long fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    public Veiculo getFk_veiculo() {
        return fk_veiculo;
    }

    public void setFk_veiculo(Veiculo fk_veiculo) {
        this.fk_veiculo.setPlaca(fk_veiculo.getPlaca());
    }

    public String getDtdevolucao() {
        return dtdevolucao;
    }

    public void setDtdevolucao(String dtdevolucao) {
        this.dtdevolucao = dtdevolucao;
    }

    public int getKmetragem() {
        return kmetragem;
    }

    public void setKmetragem(int kmetragem) {
        this.kmetragem = kmetragem;
    }

    public int getKmatual() {
        return kmatual;
    }

    public void setKmatual(int kmatual) {
        this.kmatual = kmatual;
    }
    
    
}
