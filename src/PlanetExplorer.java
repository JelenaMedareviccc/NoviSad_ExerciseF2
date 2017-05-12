import java.awt.List;

// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	//List<> listObstacles=new List<>();
	public String direction="N";
	public int pos_x=0;
	public int pos_y=0;
	public int x;
	public int y;
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.x=x;
		this.y=y;
		//listaObstacles.add((x,y));
		//ostacles.add((x,y));
		
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		if(this.pos_x==x-1){
		
			
		}
		if(direction=="N" || direction=="S"){
		if(command=="f")
		{
			this.pos_y++;
			
		}
		if(command=="b")
		{
			this.pos_y--;
		}
		}
		if(direction=="W" || direction=="E")
		{
			if(command=="f")
			{
				this.pos_x++;
				
			}
			if(command=="b")
			{
				this.pos_x--;
			}
			
		}
		if(command=="l")
		{
			this.direction="W";
		}
		if(command=="r")
		{
			this.direction="E";
			
		}
		
		
		
		
		
		return "("+pos_x+","+pos_y+","+direction+")";
	}
}
