public class Methods {
    public static void main(String[] args) {
        int num1 = 11;
        int answer;
        answer = multiplyNumbers(num1);

        System.out.println("The result is "+ answer);
    }
    public static int multiplyNumbers(int a){
        int ans = a * 7;
        return ans;
    }
}
