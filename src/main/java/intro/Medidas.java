package intro;


public class Medidas {

    public static void main(String[] args){
        System.out.println("Olá mundo!");

        int largura = 4;
        int comprimento = 3;

        Calcular(largura,comprimento);

    }

    public static void Calcular(int largura, int comprimento){

        System.out.println("Resultado: " + largura * comprimento);

    }
}
