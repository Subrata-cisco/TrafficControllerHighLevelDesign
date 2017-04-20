package com.graph;

public class ShortestPath {
	private GraphNode start;
	private GraphNode end;
	private int pathCost;
	private Path path;
	
	public ShortestPath(GraphNode s,GraphNode e){
		start = s;
		end = e;
	}
	
	public GraphNode getStart() {
		return start;
	}
	
	public GraphNode getEnd() {
		return end;
	}
	
	public int getPathCost() {
		return pathCost;
	}
	
	public void setPathCost(int pathCost) {
		this.pathCost = pathCost;
	}
	
	public Path getPath() {
		return path;
	}
	
	public void setPath(Path path) {
		this.path = path;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
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
		ShortestPath other = (ShortestPath) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}

}
