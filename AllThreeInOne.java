//package alltrheeinone;
import java.util.Date;

public class AllThreeInOne {

    //first method
    int Sum(int Number){
        int Sum = 0;
        for(int i = 1; i <= Number ; i++)
            Sum += i;

        System.out.println(" The Sum of the n numbers is : "+ Sum);
        return Sum;
    }  // end of Sum

    // second method
    int fib(int number){
        if(number <=1)
            return 1;
        else
            return fib(number - 1) + fib(number -2);
    }// end of fib

    // third method
    int Max(int Number1, int Number2){
        int Max;
        if(Number1 < Number2)
            Max = Number2;
        else
            Max = Number1;
        //System.out.println(" The maximum is : "+ Max);
        return Max;
    } // end of Max()

    // Testing starts here

    public static void main(String[] args) {

        //	Date date = new Date();

        long CurrentTimeMilliS ; // = System.currentTimeMillis();
        long CurrentTimeNanoS ; // = System.nanoTime();
        long ExecutionTimeFib, ExecutionTimeSum , ExecutionTimeMax ;
        AllThreeInOne myAllThree = new AllThreeInOne(); // instant of my object

        System.out.println(" The Sum is "+myAllThree.Sum(1000));

        //	CurrentTimeMilliS = System.currentTimeMillis();
        CurrentTimeNanoS = System.nanoTime();
        System.out.println(" The fib of 25 is " + myAllThree.fib(25));
        System.out.println(" The max of Numb1 and Numb2 is : "+
                myAllThree.Max(574,560));

        //	long newTimeSumFib = System.currentTimeMillis();
        long newTimeSumFib = System.nanoTime();
        ExecutionTimeFib = newTimeSumFib - CurrentTimeNanoS ;
        System.out.println(" It took "+ (ExecutionTimeFib / 10^9) + " Seconds " + " to run the Fib on 7 ");
       // System.out.println(" It took "+ (ExecutionTime / 10^9) + " Seconds " + " to run the Fib on 7 ");

        System.out.println("it took "  + " Milliseconds " +  " to run the sum ");

    }

}
