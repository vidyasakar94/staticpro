package org.strinpro;

public class StrInPro {
	
	public static void main(String[] args) {
		
		String Ins_Name = "GreensTechnology";
		String Course = "SeleniumAutomationtool";
		String Mentor_Name = "Velmurugan";
		String Lang = "j a v a p r o g r a m";
		String Con_Number = "9095484678";
		
		
		int InsName= Ins_Name.indexOf('o');
		System.out.println(InsName);
		
		int course = Course.lastIndexOf('o');
		System.out.println(course);
		
		int MentorName = Mentor_Name.indexOf('n');
		System.out.println(MentorName);
		
		int lang = Lang.lastIndexOf(' ');
		System.out.println(lang);
		
		
		int ConNumber =  Con_Number.indexOf('8');
		System.out.println(ConNumber);
		
		int ConNumber1 = Con_Number.lastIndexOf('8');
		System.out.println(ConNumber1);
		
		int ConNumber2 = Con_Number.indexOf('9', 1);
		System.out.println(ConNumber2);
		
		int ConNumber3 =  Con_Number.indexOf('9');
		System.out.println(ConNumber3);
		
		
		
	}

}
