package controlFlow;

public class ExampleIf {
    public static void main(String[] args) {
        int input = 1;
        if(input != 0){
            System.out.println("2 divided by " + input + " equals " + (2 / input));
        }else{
            System.out.println("Input is less/equal to ZERO!");
        }
        return;
    }
}
