public class DevJava04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println("Resultado: " + resultado);

        int resto = 21 % 7;
        System.out.println("Resto da divisao: " + resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteDeVinte = 10 != 10;

        System.out.println("10 é maior que 20? " + isDezMaiorQueVinte);
        System.out.println("10 é menor que 20? " + isDezMenorQueVinte);
        System.out.println("10 é igual a 20? " + isDezIgualAVinte);
        System.out.println("10 é igual a 10.0? " + isDezIgualADez);
        System.out.println("10 é diferente de 10.0? " + isDezDiferenteDeVinte);
    }
}
