package com.algo;

public class Edge {
	private int fromNodeIndex;
	private int toNodeIndex;
	private int length;

	/**
	 * Class constructor specifying an edge to be created with FROM and TO
	 * indices with a weight.
	 * 
	 * @param fromNodeIndex
	 *            Index of FROM Node
	 * @param toNodeIndex
	 *            Index of TO Node
	 * @param length
	 *            Weight of the Edge
	 */
	public Edge(int fromNodeIndex, int toNodeIndex, int length) {
		this.fromNodeIndex = fromNodeIndex;
		this.toNodeIndex = toNodeIndex;
		this.length = length;
	}

	/**
	 * Get the Index of the FROM Node
	 * 
	 * @return Index value of FROM Node
	 */
	public int getFromNodeIndex() {
		return fromNodeIndex;
	}

	/**
	 * Get the Index of the TO Node
	 * 
	 * @return Index value of TO Node
	 */
	public int getToNodeIndex() {
		return toNodeIndex;
	}

	/**
	 * Get the Length of current Edge
	 * 
	 * @return weight of current Edge
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Determines the nearby Node of the current Node, based on the edge
	 * connecting the two nodes
	 * 
	 * @param nodeIndex
	 *            Index of current Node
	 * 
	 * @return Index of nearby Node
	 */
	public int getNeighbourIndex(int nodeIndex) {
		if (this.fromNodeIndex == nodeIndex) {
			return this.toNodeIndex;
		} else {
			return this.fromNodeIndex;
		}
	}
}