public class AverageValueOfArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        
        System.out.println("The average is: " + average);  
     }
  
     public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
           sum += numbers[i];
        }

        return sum / numbers.length;
     }
}
