package Pattern;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int row=5;
             int col=1;
             for(int i=1;i<=row;i++)
             {
            	 for(int j=0;j<col;j++)
            	 {
            		 System.out.print(i%2);
            	 }
            	 System.out.println();
            	 col++;
            	 
             }
	}

}
//ans1
//00
//111
//0000
//11111
