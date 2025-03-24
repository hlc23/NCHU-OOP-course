class Warrior {
	private int HP;
	private int MP;
  
    // Declaring method here
	public Warrior(int HP, int MP) {
		this.HP = HP;
		this.MP = MP;
	}
	public int getHP() {
		return this.HP;
	}
	
	public int getMP() {
		return this.MP;
	}
	
	public void setHP(int n) {
		this.HP = n;
	}
	
	public void setMP(int n) {
		this.MP = n;
	}
	
	public void Slash(Wizard wizard) {
		int wizard_hp = wizard.getHP();
		wizard.setHP(wizard_hp-this.MP);
	}
	
	public boolean CheckAlive() {
		if (this.HP > 0) {
			return true;
		}
		else {
			System.out.println("Wizard win");
			return false;
		}
	}
}

class Wizard {
	private int HP;
	private int MP;
  
    // Declaring method here
	public Wizard(int HP, int MP) {
		this.HP = HP;
		this.MP = MP;
	}
	public int getHP() {
		return this.HP;
	}
	
	public int getMP() {
		return this.MP;
	}
	
	public void setHP(int n) {
		this.HP = n;
	}
	
	public void setMP(int n) {
		this.MP = n;
	}
	
	public void FireBall(Warrior warrior) {
		int warrior_hp = warrior.getHP();
		warrior.setHP(warrior_hp-this.MP);
	}
	
	public boolean CheckAlive() {
		if (this.HP > 0) {
			return true;
		}
		else {
			System.out.println("Warrior win");
			return false;
		}
	}
}


public class lab4_2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(700,100);
        Wizard wizard = new Wizard(400,500);
        int dice = 0;
        while(warrior.CheckAlive() && wizard.CheckAlive()) {
            if(dice % 2 == 0) {
                warrior.Slash(wizard);
            }
            else {
                wizard.FireBall(warrior);
            }
            dice += 1;
        }
    }
} 