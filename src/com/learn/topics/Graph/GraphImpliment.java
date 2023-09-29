package com.learn.topics.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphImpliment {
    public static void main(String[] args) {
        char[][] matrix = {
                {'S', '0', '0', '0','0'},
                {'0', '0', '0', '0','0'},
                {'0', '0', '0', 'D','0'},
                {'0', '0', '0', '0','0'}

        };

        System.out.println(pathExist(matrix));

    }
    public static int pathExist(char[][] matrix){
        Node node = new Node(0,0,0);

        //Finding first node
        for(int i=0; i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]=='S') {
                    node.row = i;
                    node.column = j;
                    System.out.println("i" + i + ", j" + j);
                    break;
                }
            }
        }

        //Apply BFS for finding shortest path
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(node.row,node.column,0));

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        visited[node.row][node.column]= true;

        while(!queue.isEmpty()){
            Node q = queue.remove();

            //Destination found
            if(matrix[q.row][q.column]=='D')
                return q.distanceFromSource;

            //Moving up and left
            if(isValid(q.row+2, q.column-1, matrix, visited)){
                visited[q.row+2][q.column -1] = true;
                queue.add(new Node(q.row+2,q.column-1, q.distanceFromSource+1));
            }
            //Moving up and right
            if(isValid(q.row+2,q.column+1,matrix, visited)){
                visited[q.row+2][q.column+1] = true;
                queue.add(new Node(q.row+2,q.column+1, q.distanceFromSource+1));
            }
            //Moving Down and left
            if(isValid(q.row-2 , q.column-1, matrix, visited)){
                visited[q.row-2][q.column-1] = true;
                queue.add(new Node(q.row-2, q.column-1, q.distanceFromSource+1));

            }
            //Moving down and right
            if(isValid(q.row-2 , q.column+1, matrix, visited)){
                visited[q.row-2][q.column+1] = true;
                queue.add(new Node(q.row-2,q.column+1, q.distanceFromSource+1));
            }

        }
        return -1;
    }

    public static boolean isValid(int x, int y, char[][] grid, boolean[][] visited){
        if(x >= 0 && y >= 0 && x<grid.length && y <grid[0].length && visited[x][y] == false){
            return true;
        }
        return false;
    }


}
class Node{
    int row;
    int column;
    int distanceFromSource;
    Node(int row, int column, int dis){
        this.row = row;
        this.column = column;
        this.distanceFromSource=dis;
    }
}
