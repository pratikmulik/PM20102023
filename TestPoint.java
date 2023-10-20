package Q5_1;
import java.lang.Math;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Point2D P1=new  Point2D(0,0);
		Point2D P2=new  Point2D(1,1);
		Point2D P3=new  Point2D(2,2);
		Point2D P4=new  Point2D(3,3);
		Point2D P5=new  Point2D(4,4);
		Point2D Parr[]=new  Point2D[5];
		Parr[0]=P1;
		Parr[1]=P2;
		Parr[2]=P3;
		Parr[3]=P4;
		Parr[4]=P5;
		
		int choice;
		
		do {
		System.out.println("1. Accept Data 2.Show Data 3.Modify Data 4.Calculate Distance 5.Check Equality 6.Exit\nPlease enter your choice=");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
				for(int i=0;i<Parr.length;i++)
				{
				System.out.println("Enter value of X=");
				double x=sc.nextDouble();
				System.out.println("Enter value of Y=");
				double y=sc.nextDouble();
				Parr[i].setX(x);
				Parr[i].setY(y);
				}
				break;
			case 2:
				for (int j=0;j<Parr.length;j++)
					{System.out.println("\nValue at position ="+j+": ");
					System.out.println(Parr[j]);
					}
				break;
			case 3:
				System.out.println("Enter between 0 and 4 at which position you want to change value of x & y=");
				int ch=sc.nextInt();
				if(ch>=0 && ch<=4)
				{System.out.println("Enter new value of X=");
				double x=sc.nextDouble();
				System.out.println("Enter new value of Y=");
				double y=sc.nextDouble();
				Parr[ch].setX(x);
				Parr[ch].setY(y);
				System.out.println("Values Updated");
				}
				else
				{
					System.out.println("Invalid Choice. Our array is between 0 and 4");
				}
				break;
				
			case 4:
				System.out.println("Enter between 0 and 4 from which position you want distance of your point");
				int chh=sc.nextInt();
				if(chh>=0 && chh<=4)
				{System.out.println("Enter value of your X=");
				double xx=sc.nextDouble();
				System.out.println("Enter value of your Y=");
				double yy=sc.nextDouble();
				double answer=Parr[chh].calDistance(xx,yy);
				System.out.println("Distance is ="+answer);
				}
				else
				{
					System.out.println("Invalid Choice. Our array is between 0 and 4");
				}
				break;
				
			case 5:
				System.out.println("Enter between 0 and 4 with which position you want to compare values of x & y=");
				int chhh=sc.nextInt();
				if(chhh>=0 && chhh<=4)
				{System.out.println("Enter new value of X=");
				double x=sc.nextDouble();
				System.out.println("Enter new value of Y=");
				double y=sc.nextDouble();
				boolean TnF=Parr[chhh].isEqual(x,y);
				if(TnF==true)
				{
					System.out.println("They are equal");
				}
				else
				{
					System.out.println("They are not equal");
				}
				}
				break;
			case 6:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid choice....!!!");
				break;
				
		}
		} while(choice!=6);
		

	}

}
