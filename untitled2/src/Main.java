import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // put your code here

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            BigInteger n= new BigInteger(reader.readLine());
            int m=Integer.parseInt(reader.readLine());
            ArrayList<Integer> arrayFibonacci=new ArrayList<>();

            arrayFibonacci.add(0, 0);
            arrayFibonacci.add(1, 1);

            for (int i = 2; i <=6*m ; i++) {
                arrayFibonacci.add(i, ( arrayFibonacci.get(i - 1)  + arrayFibonacci.get(i - 2) )   % m );  // остаток от деления

                if(arrayFibonacci.get(i) == 1 && arrayFibonacci.get(i-1) == 0){
                    break;
                }
            }


            int k=n % ( arrayFibonacci.size()-2);

            System.out.println(arrayFibonacci.get(k));





        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
