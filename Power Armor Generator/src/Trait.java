import java.util.ArrayList;

public abstract class Trait {
	StatMods StatMods;
	RollMods RollMods;
	int PointCost;
	ArrayList<Trait> Prerequisites;
	String Name;
	String Description;
	
	public Trait(StatMods SM, RollMods RM, int PC, 
			ArrayList<Trait> PR, String Name, 
			String Description) {
		this.StatMods = SM;
		this.RollMods = RM;
		this.PointCost = PC;
		this.Name = Name;
		this.Description = Description;
		for (Trait i : PR){
			this.Prerequisites.add(i);
		}
	}
	
	public StatMods getSM() {
		return this.StatMods;
	}
	public RollMods getRM() {
		return this.RollMods;
	}
	public int getPC() {
		return this.PointCost;
	}
	public ArrayList<Trait> getPR() {
		return this.Prerequisites;
	}
	public String getName() {
		return this.Name;
	}
	public String getDescription() {
		return this.Description;
	}
}
