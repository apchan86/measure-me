package com.measureme.blockdatabase;

import java.util.List;

// this class contains the information you need to figure out where each block is on the suite.
// given the index of a block, you can figure out which block was to the right/left/top/below it.
// return -1 if there are no blocks below/above it.

// We are going to deserialize this class from some constant strings
// for example, we can have a format like:
// 0,1,2,-1,12 
// which will mean for block 0, left = 1, right = 2, top = nothing, bottom = 12

// same thing with the block lists
// height: 1,12,22,32,42
// waist: 22,23,24,25,26,27
public class BlockDatabase {

	public int getRightOf(int index) {
		return -1;
	}
	
	public int getLeftOf(int index) {
		return -1;
	}
	
	public int getAbove(int index) {
		return -1;
	}
	
	public int getBelow(int index) {
		return -1;
	}

	// this returns the list of blocks that will make up the 'height'
	public BlockList getHeightBlockList() {
		return null;
	}
	
	// this returns the list of blocks that make up each circumference
	// for example, one circumference would be 'waist' or 'upper left arm'
	public List<BlockList> getCircumferenceBlockLists() {
		return null;
	}
	
	public static class BlockList {
		private double mConstantAmount; // if we have a panel that is of constant size, we can include that here
		private String mDescription;
		private List<Integer> mIndices;
		
		public BlockList(String blockList) {
			// parse the string and set in mDescription/mIndices
		}
	}

}