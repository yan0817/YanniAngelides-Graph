import java.util.ArrayList
/**
This is the class for a Vertice. A vertice is just a point in space that contains a value. 
Two vertices are connected by an edge which contains information about how the two vertices compare to each other
@author Yanni Angelides
@version 02/10/16
*/

public class Vertice<E>
{
	public ArrayList<Vertice> connections;
	public ArrayList<Integer> weights;
	public E value;
	public int x;
	public int y;
	public int visited;
	
	public Vertice()
	{
		connections = new ArrayList<Vertice<E>>(10);
		weights = new ArrayList<Integer>(10);
		value = null;
		x = 0;
		y = 0;
		visited = 0;
	}
	
	public Vertice(E item)
	{
		connections = new ArrayList<Vertice<E>>(10);
		weights = new ArrayList<Integer>(10);
		value = item;
		x = 0;
		y = 0;
		visited = 0;
	}
	
	public Vertice(E item, int xpos, int ypos)
	{
		connections = new ArrayList<Vertice<E>>(10);
		weights = new ArrayList<Integer>(10);
		value = item;
		x = xpos;
		y = ypos;
		visited = 0;
	}
	
	public ArrayList<Vertice<E>> getConnections()
	{
		return connections;
	}
	
	public ArrayList<Vertice<E>> getWeights()
	{
		return weights;
	}
	
	public E getValue()
	{
		return value;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void setValue(E item)
	{
		value = item;
	}
	
	public void oneVisit()
	{
		visited++;
	}
	
	public void makeConnection(Vertice pair)
	{
		connections.add(pair);
		int weight = (int)(Math.sqrt((Math.pow((x - pair.getX()), 2)) + (Math.pow((y - pair.getY()), 2))));
		weights.add(weight); 
	}
	
	public Vertice traverse(int vert)
	{
		connections.get(vert).oneVisit();
		return connections.get(vert);
	}
}