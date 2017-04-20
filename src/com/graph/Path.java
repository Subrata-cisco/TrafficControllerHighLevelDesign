package com.graph;

import java.util.LinkedList;
import java.util.List;

public class Path {
	private GraphNode startingNode;
	private List<GraphNode> pathNodes = new LinkedList<>();

	public Path(GraphNode s) {
		this.startingNode = s;
	}

	public void addPath(GraphNode eachNode) {
		pathNodes.add(eachNode);
	}

	public GraphNode getStartingNode() {
		return startingNode;
	}

	public void setStartingNode(GraphNode n) {
		this.startingNode = n;
	}

	/**
	 * TODO - Only for printing , delete it.
	 * 
	 * @return
	 */
	public List<GraphNode> getPathNodes() {
		return pathNodes;
	}

	public Path getClonePath() {
		Path path = new Path(startingNode);
		List<GraphNode> nodes = new LinkedList<>();
		nodes.addAll(pathNodes);
		path.pathNodes = nodes;
		return path;
	}

	public void removeLast() {
		if (pathNodes.size() > 0) {
			pathNodes.remove(pathNodes.size() - 1);
		}
	}

	public void removeFirst() {
		if (pathNodes.size() > 0) {
			pathNodes.remove(0);
		}
	}

	public void keepPreviousUpTo(GraphNode start) {
		int index = getIndexOfPathNode(start);
		if (index != -1) {
			for (int i = index; i <= pathNodes.size() - 1; i++) {
				pathNodes.remove(i);
			}
		}
	}

	public void keepFirstToIndexedPath(int index) {
		if (index != -1 && (index < (pathNodes.size() - 1))) {
			for (int i = index + 1; i <= pathNodes.size() - 1; i++) {
				pathNodes.remove(i);
			}
		}
	}

	public int getIndexOfPathNode(GraphNode node) {
		int index = -1;
		for (GraphNode each : pathNodes) {
			index++;
			if (each.equals(node)) {
				break;
			}
		}

		if (index != -1 && (index == pathNodes.size() - 1) && !pathNodes.get(index).equals(node)) {
			index = -1;
		}

		return index;
	}

	private void printPathNodes(String p) {
		StringBuilder sb = new StringBuilder();
		sb.append(p).append("->");
		for (GraphNode n : pathNodes) {
			sb.append(n.getNodeName()).append("-");
		}
		System.out.println(sb.toString());
	}

}
