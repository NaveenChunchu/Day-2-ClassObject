
public class CostlyChoc {

	public static void main(String[] args) {
		
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
		 
		 Choclate choc[] = new Choclate[15];
		 choc[0] = cadburyDairyMilk;
		 choc[1] = Fivestar;
		 choc[2] = Snickers;
		 choc[3] = Kitkat;
		 choc[4] = Milkybar;
		 choc[5] = Amul;
		 choc[6] = Fuse;
		 choc[7] = Perk;
		 choc[8] = Justjelly;
		 choc[9] = Candyman;
		 choc[10] = Munch;
		 choc[11] = Eclaires;
		 choc[12] = Kopiko;
		 choc[13] = Crunch;
		 choc[14] = Coffebite;
		 
		 double maxprice = choc[0].getPrice();
		 double minweight = choc[0].getWeight();
		 int var1 = 0;
		for(int i=1;i<choc.length;i++)
		 {
			 if(choc[i].getPrice()>maxprice)
			 {
				 maxprice = choc[i].getPrice();
				 var1=i;
			 }
		 }
		 System.out.println("The Costly Choclate is "+choc[var1].getCompany() +" and its price "+maxprice);
		 
	int var2 = 0;
	for(int i=1;i<choc.length;i++)
	{
		if(choc[i].getWeight()<minweight)
		{
			minweight = choc[i].getWeight();
		    var2 = i;
			
		}
	}
	
	System.out.println("The Less weight choclate is" + choc[var2].getCompany() + "and the weight is "+minweight);
	}

}
