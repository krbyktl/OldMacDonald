class Chick implements Animal 
{     
    Private String myType;
    Private String mySound;
    public Chick(String type, String sound)
    {
    	myType = type;
    	mySound = sound;
    }
    public Chick()
    {
    	myType = "unknown";
    	mySound = "unknown";
    }
    Public String getSound()
    {
    	return mySound;
    }
    Public String getType()
    {
    	return myType;
    }
}
