package monster.model;

public class MarshmallowMonster
{
	//Decleration section for the data members
	private String name; 
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//Unless we specify values all data members
		//are a zero, false, or null
	}
	
	//This sets all our data of the monster like what it has.
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	//this specifies that one word is assigned another word.
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleAmount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
		
	}
	
	public String toString()
	{
		String description = "Hi, I am a spoooooky monster! My name is " + name + ", and I have" + eyeCount;
		description += " eyes an I have " + armCount + " arms, and I have " + tentacleAmount + " tentacles XD";
		description += " and my bloop excistence is " + hasBloop;
		
		return description;
		
	}
}
