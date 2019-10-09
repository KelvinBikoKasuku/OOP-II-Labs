public class MultiplicationTable{
	int multiplicationnumber;
	int rangeFrom;
	int rangeTo;

	public void setmn(int mn){
		multiplicationnumber=mn;
	}
	
	public void setrf(int rf){
		rangeFrom=rf;
	}
	
	public void setrt(int rt){
		rangeTo=rt;
	}
	
	public void printTable(){
		System.out.println("Multiplication Table of "+multiplicationnumber+" from "+rangeFrom+" to "+rangeTo+":");
		for(int i=rangeFrom;i<=rangeTo;i++){
			System.out.println(multiplicationnumber+"x"+i+"="+multiplicationnumber*i);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		MultiplicationTable three=new MultiplicationTable();
		three.setmn(3);
		three.setrf(17);
		three.setrt(25);
		
		MultiplicationTable seventeen=new MultiplicationTable();
		seventeen.setmn(17);
		seventeen.setrf(3);
		seventeen.setrt(49);
		
		MultiplicationTable zero=new MultiplicationTable();
		zero.setmn(0);
		zero.setrf(1);
		zero.setrt(5);
		
		three.printTable();
		seventeen.printTable();
		zero.printTable();
	}
}