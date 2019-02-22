/**
 * Created by Wen Jiang on 7/23/2018.
 */

import java.util.*;
import java.util.LinkedList;

/*
given a text file containing pairs of city name

Philadelphia, Pittsburgh
Boston, New York

> java Connected cities.txt Boston Hartford
yes
> java Connected cities.txt Boston Tampa
no
 */

public class Connected {

    private int V;
    private LinkedList<Integer> adj[];

    Connected(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v,int w)  {   adj[v].add(w);   }


    Boolean connectivitycheck(int s, int d)
    {
        LinkedList<Integer>temp;

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s]=true;
        queue.add(s);

        Iterator<Integer> i;
        while (queue.size()!=0)
        {
            s = queue.poll();

            int n;
            i = adj[s].listIterator();

            while (i.hasNext())
            {
                n = i.next();

                if (n==d)
                    return true;

                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        loadcmd(args);
    }

    public static void loadcmd(String[] args) {

        final String cityfile = args[0];
        final String city1 = args[1].toLowerCase();
        final String city2 = args[2].toLowerCase();

        System.out.print(city1);
        System.out.print(city2);

        int uniquecity = 0;

        int city1code = 1;

        int city2code = 2;

        int city3code = 3;

        /*
        TO DO:
        file = load file the whole file
        uniquecity = number of unique city
        add the edges
         */

        Connected c = new Connected(uniquecity);

        c.addEdge(city1code, city2code);
        c.addEdge(city2code, city3code);
        c.addEdge(city1code, city3code);

        if (c.connectivitycheck(city1code, city2code))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}