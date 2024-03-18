package simpleGraph;

import java.util.Scanner;

public class MainController {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	//System.out.println("Enter Size");
	Graph graph=new Graph(11);
	//graph.accept();
	graph.addEdge(0, 1);
	  graph.addEdge(0, 2);
	  graph.addEdge(0, 3);
	  graph.addEdge(1, 3);
	  graph.addEdge(1, 6);
	  graph.addEdge(1, 3);
	  graph.addEdge(1, 4);
	  graph.addEdge(3, 5);
	  graph.addEdge(3, 2);
	  graph.addEdge(6, 4);
	  graph.addEdge(6, 5);
	  graph.addEdge(2, 5);
	  graph.display();
	  graph.outDegree();
	  graph.inDegree();
	
}
}
