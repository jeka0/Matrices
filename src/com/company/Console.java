package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);
    public static void PrintMas(String mess,int[][] mas)
    {
        System.out.println(mess);
        for(int i=0;i<mas.length;i++)
        {
            for(int j=0;j<mas[0].length;j++)System.out.print("\t"+mas[i][j]);
            System.out.println();
        }
    }
    public static void PrintList(String mess, ArrayList<Integer>[] list)
    {
        System.out.println(mess);
        for(int i=0;i<list.length;i++)
        {
            String str = i+": ";
            int indx =0;
            for(Integer num:list[i]) {
                str += num;
                if(indx<list[i].size()-1)str +=", ";
                indx++;
            }
            System.out.println(str);
        }
    }
    public static void PrintMessage(String str) {System.out.print(str);}
    public static int ReadInt(String str, int min){return ReadInt(str,min,-1);}
    public static int ReadInt(String str, int min, int max)
    {
        boolean flag;
        int num=0;
        PrintMessage(str);
        do {
            flag = false;
            try {
                num = Integer.parseInt(scanner.nextLine());
                if(num<min||(max!=-1 && num>max))throw new Exception();
            }catch (Exception e){ PrintMessage("Введено неверное значение!!!!\nПовторите ввод:");flag =true;}
        }while(flag);
        return num;
    }

}
