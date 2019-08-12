import java.util.Scanner;
import java.util.Random;
class RockPaperScissors2{
    public static void main(String[] args){
        System.out.println("가위 바위 보 !");
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int op = 0;
        op = ran.nextInt(3)+1;
        System.out.println(String.format("랜덤으로 나온 수 %d", op));
        String dap = "";
        if(op==1){
            dap = "가위";
        }else if(op==2){
            dap = "바위";
        }else if(op==3){
            dap = "보";
        }

        System.out.println("가위, 바위, 보!");
        String a = new String();
        a = scan.next();
        if(a.equals(dap)){
            System.out.println("무승부!");
        }else if(a.equals("가위")&& dap.equals("바위")){
            System.out.println("졌습니다.");
        }else if(a.equals("가위")&& dap.equals("보")){
            System.out.println("이겼습니다.");
        }else if(a.equals("바위")&& dap.equals("보")){
            System.out.println("졌습니다.");
        }else if(a.equals("바위")&& dap.equals("가위")){
            System.out.println("이겼습니다.");
        }else if(a.equals("보")&& dap.equals("가위")){
            System.out.println("졌습니다.");
        }else if(a.equals("보")&& dap.equals("바위")){
            System.out.println("이겼습니다.");
        }else{
            System.out.println("다시 입력하세요.");

    }
}
}