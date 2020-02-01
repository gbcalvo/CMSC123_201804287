import java.util.*;
import java.lang.*;
import java.io.*;

class Stack {
	private final int SIZE = 20;
	private int[] stacked;
	private int topped;

	public Stack() {
		stacked = new int[SIZE]; 
		topped = -1;
	}
	public void push(int j)
	{
		stacked[++topped] = j;
	}
	public int pop() {
		return stacked[topped--];
	}
	public int peek() {
		return stacked[topped];
	}
	public boolean isEmpty() {
		return (topped == -1);
	}
}

class Graph {
	private final int MAX_VERTS = 20;
	private Vertex vertexList[]; 
	public int adjacentMatrix[][]; 
	public int vertices; 
	private Stack thisStack;

	public Graph()      
	{
		vertexList = new Vertex[MAX_VERTS];
		adjacentMatrix = new int[MAX_VERTS][MAX_VERTS];
		vertices = 0;
		for (int y = 0; y < MAX_VERTS; y++) 
			for (int x = 0; x < MAX_VERTS; x++)
				adjacentMatrix[x][y] = 0;
		thisStack = new Stack();
	}
	public void addVertex(char lab) {
		vertexList[vertices++] = new Vertex(lab);
	}
	public void addEdge(int start, int end) {
		adjacentMatrix[start][end] = 1;
		adjacentMatrix[end][start] = 1;
	}
	public void displayVertex(int v) {
		System.out.print(vertexList[v].label);
	}
}

class Vertex {
	public char label; 
	public boolean visited;
	
	public Vertex(char lab)
	{
		label = lab;
		visited = false;
	}
}

class printGraph {
	
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertex('A'); 
		graph.addVertex('B'); 
		graph.addVertex('C'); 
		graph.addVertex('D');
		graph.addVertex('E'); 
		graph.addEdge(0, 1); // AB
		graph.addEdge(1, 2); // BC
		graph.addEdge(0, 3); // AD
		graph.addEdge(3, 4); // DE

		System.out.print( "Vertices list: ");
		for (int i = 0; i < graph.vertices; i++)
			graph.displayVertex(i);
		System.out.println();
		System.out.println();

		System.out.println( "Adjacent Matrix: ");
		for (int j = 0; j < graph.vertices; j++) {
			for (int k = 0; k < graph.vertices; k++)
				System.out.print(graph.adjacentMatrix[j][k] + " ");
			System.out.println();
		}
	}
}