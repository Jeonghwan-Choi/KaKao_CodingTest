package com.Cote;

public class New_id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("?");
		
		String new_id = "...!@BaT#*..y.abcdefghijklm";
        String answer = "";
        String temp = new_id.toLowerCase();

        temp = temp.replaceAll("[^-_.a-z0-9]","");
        System.out.println(temp);
        temp = temp.replaceAll("[.]{2,}",".");
        temp = temp.replaceAll("^[.]|[.]$","");
        System.out.println(temp.length());
        if(temp.equals(""))
            temp+="a";
        if(temp.length() >=16){
            temp = temp.substring(0,15);
            temp=temp.replaceAll("^[.]|[.]$","");
        }
        System.out.println(temp.charAt(temp.length()-1));
        if(temp.length()<=2) {
        	while(temp.length()<3)
                temp+=temp.charAt(temp.length()-1);
        }
            

        answer=temp;
		System.out.println(answer);

	}

}