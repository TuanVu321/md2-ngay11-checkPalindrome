import java.util.Stack;

public class CheckPalindrome {
    public static void check(String string){
        String temp="";
        Stack<String> reserveString = new Stack<>();
        String[] arrString = string.split("");
        for(int i=0;i<arrString.length;++i){
            reserveString.push(arrString[i]);
        }
        while(reserveString.size()!=0){
            temp+=reserveString.pop();
        }
        if(string.equals(temp)){
            System.out.println("la chuoi palindrome");
        }else {
            System.out.println("khong la chuoi palindrome");
        }
    }
}
