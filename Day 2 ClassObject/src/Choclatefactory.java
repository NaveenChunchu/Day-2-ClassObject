
public class Choclatefactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Choclate cadburyDairyMilk	 = new Choclate("Diary Milk",200,155.00,"Paperbox");
		 Choclate Fivestar	 = new Choclate("5Star Softbar",10,25.00,"Silverfoil");
		 Choclate Snickers	 = new Choclate("Peanut Choclate",100,200.00,"SilverFoil");
		 Choclate Kitkat	 = new Choclate("Diary Milk",200,155.00,"Silverfoil");
		 Choclate Milkybar	 = new Choclate("Diary Milk",10,30.00,"Silverfoil");
		 Choclate Amul	 = new Choclate("Dark Choclate",150,120.00,"Paperbox");
		 Choclate Fuse	 = new Choclate("Dark Milk",20,30.00,"Silverfoil");
		 Choclate Perk	 = new Choclate("Bites",10,20.00,"Paperbox");
		 Choclate Justjelly = new Choclate("Jelly",5,20.00,"Aluminifoil");
		 Choclate Candyman = new Choclate("Candy",2,15.00,"Silverfoil");
		 Choclate Munch = new Choclate("Nuts",50,80.00,"SilverFoil");
		 Choclate Eclaires = new Choclate("CarmelChewes",1,10.00,"Aluminiumfoil");
		 Choclate Kopiko = new Choclate("coffee",1,10.00,"Silverfoil");
		 Choclate Crunch = new Choclate("Crunchy",50,50.00,"Silverfoil");
		 Choclate Coffebite = new Choclate("Lotte coffebite",175,150.00,"Goldfoil");
		 
		 System.out.println(cadburyDairyMilk);
		 System.out.println(Fivestar);
		 System.out.println(Snickers);
		 System.out.println(Kitkat);
		 System.out.println(Milkybar);
		 System.out.println(Amul);
		 System.out.println(Fuse);
		 System.out.println(Perk);
		 System.out.println(Justjelly);
		 System.out.println(Candyman);
		 System.out.println(Munch);
		 System.out.println(Eclaires);
		 System.out.println(Kopiko);
		 System.out.println(Crunch);
		 System.out.println(Coffebite);

		 
		 
		
		 System.out.println("fuse   " + Fuse.hashCode());  // hashcode
		 System.out.println( "Amul  " + Amul.hashCode());  // hashcode
		 
		
		 boolean result = (Crunch == Kopiko);
		 System.out.println(result);
		 
		 result = (Crunch.hashCode()==Kopiko.hashCode());
		 System.out.println(result);
		 

	}

}
