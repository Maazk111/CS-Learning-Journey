
import java.util.*;
class Vertex
{
    char name;
    boolean isVisited;
    public Vertex(char name)
    {
        this.name=name;
        isVisited=false;

    }
}
class Graph
{
    Vertex[] Vlist;
    int[][] adj_Mat;
    int no;
    public Graph(int size)
    {
        Vlist=new Vertex[size];
        adj_Mat=new int[size][size];
        no=-1;
    }

    public void Add_Vertex(char name)
    {
        Vertex v=new Vertex(name);
        Vlist[++no]=v;
    }
    public void Add_Edge_UD_UW(char sv,char dv)
    {
        int si=0,di=0;
        for (int i=0;i<Vlist.length ;i++ )
        {
            if(Vlist[i].name==sv)
            {
                si=i;
            }
            if(Vlist[i].name==dv)
            {
                di=i;
            }

        }
        adj_Mat[si][di]=1;
        adj_Mat[di][si]=1;
    }
    public void Add_Edge_D_UW(char sv,char dv)
    {
        int si=0,di=0;
        for (int i=0;i<Vlist.length ;i++ )
        {
            if(Vlist[i].name==sv)
            {
                si=i;
            }
            if(Vlist[i].name==dv)
            {
                di=i;
            }

        }
        adj_Mat[si][di]=1;
        // adj_Mat[di][si]=1;
    }
    public void Add_Edge_UD_W(char sv,char dv,int weight)
    {
        int si=0,di=0;
        for (int i=0;i<Vlist.length ;i++ )
        {
            if(Vlist[i].name==sv)
            {
                si=i;
            }
            if(Vlist[i].name==dv)
            {
                di=i;
            }

        }
        adj_Mat[si][di]=weight;
        adj_Mat[di][si]=weight;
    }
    public void Add_Edge_D_W(char sv,char dv,int weight)
    {
        int si=0,di=0;
        for (int i=0;i<Vlist.length ;i++ )
        {
            if(Vlist[i].name==sv)
            {
                si=i;
            }
            if(Vlist[i].name==dv)
            {
                di=i;
            }

        }
        adj_Mat[si][di]=weight;
        //adj_Mat[di][si]=weight;
    }

    public void BFS()
    {
        Queue<Vertex> q=new LinkedList<Vertex>();
        int index=0;
        q.add(Vlist[0]);
        Vlist[0].isVisited=true;

        while(q.size()!=0)
        {
            System.out.println(q.peek().name);
            for (int i=0;i<Vlist.length ;i++ )
            {
                if(q.peek().name==Vlist[i].name)
                {
                    index=i;
                    break;
                }
            }
            for (int i=0;i<Vlist.length ;i++ )
            {
                if(adj_Mat[index][i]==1 && Vlist[i].isVisited==false)
                {
                    q.add(Vlist[i]);
                    Vlist[i].isVisited=true;
                }
            }
            q.remove();
        }
        for (int i=0;i<Vlist.length ;i++ )
        {
            Vlist[i].isVisited=false;
        }
    }
    public void DFS()
    {
        Stack<Vertex> s=new Stack<Vertex>();
        int index=0;
        s.push(Vlist[0]);
        Vlist[0].isVisited=true;
        System.out.println(s.peek().name);
        while(s.size()!=0)
        {

            for (int i=0;i<Vlist.length ;i++ )
            {
                if(s.peek().name==Vlist[i].name)
                {
                    index=i;
                    break;
                }
            }
            boolean neighb=false;
            for (int i=0;i<Vlist.length ;i++ )
            {
                if(adj_Mat[index][i]==1 && Vlist[i].isVisited==false)
                {
                    neighb=true;
                    s.push(Vlist[i]);
                    Vlist[i].isVisited=true;
                    System.out.println(s.peek().name);
                    break;
                }
            }
            if(neighb==false)
            {
                s.pop();
            }
        }
        for (int i=0;i<Vlist.length ;i++ )
        {
            Vlist[i].isVisited=false;
        }
    }
}
public class Main
{
    public static void main(String[] args) {
      
        Graph g=new Graph(9);
        g.Add_Vertex('A');
        g.Add_Vertex('B');
        g.Add_Vertex('C');
        g.Add_Vertex('D');
        g.Add_Vertex('E');
        g.Add_Vertex('F');
        g.Add_Vertex('G');
        g.Add_Vertex('H');
        g.Add_Vertex('I');
        g.Add_Edge_UD_UW('A','B');
        g.Add_Edge_UD_UW('A','C');
        g.Add_Edge_UD_UW('A','D');
        g.Add_Edge_UD_UW('B','E');
        g.Add_Edge_UD_UW('B','F');
        g.Add_Edge_UD_UW('C','G');
        g.Add_Edge_UD_UW('C','H');
        g.Add_Edge_UD_UW('D','I');
        g.DFS();
        g.BFS();
    }
}