public class Mammal {
	private int energyLevel; 
	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public int getEnergy() {
		return energyLevel;
	}	
	public int displayEnergy() {
		System.out.println("Energy level is "+ energyLevel);
		return energyLevel;
	}
}