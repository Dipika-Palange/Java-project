package classesandobject;

public class MyDate {
	
	int dd,mm,yy;

	public MyDate() {
		dd=12;
		mm=11;
		yy=1995;
	}

	public MyDate(int dd, int mm, int yy) {
		
		this.dd = dd;	//dd=21
		this.mm = mm;	//mm=3
		this.yy = yy;	//yy=1999
	}
	
	public void display()
	{
		System.out.println("Date : "+dd+"/"+mm+"/"+yy);
	}

}
