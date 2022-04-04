package com.company;

public class Edge {
    public int node1;
    public int node2;
    public Edge(int node1,int node2)
    {
        this.node1=node1;
        this.node2=node2;
    }
    public boolean IsIncidentNode(int node)
    {
        if(node == node1 || node == node2)return true;
        else return false;
    }

}
