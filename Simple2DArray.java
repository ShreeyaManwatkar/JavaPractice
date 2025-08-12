package com.shree;

public class Simple2DArray {
	public static void main(String[] args) {
		String[][] Box = {
				{"1","2","3"},
				{"4","5","6"},
				{"7","8","9"}
};
		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(Box[i][j]);
			}
			System.out.println();
		}
		//System.out.println(Box[1][2]);
	}
}