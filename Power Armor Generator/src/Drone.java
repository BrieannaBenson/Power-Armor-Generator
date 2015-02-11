
public abstract class Drone {
	String Name;
	String Description;
	int PointCost;
	int Durability;
	DroneUpgrade Upgrade;
	
	public Drone (String Name, String Description, 
			int PC, int Durability, DroneUpgrade Upgrade) {
		this.Name = Name;
		this.Description = Description;
		this.PointCost = PC;
		this.Durability = Durability;
		this.Upgrade = Upgrade;
	}
}
