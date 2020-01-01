/*
编写一个静态方法 lg()，接受一个整型参数 N，
返回不大于 log2N 的最大整数。不要使用 Math 库。
*/
public class Ex14 {
    public static int lg(int N){
        int m=1;
        int flag=0; //返回的值
        for (int i=0;m<N;i++){
            m=m*2;
            flag++;
        }
            return flag;
    }
    public static void main(String[] args) {
        int N = 45;
        System.out.println(lg(N));
    }
}