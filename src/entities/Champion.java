package entities;

public class Champion {
	
	private String name;
	private Integer life;
	private Integer atk;
	private Integer def;
	
	public Champion (String name, Integer life, Integer atk, Integer def) {
		this.name = name;
		this.life = life;
		this.atk = atk;
		this.def = def;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLife() {
		return life;
	}

	public void setLife(Integer life) {
		this.life = life;
	}

	public Integer getAtk() {
		return atk;
	}

	public void setAtk(Integer atk) {
		this.atk = atk;
	}

	public Integer getDef() {
		return def;
	}

	public void setDef(Integer def) {
		this.def = def;
	}
	
	public void takeDamage(Champion other) {
		if ( other.atk <= def) {
			life -= 1;
		}
		else{
			life -= (other.atk - def);
		}
	}
	
	public String Status() {
		if(life < 0) {
			life = 0 ;
			
			return name 
					+ ": " 
					+ life
					+ " de vida (Morreu) \n";
			}
		else {
			return name 
					+ ": " 
					+ life
					+ " de vida\n";
		}
		
	}

}
