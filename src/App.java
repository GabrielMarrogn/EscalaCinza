import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        sc.nextLine();
        String[] num = new String[3];
        double[] numeros = new double[3];
        double[] resultados = new double[a];

        for(int i = 0; i < a; i++){
            String tipo = sc.nextLine();
            String dados = sc.nextLine();

            num = dados.split(" ");

            for(int k = 0; k < 3; k++){
                numeros[k] = Integer.parseInt(num[k]);
            }

            
            resultados[i] = caso(tipo, numeros);

        }

        for(int i = 0; i < a; i++){
            System.out.print("Caso #" +(i+1) +": ");
            double baixo = Math.floor(resultados[i]);
            System.out.printf("%.0f\n",baixo);
        }

        sc.close();
    }

    public static double caso(String a, double[] arr){
        double num = 0;
        // se o tipo for eye 
        if(a.equals("eye")){
            num = (arr[0] * 0.30) + (arr[1] * 0.59) + (arr[2] *  0.11);
        }
        //Se  o tipo for mean
        else if(a.equals("mean")){
            num = (arr[0] + arr[1] + arr[2]) / 3;
        }
        //Se o tipo for min
        else if(a.equals("min")){
            Arrays.sort(arr);
            num = arr[0];
        }
        //Se o tipo for max
        else if(a.equals("max")){
            Arrays.sort(arr);
            num = arr[2];
        }
        return num;
    }
}
