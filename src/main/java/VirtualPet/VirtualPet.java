package VirtualPet;

public class VirtualPet {

	private int hunger;
	private int waste;
	private int boredom;


	public VirtualPet(int hunger, int waste, int boredom) {
		this.hunger = hunger;
	    this.waste = waste;
		this.boredom = boredom;
	}

	public int getHunger() {
		return hunger;
	}

	public int getWaste() {
		return waste;
	}

	public int getBoredom() {
		return boredom;
	
	}

	public void tick(){
	hunger += 10;
	boredom += 10;
	waste +=10 ;
	
	}

	public void feed() {
       hunger -=10;
       waste +=10;
    	  
      
	}

	public void play() {
       boredom -=10;
	
	}

	public void tankClean() {
		 waste +=10;
	}


	}

	

