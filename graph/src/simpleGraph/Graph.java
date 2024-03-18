package simpleGraph;

import java.util.Iterator;
import java.util.Scanner;

public class Graph {
	int vertex;
	int arr[][];
	Scanner scanner = new Scanner(System.in);

	public Graph(int size) {
		vertex = size;
		arr = new int[size][size];
	}
int no;
	public void accept() {
		for (int i = 0; i < vertex; i++) {
			for (int j = 0; j < vertex; j++) {
				System.out.println("Eneter Adjacent for " + i + " and " + j);
				no = scanner.nextInt();
			arr[i][j]=no;
			}
		}
	}
	public void addEdge(int i,int j) {
		arr[i][j]=1;
		arr[j][i]=1;
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void inDegree() {
        int count;
        for(int i=0;i<vertex;i++) {
        	count=0;
        	for(int j=0;j<vertex;j++) {
        		if (arr[j][i]==1) {
        			
            		count++;
				}
        	}
        	System.out.println("In-Degree "+i+":"+count);
        }
	}
	public void outDegree() {
        int count;
        for(int i=0;i<vertex;i++) {
        	count=0;
        	for(int j=0;j<vertex;j++) {
        		if (arr[i][j]==1) {
        			
            		count++;
				}
        	}
        	System.out.println("Out-Degree for "+i+":"+count);
        }
	}
}
