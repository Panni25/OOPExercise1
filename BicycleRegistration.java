public class BicycleRegistration
{
	public static void main (String []args){
		
		Bicycle bike_1, bike_2, bike1, bike2;
		String  tag1,tag2, Owner1,Owner2;
		
		bike1 =  new Bicycle(); 
		bike1.setOwnerName("Anthony Miles");
		
		bike2 = new Bicycle();
		bike2.setOwnerName("Billy Smith");
		
		bike_1= new Bicycle ();
		bike_1.settagNo("202256");
		
		bike_2=new Bicycle ();
		bike_2.settagNo("202257");
		
		Owner1 = bike1.getOwnerName();
		Owner2 = bike2.getOwnerName();
		
		tag1=bike_1.gettagNo();
		tag2=bike_2.gettagNo();
		
		System.out.println(Owner1 + " own a bicycle."+tag1);
		System.out.println(Owner2 + " also own a bicycle ."+tag2);
	}
	
}
