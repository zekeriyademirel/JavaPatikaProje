package ThreadRace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> allNumbers=new ArrayList<>();
        List<Integer> evenNumbers=new ArrayList<>();
        List<Integer> oddNumbers=new ArrayList<>();

        for (int i=1;i<=10000;i++){
            allNumbers.add(i);
        }

        List<NumberThreads> threads=new ArrayList<>();

        for (int i=0;i<4;i++){

            List<Integer> subList=  allNumbers.subList(i*2500,(i+1)*2500);
            NumberThreads numberT=new NumberThreads(subList,evenNumbers,oddNumbers);
            threads.add(numberT);
            numberT.start();
        }

        for (NumberThreads th : threads){
            th.join();
        }

        System.out.println("Even numbers: " + evenNumbers.size());
        System.out.println("Odd numbers: " + oddNumbers.size());
    }
}
