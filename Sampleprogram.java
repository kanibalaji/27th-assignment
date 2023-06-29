package org.stringsample;

public class Sampleprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String name=new String("kanimozhi");
			String name1= new String("kanimozhi");
		    System.out.println(name.equals(name1));
		    System.out.println(name.hashCode());
		    System.out.println(name.charAt(3));
		    System.out.println(name.contains(name1));
		    System.out.println(name.endsWith(name1));
		    System.out.println(name.equalsIgnoreCase(name1));
		    System.out.println(name.compareTo(name1));
		    System.out.println(name.compareTo(name1));
		    System.out.println(name.contentEquals(name1));
		    System.out.println(name.charAt(7));
		    System.out.println(name.hashCode());
			System.out.println(name.matches(name1));
			System.out.println(name.split(name1));
			System.out.println(name.split(name1,6));
			System.out.println(name.toLowerCase());
			System.out.println(name.toUpperCase());
			char[] a=name.toCharArray();
			for(char k:a)
				System.out.println(k);
			System.out.println(name.toCharArray());
			System.out.println(name.substring(1,9));
			System.out.println(name.hashCode());
			System.out.println(name.subSequence(4, 5));
			
			
		    
		    

	}

}
