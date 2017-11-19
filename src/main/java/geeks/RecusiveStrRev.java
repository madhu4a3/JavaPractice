package geeks;

public class RecusiveStrRev
{

	/**
	 * @param args
	 */
	/*
	 * public static String revString(String instr){ if(instr.length()<2){
	 * return instr; } return (revString(instr.substring(1)))+instr.charAt(0); }
	 */
	/*
	 * public static String removeChar(String instr,char c){ StringBuffer sb=new
	 * StringBuffer(); if(instr!=null && instr.length()!=0){ for(int
	 * i=0;i<instr.length();i++){ if(instr.charAt(i)!=c)
	 * sb.append(instr.charAt(i)); } } else{ System.out.println(
	 * "Skipping removing as the string might not be initialized or length is zero"
	 * ); return instr; } return sb.toString(); }
	 */
	public static String largePalindrome(String sStr)
	{
		if (sStr != null && sStr.length() != 0)
		{
			for (int i = 0, j = sStr.length() - 1; i < (sStr.length() / 2);)
			{
				if (sStr.charAt(i) == sStr.charAt(j))
				{
					i++;
					j--;
				}
				else
				{
					j--;
				}
			}
		}
		return "";
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// System.out.println(revString("madhu"));
		// System.out.print(removeChar("",'a'));

	}

}
