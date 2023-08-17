import java.util.*;
public class kaka {

    public static boolean isPrime (int Num) {
            int C = 0;
            for(int i = 1; i <= Num; i++){
                if(Num%i == 0){
                    C++;
                }
            }
            if(C == 2){
                //System.out.print(C);
                return true;
            }

            return false;
    }

    public static int prevPrime(int Num){

        for(int i = Num-1; i < Num; i--){
            int C = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    C++;
                }
            }
            if(C == 2){
                //System.out.print(C);
                return i;
            }
        }
        return 2;
    }

    public static int nextPrime(int Num){

        for(int i = Num+1; i > Num; i++){
            int C = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    C++;
                }
            }
            if(C == 2){
                //System.out.print(C);
                return i;
            }
        }
        return 0;
    }

    public static long MaxArray(ArrayList<Long> array){
            long Max = 0;
            for(int i = 0; i < array.size(); i++){
                if(array.get(i) > Max){
                    Max = array.get(i);
                }
            }
            return Max;
        }


    public static int solve(int A) {
        //System.out.print(isPrime(A));
        if(isPrime(A)){
            int Prev = prevPrime(A);
            int Next = nextPrime(A);

            //System.out.println(Prev);
            //System.out.println(Next);

            int X = Prev;
            int Abs = Math.abs(A - Prev);

            if((Math.abs(A - Next)) < Abs){
                Abs = Math.abs(A - Next);
                X = Next;
            }

            return X;
        }

        int N = A;
        int i = 2;
        int Count = 0;
        int[] Factors = new int[A];
        while(A >= (i*i)){
            while(N%i == 0){
                Factors[Count] = i;
                Count++;
                N/=i;
            }
            i++;
        }
        Factors = Arrays.copyOf(Factors, Factors.length - (A-Count));

        //System.out.print(Arrays.toString(Factors));


        int[] Primes = new int[A/2];
        int Pcount = 0;
        int counter = 0;
        int b = 1;
        for(int a=2;a<=(A/2);a++){
            counter = 0;
            for(b=1;b<=a;b++){
               if(a%b==0){
                  counter++;
               }
            }
            if(counter==2){
                Primes[Pcount] = a;
                Pcount++;
            }
        }

        Primes = Arrays.copyOf(Primes, Pcount);
        //System.out.print(Arrays.toString(Primes)); 


        N = A;
        long X = 0;
        int Abs = Math.abs(A - (int) X);

        ArrayList<Long> XC = new ArrayList<Long>();

        for(int j = 0; j < Factors.length; j++){
            long Common = 1;
            int prime = 0;
            //Common = N/Factors[j];

            for(prime = 0; prime < Primes.length; prime++){
                Common = N/Factors[j];
                // System.out.println(Common);
                // System.out.println(Primes[prime]);
                // System.out.println(Factors[j]);
                if(Primes[prime] == Factors[j]){
                    Common*=Primes[prime+1];
                    //System.out.println(Common);
                }
                else{
                    Common*=Primes[prime];
                    //System.out.println(Common);
                }
                //System.out.println(Abs);
                if((Math.abs(A - Common) <= Abs) && Common != A && Common > X){
                    Abs = Math.abs(A - (int) Common);
                    X = Common;
                    //XC.add(X);  
                }
            }
        }
        // ArrayList<Long> XL = new ArrayList<Long>();
        // for(int j = 0; j < XC.size(); j++){
        //     X = 0;
        //     Abs = Math.abs(A - (int) X);

        //     if((Math.abs(A - XC.get(j)) <= Abs) && XC.get(j) != A){
        //         Abs = Math.abs(A - (int) XC.get(j));
        //         XL.add(XC.get(j));
        //     }
        // }
        //System.out.print(XC);
        //long Max = MaxArray(XL);

        return (int)X;
    }

    public static void main(String args[]){
        System.out.println((solve(90)));
    }
}
