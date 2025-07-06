public class CortadorDeGrama extends Produto {
    private String marca;
    private double raioCorte;


    public CortadorDeGrama(String nome, double preco, String marca, double raioCorte) {
        super(nome, preco);
        this.marca = marca;
        this.raioCorte = raioCorte;
    }

    @Override
    public String exibirInfo() {
        String infoBasica = super.exibirInfo();

        String infoExtra = "\nMarca: " + marca + "\nRaio de corte: " + raioCorte + " cm";

        return infoBasica + infoExtra;
    }
}

