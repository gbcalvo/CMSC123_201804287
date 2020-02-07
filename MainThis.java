public class MainThis{
		
	public static void main(String[] args){
		
		GraphThis graph = new GraphThis();
		
		graph.insertVertex("sloth");
		graph.insertVertex("badger");
		graph.insertVertex("otter");
		graph.insertVertex("koala");
		graph.insertEdge("sloth", "badger");
		graph.insertEdge("badger", "otter");
		graph.insertEdge("otter", "koala");
		
		/*for(int x = 0; x < graph.vertices.length; x++){
			
			System.out.println(graph.vertices[x]);
			
			}*/
			
			//System.out.println(graph.findAdjacent("otter"));
			
			graph.bfs();
		}
}