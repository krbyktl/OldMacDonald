class Chick implements Animal 
{     
    private String myType;
    private String mySound;
    private String myOtherSound;
    public Chick(String type, String othersound, String sound)
    {
    	myType = type;
    	mySound = sound;
      myOtherSound = othersound;
    }
    public Chick()
    {
    	myType = "chick";
    	mySound = "cluck";
      myOtherSound = "cheep";
    }
    public String getSound()
    {
    	if((Math.random()*1)<.5)
    {
      return mySound;
    }
    else
    {
      return myOtherSound;
    }
    }
    public String getType()
    {
    	return myType;
    }
}