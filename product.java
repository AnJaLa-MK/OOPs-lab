public class product{
	int pcode;
	int price;
	String pname;
	
	void getdata(int p1,String p2,int p3){
		pcode=p1;
		pname=p2;
		price=p3;		
	}
	
	public static void main(String[] args){
		System.out.println("Name : Anjala Michael");
		System.out.println("Roll No : 7 ");
		System.out.println("Date : 24/03/2023");	
		
		int smallest;
		product ob1 = new product();
		product ob2 = new product();
		product ob3 = new product();
		
		ob1.getdata(1234,"Smart TV",55000);
		ob2.getdata(1235,"Smart Watch",15000);
		ob3.getdata(1236,"Smart Phone",25000);
		
		if(ob1.price<ob2.price){
			if(ob3.price<ob1.price){
				smallest = ob3.price;
			}
			else{
				smallest = ob1.price;
			}
		}
		else{
			if(ob2.price<ob3.price){
				smallest = ob2.price;
			}
			else{
				smallest = ob3.price;
			}
		}
		
		System.out.println("The lowest price is "+smallest);
	}
}

