package controlFlow;

public class ExampleForEach {
    public static void main(String[] args) {
        int [] nrs = {0, 1, 2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int nr: nrs){
            if(nr % 2 == 0){
                continue;
            }
            System.out.println("Number "+ nr);
            sum += nr;
        }
        System.out.println("The Sum of the array is " + sum);
    }
}
