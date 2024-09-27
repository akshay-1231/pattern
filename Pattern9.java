package Pattern;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  int row=5;
                  int col=1;
              
                  for(int i=1;i<=5;i++)
                  {
                	  for(int j=1;j<=row;j++)
                	  {
                		   System.out.print(" ");  
                	  }
                	  for(int k=1;k<=col;k++)
                	  {
                		  System.out.print(" *");
                	  }
                	  row--;
                	  col++;
                	  System.out.println(" ");
                  }
               
	}

}
