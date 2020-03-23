package StringProblems;

public class StringRotation 
{
	public boolean isARotationOf(String input, String toCheck)
	{
		return input.length()==toCheck.length() && (input+input).contains(toCheck);
	}
	
	public String leftRotate(String input,int offset)
	{
		return (input.substring(offset,input.length()) + input.substring(0,offset));
	}
	
	public String rightRotate(String input,int offset)
	{
		return (input.substring(input.length()-offset,input.length()) + (input.substring(0,(input.length()-offset))));
	}
	
	public static void main(String[] args) {
		StringRotation sr = new StringRotation();

		String input = "qwertyu";
		String toCheck = "yuqwert";
		int offset = 2;
		String str = "";
		str = sr.isARotationOf(input, toCheck) ? "Is a Rotation" : "Is not a Rotation";
		
		System.out.println(sr.leftRotate(input, offset));
		System.out.println(sr.rightRotate(input, offset));
		
		System.out.println(str);
	}
}
