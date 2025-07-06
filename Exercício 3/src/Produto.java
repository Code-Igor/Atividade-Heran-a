public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String exibirInfo(){

        String info = "\nNome: "+nome+ "\nPreço: "+preco+ " reais"; // variavel para retornar uma string ao inves de só retornar um print
        return info;
    }
}
