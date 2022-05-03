package eql.java;

public enum Age {
	
	SIX(6),
	SEPT(7),
	HUIT(8),
	NEUF(9),
	DIX(10),
	ONZE(11);
		
		private int age;
		
	     Age(int age) {  
	        this.age = age ;  
	   }  
	     
	    public int getAge() {  
	        return  this.age ;  
	   }
	}
