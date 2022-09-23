package Array;

public class ArrayStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rollNo[]= {1,2,3,4,5};
		int marks[]= {65,58,89,42,76};
		int temp,i,j;
		for(i=1;i<marks.length;i++)
		{
			for(j=0;j<marks.length;j++)
			{
				if(marks[i]>marks[j])
				{
					temp=marks[i];
					marks[i]=marks[j];
					marks[j]=temp;
					temp=rollNo[i];
					rollNo[i]=rollNo[j];
					rollNo[j]=temp;
				}
			}
		}
		for(int k1=0;k1<rollNo.length;k1++)
		{
			System.out.println(" "+rollNo[k1]);
		}
		System.out.println();
		for(int k1=0;k1<marks.length;k1++)
		{
			System.out.println(" "+marks[k1]);
		}

	}

}
