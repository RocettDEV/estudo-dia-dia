public class ExercicioArryDois {

    public static void main(String[] args) {
        
        int [] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        int pares = 0;
        int impares = 0;


        System.out.println("Numeros pares : ");
        for ( int numero : numeros)
            if (numero % 2 == 0 ) {
                System.out.println(numero + " ");
                pares ++;
            }
            System.out.println("\nQuantidade de números pares : " +pares);

            System.out.println("\nNumeros impares : ");
            for (int numero : numeros){
            if (numero % 2 != 0) {
                System.out.println(numero+ " ");
                impares++;
            }
        }
        System.out.println("\nQuantidade de números impares : " +impares);
    }
}