public class Main {
    public static void main(String[] args) {
        boolean valid=true;
        boolean invalid=false;
        int number=20;
        if(number%5==0 && number<100){
            System.out.println(valid);
        }else{
            System.out.println(invalid);
        }
        if(number%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }



    }
}