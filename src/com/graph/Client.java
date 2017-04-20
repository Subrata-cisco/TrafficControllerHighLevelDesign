package com.graph;

import java.util.ArrayList;

public class Client {
	
	public static void main(String[] args) {
		Client client = new Client();
		ArrayList<GraphNode> nodes = client.createAnUnidirectionalGraph();
		
		ShortestPathBuilder b = new ShortestPathBuilder();
		
		//build the all the possible path from first to last node
		for(GraphNode n : nodes){
			b.buildAllPath(n);
		}
		
		//b.printAllPaths();
		
		ShortestPath path = b.shortestPath(new GraphNode(1),new GraphNode(8));
		System.out.println("S Path ::"+path.getPathCost());
	}
	
	private ArrayList<GraphNode> createAnUnidirectionalGraph(){
		//Create Nodes
		GraphNode one = new GraphNode(1);
		
		GraphNode two = new GraphNode(2);
		GraphNode three = new GraphNode(3);
		GraphNode four = new GraphNode(4);
		GraphNode five = new GraphNode(5);
		GraphNode six = new GraphNode(6);
		GraphNode seven = new GraphNode(7);
		GraphNode eight = new GraphNode(8);
		GraphNode nine = new GraphNode(9);
		GraphNode ten = new GraphNode(10);
		
		GraphNode eleven = new GraphNode(11);
		
		//add Node
		ArrayList<GraphNode> graph = new ArrayList<>();
		
		graph.add(one);
		graph.add(two);
		graph.add(three);
		graph.add(four);
		graph.add(five);
		graph.add(six);
		graph.add(seven);
		graph.add(eight);
		graph.add(nine);
		graph.add(ten);
		graph.add(eleven);
		
		// link nodes
		one.goesToNode(two);
		
		two.goesToNode(three);
		two.goesToNode(six);
		two.goesToNode(seven);
		
		four.goesToNode(eight);
		
		five.goesToNode(six);
		
		six.goesToNode(nine);
		six.goesToNode(ten);
		
		seven.goesToNode(eight);
		seven.goesToNode(eleven);
		
		ten.goesToNode(eleven);
		
		return graph;
	}

}
