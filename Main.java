public class Main{
		public static void main(String[] args){
				Graph graph = new Graph();
				graph.insertVertex("banana");
				graph.insertVertex("orange");
				graph.insertVertex("apple");
				graph.insertVertex("peach");
				graph.insertEdge("banana", "orange");
				graph.insertEdge("orange", "apple");
				graph.insertEdge("apple", "peach");
				for(int x = 0; x < graph.vertices.length; x++){
						System.out.println(graph.vertices[x]);
				}
				System.out.println(graph.edges[0][1]);
				System.out.println(graph.edges[1][2]);
				System.out.println(graph.edges[2][3]);

				graph.removeEdge("orange", "apple");

				System.out.println(graph.edges[0][1]);
				System.out.println(graph.edges[1][2]);
				System.out.println(graph.edges[2][3]);
		}
}