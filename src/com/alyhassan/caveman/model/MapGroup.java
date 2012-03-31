package com.alyhassan.caveman.model;

public class MapGroup {
	
	private int numMaps, currentMap;
	
	/**
	 * Creates a map group with the number of given maps.
	 * Note: The first map (0) is set as the current one.
	 * @param levels -  Number of maps in the group
	 */
	public MapGroup(int maps){
		this(maps,0);
	}
	
	/**
	 * Creates a map group with the number of given levels and
	 * with the current map set.
	 * @param levels - Number of maps in the group
	 * @param current -  Position of current map being played
	 */
	public MapGroup(int maps, int current){
		setMapNumber(maps);
		setCurrent(current);
	}

	/**
	 * Sets the number of maps in the group
	 * @param n - Number of maps
	 */
	public void setMapNumber(int n){
		if(n>0)
			numMaps = n;
		else
			numMaps = 0;
	}
	
	/**
	 * Sets the map currently being played
	 * @param current - Position of current map in group
	 */
	public void setCurrent(int current){
		if(current < numMaps)
			currentMap =  current;
		else
			currentMap = 0;
	}
	
	/**
	 *  Moves current position to the next map
	 */
	public boolean increaseCurrent(){
		if(isLast(currentMap))
			return false;
		currentMap++;
		return true;
		
	}
	
	/**
	 * Checks if the current map being played is the last one
	 * @param position - Current map being played
	 * @return true if it is the last map
	 */
	public boolean isLast(int position){
		return position==numMaps-1;
	}
	
	/**
	 * @return A String with all the information about the group
	 */
	public String toString(){
		return "Map Group: Currently on poistion "+currentMap+" of "+numMaps+" maps";				
	}
}
