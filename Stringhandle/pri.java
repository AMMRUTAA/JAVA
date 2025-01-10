
class pri
{
	public static void main (String args[])
	{
		StringBuffer s1 = new StringBuffer("CELINEMAM");
		StringBuffer s2 = new StringBuffer("MYSELF PRIYA");
		StringBuffer s3 = new StringBuffer("40");
		String s;
		int b=20;
		char ch1;
		int start=2;
		int end=8;
		char target[]=new char[end-start];
		ch1=s1.charAt(0);
		s1.getChars(start,end,target,0);
		System.out.println("ch1=" +ch1);
		System.out.println(target);
		System.out.println("StringBuffer =" +s1);
		System.out.println("length =" +s1.length());
		System.out.println("Capacity =" +s1.capacity());
		s1.ensureCapacity(5);
		s1.setLength(5);
		System.out.println(s1);
		System.out.println("StringBuffer Before=" +s1);
		System.out.println("CharAt(1) before =" +s1.charAt(1));
		System.out.println(s1);
		s1.setCharAt(1,'i');
		System.out.println("CharAt(1) =" +s1.charAt(1));
		System.out.println("CharAt(1) After =" +s1);
		System.out.println("Insert=" +s2.insert(3,"savla"));
		System.out.println("Insert=" +s2.insert(7,"R"));
		s1.reverse();
		System.out.println("Reverse=" +s1);
		System.out.println("Delete=" +s2.delete(6,12));
		System.out.println("DeleteCharAt=" +s2.deleteCharAt(7));
		s2.replace(7,12,"priyanka");
		System.out.println("Replace=" +s2);
		System.out.println("Substring=" +s1.substring(0));
		System.out.println("Substring=" +s1.substring(0,5));
		s=s3.append("b=").append(b).append("Rupal").toString();
		System.out.println(s);
	}
}