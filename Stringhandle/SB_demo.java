
class SB_demo2
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("This is String Buffer") ;
		System.out.println("Initial Buffer : " +sb);
		System.out.println("Initial length is : " +sb.length());
		System.out.println("Character present at index 6 is : " +sb.charAt(6));
		System.out.println("After appending JAVA : " +sb.append("JAVA"));
		System.out.println("After inserting NEW : " +sb.insert(1,"NEW"));
		System.out.println("After reversing : " +sb.reverse());
	}
}