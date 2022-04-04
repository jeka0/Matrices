package com.company;
import java.util.LinkedList;
import java.util.ArrayDeque;
public class GraphTraversals {
    public LinkedList<Integer> list;
    private ArrayDeque<Integer> deque = new ArrayDeque<>();
    public void GraphDepthTraversal(int[][] mas,int num)
    {
        list.add(num);
        for(int j=0;j<mas[num].length;j++)if(mas[num][j]!=0&&!list.contains(j))GraphDepthTraversal(mas,j);
    }
    public void GraphBreadthTraversal(int[][] mas,int num)
    {
        list.add(num);
        for(int j=0;j<mas[num].length;j++)if(mas[num][j]!=0&&!list.contains(j)&&!deque.contains(j))deque.addFirst(j);
        while(!deque.isEmpty())GraphBreadthTraversal(mas,deque.pollLast());
    }
}
