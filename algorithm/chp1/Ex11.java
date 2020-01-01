/*
打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出
行号和列号
*/

public class Ex13 {
    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];//新建二维数组
        a=RandomInitial(a);//随机初始化
        TestPrint(a);//打印数组
    }
    public static void TestPrint(boolean [][] a )
    {
    	for(int i = 0;i<10;i++)
    		System.out.print(" " + i);
    		System.out.println(" ");
    	for (int i = 0;i<10;i++){
    		System.out.print(i);
    		for (int j =0;j<10 ;j++ ) {
    		if (a[i][j])
    			System.out.print("*" + " ");
    		else
    			System.out.print(" " + " ");
    	}
    	System.out.println(" ");
    }
    
    }



    public static boolean[][] RandomInitial( boolean [][] a)
    {
        for(int i=0;i<a.length;i++) //行
        {
            for(int j=0;j<a.length;j++) //列
            {
                if(Math.random()>0.5) //因为Math.random()范围是0-1
                    a[i][j]=true;
                else
                    a[i][j]=false;
            }
        }
        return a;
    }
}