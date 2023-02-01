package com.alok;
import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        // adj matrix representation
        int n = 3, m = 3;
        int[][] adjMat = new int[n+1][m+1];

        // 1----2
        adjMat[1][2] = 1;
        adjMat[2][1] = 1;

        // 2----3
        adjMat[2][3] = 1;
        adjMat[3][2] = 1;

        // 1----3
        adjMat[1][3] = 1;
        adjMat[3][1] = 1;

        // adj list representation
        ArrayList<ArrayList<Integer> > adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<Integer>());
        }

        // 1----2
        adjList.get(1).add(2);
        adjList.get(2).add(1);

        // 2----3
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        // 1----3
        adjList.get(1).add(3);
        adjList.get(3).add(1);

        for(int i = 1; i <= n; i++) {
            System.out.print(i + "-> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
