//graph is unweighted, undirected
public class Graph{
		String[] vertices;
		boolean[][] edges;

		public Graph(){
				vertices = new String[0];
				edges = new boolean[0][0];
		}
		public void insertVertex(String vertexName){
				if(getIndex(vertexName) != -1){
						return;
				}
				String[] temp = new String[vertices.length+1];
				System.arraycopy(vertices,0,temp,0,vertices.length);
				temp[temp.length-1] = vertexName;
				vertices = temp;

				boolean[][] newEdges = new boolean[edges.length+1][edges.length+1];
				for(int x = 0; x < edges.length; x++){
						for(int y = 0; y < edges.length; y++){
								newEdges[x][y] = edges[x][y];
						}
				}
				edges = newEdges;


		}
		public void insertEdge(String vertexA, String vertexB){
				int indexA = getIndex(vertexA);
				int indexB = getIndex(vertexB);
				if((indexA == -1 || indexB == -1) == false){
						edges[indexA][indexB] = true;
						edges[indexB][indexA] = true;
				}
		}
		public void removeVertex(String vertexName){
				String[] temp = new String[vertices.length-1];
				int index = getIndex(vertexName);
				if(index == -1){
						return;
				}
				System.arraycopy(vertices, 0 ,temp, 0, index);
				System.arraycopy(vertices, index+1, temp, index,vertices.length-index-1);
				vertices = temp;

				System.out.println("length!: "+vertices.length);

				boolean[][] newEdges = new boolean[edges.length-1][edges.length-1];
				for(int x = 0; x < index; x++){
						for(int y = 0; y < index; y++){
								newEdges[x][y] = edges[x][y];
						}
				}

				for(int x = index; x < newEdges.length; x++){
						for(int y = index; y < newEdges.length; y++){
								newEdges[x][y] = edges[x+1][y+1];
						}
				}

				edges = newEdges;

				
		}	
		public void removeEdge(String vertexA, String vertexB){
				int indexA = getIndex(vertexA);
				int indexB = getIndex(vertexB);
				if((indexA == -1 || indexB == -1) == false){
						edges[indexA][indexB] = false;
						edges[indexB][indexA] = false;
				}
		}



		//doubles as exists()
		private int getIndex(String vertexName){
				for(int x =0; x < vertices.length; x++){
						if(vertices[x].equals(vertexName)){
								return x;
						}
				}
				return -1;
		}
}