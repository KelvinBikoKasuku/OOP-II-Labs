public class Building{
	String buildingName,colour;
	int nFloors, nRpf;	
	
	public void setname(String name){
		buildingName=name;
	}
	
	public void setclr(String clr){
		colour=clr;
	}
	
	public void setflrs(int flrs){
		nFloors=flrs;
	}
	
	public void setrms(int rms){
		nRpf=rms;
	}
	
	public static void printReport(Building[] anarrayofbuildings){
		for (Building s:anarrayofbuildings)
		System.out.println(s.buildingName+" is a "+s.colour+" building, and has "+s.nFloors*s.nRpf+" rooms.");
	}
	

	public static void main(String[] args){
		Building[] arrayofbuildings=new Building[5];
		
		Building b1=new Building();
		b1.setname("Alpha");
		b1.setclr("Red");
		b1.setflrs(1);
		b1.setrms(1);
		
		Building b2=new Building();
		b2.setname("Beta");
		b2.setclr("Orange");
		b2.setflrs(2);
		b2.setrms(2);
		
		Building b3=new Building();
		b3.setname("Gamma");
		b3.setclr("Yellow");
		b3.setflrs(3);
		b3.setrms(3);
		
		Building b4=new Building();
		b4.setname("Delta");
		b4.setclr("Green");
		b4.setflrs(4);
		b4.setrms(4);
		
		Building b5=new Building();
		b5.setname("Epsilon");
		b5.setclr("Blue");
		b5.setflrs(5);
		b5.setrms(5);
		
		arrayofbuildings[0]=b1;
		arrayofbuildings[1]=b2;
		arrayofbuildings[2]=b3;
		arrayofbuildings[3]=b4;
		arrayofbuildings[4]=b5;
		
		printReport(arrayofbuildings);
	}
}
		
		
