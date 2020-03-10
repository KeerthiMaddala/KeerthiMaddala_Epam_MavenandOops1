package com.epam.oops;
import java.util.ArrayList;
public class Gift {
	public static ArrayList<Integer> wgt=new ArrayList<Integer>();
	public int getWeight(){
		int totalWeight=0;
		for(int i=0;i<wgt.size();i++){
			totalWeight+=wgt.get(i);
		}
		return totalWeight;
	}

}
