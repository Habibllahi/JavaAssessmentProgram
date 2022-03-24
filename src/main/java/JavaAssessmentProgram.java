import java.util.Arrays;

public class JavaAssessmentProgram {
    private static Console console = new Console();
    public static void main(String... args){
        console.Q1();
        console.Q2();
        console.Q3();
    }

    private static class Console{

        public Console(){

        }
        //Q1 Solution
        private void Q1(){
            int first = 2;
            String second = "4";
            int result =  first + Integer.parseInt(second); //The adjusted Line 3 as stated by the question
            writeLine(result);
        }

        //Q2 Solution
        private void Q2(){
            double x = 47.62;
            String y = "951";
            String z = "61x!";

            int X = 0;
            int Y = 0;
            int Z = 0;

            //TRY TO CONVERT
            try{
                  X = (int) x;
                  Y = Integer.parseInt(y);
                  Z = Integer.parseInt(z);
            }catch (Exception e){

            }finally {
                writeLine(X);
                writeLine(Y);
                writeLine(Z);
            }
        }

        //Q3 Solution
        private void Q3(){
            var elements = new int[]{25,4,33,87,2,99,60,19,81,45,10,19,72};
            writeLine(calculateSumOfArrayElement(elements));
            writeLine(calculateAverageOfArrayElement(elements));
        }

        private int calculateSumOfArrayElement(int[] elements){
            return Arrays.stream(elements).sum();
        }

        private int calculateAverageOfArrayElement(int[] elements){
            return (int) Arrays.stream(elements).average().getAsDouble();
        }

        private int findSmallestNumberInAnArray(int[] elements){
            return Arrays.stream(elements).min().getAsInt();
        }

        private void writeLine(int result){
            System.out.println("Answer is: " + result);
        }
    }
}
