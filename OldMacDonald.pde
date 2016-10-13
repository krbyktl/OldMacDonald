public void setup()
{
	Cow c = new Cow("cow", "moo");
	System.out.println(c.getType() + " goes " + c.getSound());
	Chick r = new Chick("chick", "cluck");
	System.out.println(r.getType() + " goes " + r.getSound());
	Pig p = new Pig("pig", "oink");
	System.out.println(p.getType() + " goes " + p.getSound());
}

