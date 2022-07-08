public class Calcular {

    public static double somatorio(int variavel){
        double soma = 0;

        for (int i = 0; i <= variavel; i++) {
            soma += variavel * 3;
        }

        return soma;
    }

    public static double produtorio(int x, int y){
        double multiplicacao = 1;

        for (int i = 0; i <= x; i++){
            multiplicacao *= somatorio(x)*3*y;
        }

        return multiplicacao;
    }

}
