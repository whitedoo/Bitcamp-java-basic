import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.print("어디에 사세요?!");
        String region = "";
        Scanner scanner = new Scanner(System.in);
        region = scanner.next();
        System.out.print(String.format("저는 %s 삽니다.", region));
        
    }
}