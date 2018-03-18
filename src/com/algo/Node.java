package com.algo;

import java.util.ArrayList;

public class Node {

	private int distanceFromSource = Integer.MAX_VALUE;
	private boolean visited;
	private ArrayList<Edge> edges = new ArrayList<Edge>();

	/**
	 * Get Distance from Source Node to current Node
	 * 
	 * @return Integer value of distance from Source Node
	 */
	public int getDistanceFromSource() {
		return distanceFromSource;
	}

	/**
	 * Set Distance from Source Node to current Node
	 *
	 * @param distanceFromSource
	 *            Integer value of distance from Source Node
	 */
	public void setDistanceFromSource(int distanceFromSource) {
		this.distanceFromSource = distanceFromSource;
	}

	/**
	 * Checks if the Node is visited previously
	 * 
	 * @return
	 *         <p>
	 *         Flag = true (visited)
	 *         </p>
	 *         <p>
	 *         Flag = false (not visited)
	 *         </p>
	 * 
	 */
	public boolean isVisited() {
		return visited;
	}

	/**
	 * Set visited flag to current Node
	 * 
	 * @param visited
	 *            Flag to be set to the current Node
	 * 
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	/**
	 * Get all the edges of the current Node
	 * 
	 * @return List of Edges to the current Node
	 */
	public ArrayList<Edge> getEdges() {
		return edges;
	}

	/**
	 * Set all the edges to the current Node
	 * 
	 * @param edges
	 *            List of all edges to current Node
	 */
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}

}