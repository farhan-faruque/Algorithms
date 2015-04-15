package me.farhan.alg;

/**
 * Created by farhan on 4/16/15.
 */
public class Graph {

    /*
     * create a V -vertex graph with no edges
     */
    public Graph(int V){

    }

    /*
    * read a graph from input stream in
    */
    public Graph(In in){

    }
    /*
    * number of vertices
    */
    public int V(){
        return  0;
    }

    /*
    * number of edges
    */
    public int E(){
        return 0;
    }
    /*
     * vertices adjacent to v
     */
    Iterable<Integer> adj(int v){
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /*
     * compute the degree of v
     */

    public static int degree(Graph G,int v){
        int degree = 0;
        for(int w: G.adj(v)) degree++;
        return degree;
    }

    public static int maxDegree(Graph G){
        int maxDegree = 0;
        for (int v = 0; v< G.V(); v++)
            if(degree(G,v) > maxDegree)
                maxDegree = degree(G,v);
        return maxDegree;
    }

    public static int avgDegree(Graph G){
        return 2 * G.E() / G.V();
    }

    

}
