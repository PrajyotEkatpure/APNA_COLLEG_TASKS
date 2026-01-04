#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class node{
    public:
    int val;
    node *left;
    node* right;
    node(int d){
        val=d;
        left=NULL;
        right=NULL;

    }
};
node *root=NULL;

static int ptr=-1;

node *buildTree(vector<int> preorder){
    ptr++;
    if(preorder[ptr]==-1) return NULL;
    node *root=new node(preorder[ptr]);
    root->left=buildTree(preorder);
    root->right=buildTree(preorder);
    return root;
    
}
node *pre_traverse(node *root){
if(root==NULL) return NULL;
cout<<root->val<<" >> ";
pre_traverse(root->left);
pre_traverse(root->right);
 }
queue<node*> q;
node *level_order(node *root){
    q.push(root);
    while(!q.empty()){
        node *curr=q.front();
        cout<<curr->val<<endl;


        q.pop();
        if(curr->left!=NULL) q.push(curr->left);
        
        if(curr->right!=NULL) q.push(curr->right);
        


    }

 }


int main() {
    // Your code here
    vector<int> v={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
    root=buildTree(v);
    pre_traverse(root);
    cout<<endl;
    level_order(root);



    return 0;
}