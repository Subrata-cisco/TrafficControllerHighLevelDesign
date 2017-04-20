package com.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShortestPathBuilder {

	private Set<Path> allPaths = new HashSet<>();

	// TODO - is there any other better way ? searching and finding value is
	// easy as of now...
	private Map<ShortestPath, ShortestPath> shortestPath = new HashMap<>();

	public ShortestPath shortestPath(GraphNode n1, GraphNode n2) {
		ShortestPath sPath = new ShortestPath(n1, n2);
		if (shortestPath.containsKey(sPath)) {
			sPath = shortestPath.get(sPath);
		} else {
			sPath = findShortestPath(sPath);
		}
		return sPath;
	}

	private ShortestPath findShortestPath(ShortestPath sPath) {

		ShortestPath calculatedSPath = sPath;
		Iterator<Path> pi = allPaths.iterator();

		while (pi.hasNext()) {
			Path p = pi.next();
			if (p.getStartingNode().getNodeName() == sPath.getStart().getNodeName()) {
				
				int index = p.getIndexOfPathNode(sPath.getEnd());
				// if path is 1-2-6-9 and checking for s=1 ,e =9 , the cost is 3
				if (index != -1) {
					printPath(p);
					ShortestPath newSPath = new ShortestPath(sPath.getStart(), sPath.getEnd());
					newSPath.setPathCost(index+1);

					Path cPath = p.getClonePath();
					cPath.keepFirstToIndexedPath(index);
					newSPath.setPath(cPath);
					
					if (shortestPath.containsKey(newSPath)
							&& shortestPath.get(newSPath).getPathCost() > newSPath.getPathCost()) {		
						// update the shortest path
						shortestPath.put(newSPath, newSPath);
						calculatedSPath = newSPath;
					}else if(!shortestPath.containsKey(newSPath)){
						//add the new entry
						shortestPath.put(newSPath, newSPath);
						calculatedSPath = newSPath;
					}
				}
			}
		}
		return calculatedSPath;
	}

	public void buildAllPath(GraphNode start) {
		List<GraphNode> parents = start.getParentNodes();
		// optimization: 1-2-6-9 is the path saved and want to find path for 2 ,
		// then it is 2-6-9, no need to calculate again.
		boolean found = parents.size() > 0 && pathExistsWithAnyParentNodeSaveIt(parents, start);
		if (!found) {
			// start creating path from start to any other Node using DFS.
			Path path = new Path(start);
			List<GraphNode> childs = start.getChildNodes();
			if (childs.size() > 0) {
				buildPath(path, start);
			}
		}
	}

	/**
	 * TODO -use caching to finding all path starting with some node.
	 * 
	 * @param parents
	 * @return
	 */
	private boolean pathExistsWithAnyParentNodeSaveIt(List<GraphNode> parents, GraphNode goesThrough) {
		boolean pathExists = false;
		for (GraphNode p : parents) {
			boolean found = savePathIfFound(p, goesThrough);
			if (found) {
				pathExists = true;
			}
		}
		return pathExists;
	}

	private boolean savePathIfFound(GraphNode n, GraphNode goesThrough) {
		boolean found = false;

		Iterator<Path> pi = allPaths.iterator();
		List<Path> newPathList = new ArrayList<>();

		while (pi.hasNext()) {
			Path p = pi.next();
			if (p.getStartingNode().getNodeName() == n.getNodeName()) {
				int index = p.getIndexOfPathNode(goesThrough);
				// means path 1-2-6 is selected for node 2, as path has node 2
				// and after 2 we have at least one more element.
				if (index != -1 && p.getPathNodes().size() - 1 > index) {
					// so remove 1 and save the path 2-6 to actual list.
					Path newPath = p.getClonePath();
					newPath.setStartingNode(goesThrough);
					newPath.removeFirst();
					newPathList.add(newPath);
					found = true;
				}

			}
		}

		if (newPathList.size() > 0) {
			// TODO - Dont add duplicate
			allPaths.addAll(newPathList);
		}

		return found;
	}

	private void buildPath(Path p, GraphNode start) {
		if (start.getChildNodes().size() == 0) {
			// save the path as this is last item in the path.
			Path savedPath = p.getClonePath();
			// printPath(savedPath);
			allPaths.add(savedPath);

			// remove the item as it is already saved in the above line from
			// actual path.
			p.removeLast();
		} else {
			for (GraphNode n : start.getChildNodes()) {
				p.addPath(n);
				buildPath(p, n);
			}
			// all child node of a node is processed so keep path first to just
			// previous to start node
			p.keepPreviousUpTo(start);
		}
	}

	public void printAllPaths() {
		System.out.println("************");
		for (Path p : allPaths) {
			printPath(p);
		}
	}

	void printPath(Path p) {
		StringBuilder sb = new StringBuilder();
		sb.append(p.getStartingNode().getNodeName()).append("-");
		for (GraphNode n : p.getPathNodes()) {
			sb.append(n.getNodeName()).append("-");
		}
		System.out.println(sb.toString());
	}

}
