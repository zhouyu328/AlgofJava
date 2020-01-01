public class Ex13
{
	//随机矩阵生成
	public static int[][] Randm(int m, int n)
	{
		int [][] a = new int[m][n];
		for (int i =0;i<a.length;i++ ) {
			for (int j=0;j<a[i].length;j++)
				a[i][j] = (int)(Math.random()*10);
		}
		return a;
	}
	//打印矩阵
	public static void show(int[][] a){
		for (int i=0;i<a.length ; i++){
			for (int j =0;j<a[i].length ;j++ ) {
				System.out.print(a[i][j] + " ");
			}
	System.out.println();
		}
	}
	//转置
	public static int[][] Tansfer(int m, int n, int[][] a){
		int [][] b = new int[n][m];
		for (int i =0;i<b.length;i++) {
			for (int j=0;j<b[i].length;j++) {
				b[i][j] = a[j][i];				
			}
		}
	return b;
	}
	public static void main(String[] args) {
		int m=3;
		int n=4;
		int [][] a = Randm(m,n);
		System.out.println("Orignal matrix is ");
		show(a);
		System.out.println("after tansfer, the matrix is ");
		int [][] b = Tansfer(m,n,a);
		show(b);
	}

}
