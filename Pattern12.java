/*555555
44444
333
22
1*/

package Pattern;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int col=5;
		
		
		for(int i=5;i>=0;i--)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(i);
				
			}
			col--;
			System.out.println( );
		}
	}

}