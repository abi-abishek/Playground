public class arr {
    public static void main(String[] args) {
        String[] cars = {"Tesla","BMW","Ford"};
        int[] numbers = {10,20,30,40};
        for(String i : cars){
            System.out.println(i);
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
