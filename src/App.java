public class App {
    public static void main(String[] args) throws Exception {
        int numero = 5;
        int i = 1;
        while ( i < numero + 1) {
            String temp = "";
            for (int j = 0;  j < i; j++){
                temp = temp + i;
            }
            System.out.println(temp);
            i++;
        }
    }
}
