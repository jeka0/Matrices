package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DB {
    public int[][] mas;
    public void ReadFile(String file)
    {
        try(FileReader fr = new FileReader(file))
        {
            int index=0;
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while((line = reader.readLine())!=null)
            {
                String[] lines = line.split(" ");
                if(index==0)mas = new int[lines.length][lines.length];
                for(int i=0;i<lines.length;i++)mas[index][i] = Integer.parseInt(lines[i]);
                index++;
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
