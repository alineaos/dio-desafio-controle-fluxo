import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CONTADOR");
        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = sc.nextInt();
        try{
            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException e){
            e.printStackTrace();
        }
    }
    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if (parametro1 > parametro2){
            throw new ParametrosInvalidosException();
        }
        int contador = parametro2 - parametro1;
        for (int i = 1; i <= contador ; i++) {
            System.out.printf("\nImprimindo o %dº número", i);
        }
    }
}
