import java.util.Scanner;
class RockPaperSissors{
    public static void main(String[] args){
        System.out.println("가위바위보 게임!");
        System.out.println("1.가위 2.바위 3.보");
        //컴퓨터가 바위를 냈어요!
        Scanner scan = new Scanner(System.in);
        int op = 0;
        op = scan.nextInt();
        if(op==1){
            System.out.println("당신은 패배자!");
        }else{} if(op==2){
            System.out.println("이열 비겼네요?");
        }else if(op==3){
            System.out.println("당신은 위너!");
        }else{
            System.out.println("다시 입력하세요~");
        }
    }
}