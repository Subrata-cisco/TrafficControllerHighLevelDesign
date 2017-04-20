package com.graph;

import java.util.LinkedList;
import java.util.List;


public class GraphNode{ 
	private int name ;
	private List<GraphNode> childs = new LinkedList<>();
	private List<GraphNode> parents = new LinkedList<>();
	
	GraphNode(int name){
		this.name = name; 
	}
	
	public int getNodeName(){
		return name;
	}
	
	public void goesToNode(GraphNode node){
		childs.add(node);
		node.addAnotherParent(this);
	}
	
	private void addAnotherParent(GraphNode graphNode) {
		parents.add(graphNode);
	}

	public List<GraphNode> getChildNodes(){
		return childs;
	}
	
	public List<GraphNode> getParentNodes(){
		return parents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + name;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GraphNode other = (GraphNode) obj;
		if (name != other.name)
			return false;
		return true;
	}
	
}
