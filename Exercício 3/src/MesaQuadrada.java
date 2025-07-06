public class MesaQuadrada extends Produto {
    private double altura;
    private double largura;
    private double comprimento;
    private String material;


    public MesaQuadrada (String nome, double preco, double altura, double largura, double comprimento, String material){
        super(nome, preco);
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.material = material;
    }

    @Override
    public String exibirInfo() {
        String infoBase = super.exibirInfo();

        String infoExtra = "\nAltura: " + altura + " cm" + "\nLargura: " + largura + " cm" + "\nComprimento: " + comprimento + " cm" + "\nMaterial: " + material;

        return infoBase + infoExtra;
    }
}
