#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class Graph{
public:
int V;  //Vertices
list<int> *ll;
Graph(int v){
    this->V=v;
    ll=new list<int>[V];

}
void addEdges(int u,int v){               //  u<----->v
ll[u].push_back(v);
ll[v].push_back(u);                               

}
void printAdjancyList(){
        for(int i=0;i<V;i++ ){
            cout<<i<<" : ";
            for(int neigh:ll[i]){
                cout<<neigh<<" ";
            }
            cout<<endl;
        }
    }
   /// BFS Trvaersal using the queue
   void BFSTraversal(){
    vector<bool> v(V,false);
    queue<int> q;
    q.push(0);
    v[0]=true;
    while(!q.empty()){
        int u=q.front();
        cout<<u<<" ";
        q.pop();
        for(int des:ll[u])  {
            if(!v[des]){
                v[des]=true;
                q.push(des);
            }

        }  // u sourece ----->  v des/neighbor
    cout<<endl;
    }
   } 
   //DFS Traversal usigng the Stack or Recursion
   void DFShelper(int u,/*source*/vector<bool> &v){
    cout<<u<<"-->>";
    v[u]=true;
    for(int neigh:ll[u]){
        if(!v[neigh]){
            DFShelper(neigh,v);
        }
    }
   }
void dfs(){
    int source=0;
    vector<bool> visited(V,false);
    DFShelper(source,visited);
}
};
int main() {
    // Your code here
    Graph g(5);
    g.addEdges(0,1);
    g.addEdges(1,2);
    g.addEdges(1,3);
    g.addEdges(2,4);

    // g.printAdjancyList();
    // g.BFSTraversal();
g.dfs();
    return 0;
}