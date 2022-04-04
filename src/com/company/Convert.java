package com.company;

import java.util.ArrayList;
public class Convert {
    public int[][] AdjacencyInIncidence(int[][] mas)
    {
        int count=0;
        ArrayList<Edge> edges = new ArrayList<>();
        for(int i=0;i< mas.length;i++)for(int j=0;j< mas.length;j++)
        {
            int num = mas[i][j];
            if(num!=0) {
                boolean flag=true;
                for(Edge edge : edges)if(edge.IsIncidentNode(i)&&edge.IsIncidentNode(j))flag=false;
                if(flag)edges.add(new Edge(i,j));
                if (i == j) num *= 2;
                count += num;
            }
        }
        count/=2;
        int[][] newMas = new int[count][mas.length];
        for(int i=0;i<edges.size();i++)
        {
            newMas[i][edges.get(i).node1]=1;
            newMas[i][edges.get(i).node2]=1;
        }
        return newMas;
    }
    public  ArrayList<Integer>[] listOfIncidentEdges(int[][] mas)
    {
        ArrayList<Integer>[] list = new ArrayList[mas[0].length];
        for(int j=0;j<mas[0].length;j++)
        {
            list[j] = new ArrayList<>();
            for(int i=0;i<mas.length;i++)if(mas[i][j]==1)list[j].add(i);
        }
        return list;
    }
    public  ArrayList<Integer>[] listOfAdjacentVertices(ArrayList<Integer>[] list)
    {
        ArrayList<Integer>[] newList = new ArrayList[list.length];
        for(int j=0;j<newList.length;j++)
        {
            newList[j] = new ArrayList<>();
            for(Integer num:list[j])
                for(int i =0;i< newList.length;i++)if(i!=j && list[i].contains(num))newList[j].add(i);
        }
        return newList;
    }
}
