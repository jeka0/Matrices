package com.company;

import java.util.ArrayList;

public class Main {

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
    }
}
