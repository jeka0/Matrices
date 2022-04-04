package com.company;
import java.util.LinkedList;
public class GraphTraversals {
    public LinkedList<Integer> list = new LinkedList<>();
    public void GraphDepthTraversal(int[][] mas,int num)
    {
        for(int j=0;j<mas[num].length;j++)if(mas[num][j]!=0&&!list.contains(j)){list.add(j);GraphDepthTraversal(mas,j);}
    }
}
