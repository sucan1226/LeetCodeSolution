package edu.hubu.leetCode;

/**
 * 输入一个二阶矩阵，1代表陆地,0代表水，求陆地周长
 * @author sucan
 *
 */

public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int perimeter = 0;
        for(int i = 0;i < grid.length;i++){
        	for(int j = 0;j < grid[i].length;j++){
        		if(grid[i][j] == 1){
        			perimeter += 4;
        			if(j > 0 && grid[i][j-1] == 1){
        				perimeter -= 2;
        			}
        			if(i > 0 && grid[i-1][j] == 1){
        				perimeter -= 2;
        			}
        		}
        	}
        }
        return perimeter;
    }
	
	public static void main(String[] args) {
		IslandPerimeter p = new IslandPerimeter();
		int [][] grid = {{0,1,0,0,1},
		        		 {1,1,1,0,1},
		                 {0,1,0,0,1},
		                 {1,1,0,0,1}};
		System.out.println(p.islandPerimeter(grid));
	}
}
