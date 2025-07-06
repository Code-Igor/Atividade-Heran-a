
public class Main {
    public static void main(String[] args) {

        MesaQuadrada m = new MesaQuadrada("Mesa",30, 20,30,40,"Madeira");

        CortadorDeGrama c = new CortadorDeGrama("Cortador de Grama Ultra Blaster",30000, "Melhor marca do mercado",100);

        System.out.print ("Produto 1"+ "\n"+m.exibirInfo()+"\nProduto 2"+"\n"+c.exibirInfo());


    }
}