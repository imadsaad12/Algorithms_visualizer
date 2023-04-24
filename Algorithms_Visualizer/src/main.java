import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose an algorithm to visualize:");
            System.out.println("1. Sort using insertion sort");
            System.out.println("2. Sort using selection sort");
            System.out.println("3. Traverse the graph using BFS");
            System.out.println("4. Traverse the graph using DFS");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1: 
                	System.out.println("Enter array size:");
                    int size = scanner.nextInt();
                    
                    int[] arr = new int[size];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = scanner.nextInt();
                    }
                	SortingAlgorithms insertionSort = new SortingAlgorithms(arr);

                    insertionSort.insertionSort();
                    break;
                case 2:
                	System.out.println("Enter array size:");
                     size = scanner.nextInt();
                    
                     arr = new int[size];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < size; i++) {
                        arr[i] = scanner.nextInt();
                    }
                    SortingAlgorithms selectionSort = new SortingAlgorithms(arr);
                    selectionSort.selectionSort();
                    break;
                case 3:
                    System.out.print("Enter the number of vertices in the tree: ");
                    int V = scanner.nextInt();
                    TraversingAlgorithms tree = new TraversingAlgorithms(V);
                    System.out.println("Enter the edges in the format 'u v', where u and v are vertices:");
                    for (int i = 0; i < V - 1; i++) {
                        int u = scanner.nextInt();
                        int v = scanner.nextInt();
                        tree.addEdge(u, v);
                    }
                    System.out.print("Enter the starting vertex for BFS traversal: ");
                    int s = scanner.nextInt();
                    tree.bfs(s);
                    break;
                case 4:
                    System.out.print("Enter the number of vertices in the tree: ");
                     V = scanner.nextInt();
                     tree = new TraversingAlgorithms(V);
                    System.out.println("Enter the edges in the format 'u v', where u and v are vertices:");
                    for (int i = 0; i < V - 1; i++) {
                        int u = scanner.nextInt();
                        int v = scanner.nextInt();
                        tree.addEdge(u, v);
                    }
                    System.out.print("Enter the starting vertex for DFS traversal: ");
                     s = scanner.nextInt();
                    tree.dfs();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
                    break;
            }
        } while (choice != 0);
    }
}
