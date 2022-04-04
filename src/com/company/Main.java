package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static GraphTraversals traversals = new GraphTraversals();
    public static void main(String[] args) {
	// write your code here
        Convert convert = new Convert();
        DB db= new DB();
        db.ReadFile("src\\Mas.txt");
        Console.PrintMas("Матрица смежности:",db.mas);
        int[][] newMas = convert.AdjacencyInIncidence(db.mas);
        Console.PrintMas("Матрица инцидентности:",newMas);
        ArrayList<Integer>[] list = convert.listOfIncidentEdges(newMas);
        Console.PrintList("Список инцидентных ребер:", list);
        Console.PrintList("Список смежных вершин:", convert.listOfAdjacentVertices(list));
        int num = Console.ReadInt("Выберите номер вершины для обхода (от 0 до "+(db.mas.length-1) +"):" ,0,db.mas.length-1);
        Console.OutputSequence("Последовательность обхода графа в глубину:", DepthWalk(db.mas,num));
        Console.OutputSequence("Последовательность обхода графа в ширину:", BypassInWidth(db.mas,num));
    }
    public static LinkedList<Integer> DepthWalk(int[][] mas,int num)
    {
        LinkedList<Integer> list = new LinkedList<>();
        traversals.list = list;
        traversals.GraphDepthTraversal(mas,num);
        for(int i=0;i<mas.length;i++)if(!list.contains(i))traversals.GraphDepthTraversal(mas,i);
        traversals.list = null;
        return list;
    }
    public static LinkedList<Integer> BypassInWidth(int[][] mas,int num)
    {
        LinkedList<Integer> list = new LinkedList<>();
        traversals.list = list;
        traversals.GraphBreadthTraversal(mas,num);
        for(int i=0;i<mas.length;i++)if(!list.contains(i))traversals.GraphBreadthTraversal(mas,i);
        traversals.list = null;
        return list;
    }
}
