public class YearRange{
	int firstYear, secondYear, rangeType;
	
	public YearRange(int a, int b){
		firstYear=a;
		secondYear=b;
	}
	
	public void setRangeType(int rnge){
		rangeType=rnge;
	}
	
	public int getFirstYear(){
		return firstYear;
	}
	
	public int getSecondYear(){
		return secondYear;
	}
	
	public int getFirstDivisor(){
		int firstdivisor=1;
		if (rangeType==1)
			firstdivisor=14;
		if (rangeType==2)
			firstdivisor=4;
		if (rangeType==3)
			firstdivisor=3;;
		
		return firstdivisor;
	}
	
	public int getSecondDivisor(){
		int seconddivisior=20;
		return seconddivisior;
	}
	
	public void printYears(){
		if(rangeType==1)
			for(int i=firstYear;i<=secondYear;i++)
				if(i%getFirstDivisor()==0 && i%getSecondDivisor()==0)
					System.out.println(i);
		
		if(rangeType==2){
			for(int i=firstYear;i<=secondYear;i++){
				if(i%getFirstDivisor()==0)
					System.out.print(i+", ");
				// The following makes the output neater
				if((i-firstYear+1)%40==0)
					System.out.println();
			}
			System.out.println();
		}
		if(rangeType==3)
			for(int i=firstYear;i<=secondYear;i++)
				if((i+2)%4==0 && i%getFirstDivisor()==0)
					System.out.println(i);
	}

	
	public static void main(String[] args){
		//Get all years divisible by 14 and 20
		YearRange myFirstRange = new YearRange(1314, 2014); 
		myFirstRange.setRangeType(1);
		
		//Get all leap years.
		YearRange mySecondRange = new YearRange(1100, 3150); 
		mySecondRange.setRangeType(2);
		
		//Get all Olympic years divisible by 3
		YearRange myThirdRange = new YearRange(1500, 1890); 
		myThirdRange.setRangeType(3);
		
		System.out.println("List of all years divisible by " + 
		myFirstRange.getFirstDivisor() + " and " + 
		myFirstRange.getSecondDivisor());
		myFirstRange.printYears();
		
		System.out.println("List of all leap years between " + 
		mySecondRange.getFirstYear() + " and " +
		mySecondRange.getSecondYear());
		mySecondRange.printYears();
		
		System.out.println("List of all Olympic years between " + 
		myThirdRange.getFirstYear() + " and " + myThirdRange.getSecondYear() + 
		" that are divisible by " + myThirdRange.getFirstDivisor());
		myThirdRange.printYears();
	}
}

