public class brkcont {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            if (i == 5){
                System.out.println("Using Continue Keyword we skipped 5");
                continue;
            }
            System.out.println(i);
        }
    }
}
