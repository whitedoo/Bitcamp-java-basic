import java.util.Scanner;
import java.util.Random;
class Dice{
    public static void main(String[] args){
        System.out.println("주사위의 숫자가 홀일까요? 짝일까요?");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(6)+1;
        System.out.println(String.format("랜덤으로 나온수 %d", dice));
        String dap = "";
        if(dice==1){
            dap="홀";
        }else if(dice==2){
            dap="짝";
        }else if(dice==3){
            dap="홀";
        }else if(dice==4){
            dap="짝";
        }else if(dice==5){
            dap="홀";
        }else{
            dap="짝";}

        System.out.println("주사위 값은 홀, 짝 입력 [  ] ");
        String answer = "";
        answer = scan.next();
        if(answer.equals(dap)){
            System.out.println("딩동댕!");
        }else if(!answer.equals(dap)){
            System.out.println("땡!");
        }else{
            System.out.println("잘못쳤어요!");
        }

    }
}