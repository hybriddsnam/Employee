package webapp.escape;

/*
30 black	
31 red
32 green
33 yellow
34 blue
35 magenta
36 cyan
37 white
*/
public enum Forground {
	BLACK(30), 
	RED (31),
	GREEN(32),
	YELLOW(33),
	BLUE(34),
	MAGENTA(35),
	CYAN(36), 
	WHITE(37);
	
	final int value;
	
	private Forground(int value) {
		this.value = value;
	}


}
