package junit;

public class Apple {
	
	private  String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	boolean checkcolor()
	{
		if(color.equalsIgnoreCase("Green") || color.equalsIgnoreCase("Red"))
		 
			return true;
		
		return false;
	}

}
