import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int randomNum = (int)(Math.random() * 101);
        int palpite, tentativas=0, i=0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Qual o seu palpite?");
            palpite=in.nextInt();

            if(palpite==randomNum){
                tentativas++;
                System.out.println("Parabéns, você acertou!! Só levou " +tentativas+ " tentativas para conseguir");
                i++;
            }else if(palpite > randomNum){
                tentativas++;
                System.out.println("Ops! O número informado é MAIOR, tente novamente");
            }else{
                tentativas++;
                System.out.println("Ops! O número informado é MENOR, tente novamente");
            }
        }while(i==0);
    }
}