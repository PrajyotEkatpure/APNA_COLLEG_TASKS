#include <iostream>
#include <bits/stdc++.h>
using namespace std;
class node{
    public :
    int val;
    node *left;
    node *right;
node(int v){
    val=v;
    left=NULL;
    right=NULL;

}

};
node *insert(node *root,int val)
{   
    if(root==NULL) {
    node *n=new node(val);
    return n;
    }
    if(val>root->val) root->right=insert(root->right,val);
    else root->left=insert(root->left,val);
    return root;
}
void inorder(node *root){
    if(root==NULL) return;
    inorder(root->left);
    cout<<root->val<<endl;
    inorder(root->right);
}

// int search(node *root,int val){
//     if(root->val==val) 
//         return root->val;
//     else if(val>root->val) 
//         search(root->right,val);
//     else if(val<root->val)
//         search(root->left,val);
//     else
//         return 0;


// }

bool search(node *root,int val){
    if (root==NULL) return false;

    if(root->val==val) 
        return true;

    if(val>root->val) 
        return search(root->right,val);
    else
        return search(root->left,val);
   


}
node *findMin(node *root){
    while(root->left!=NULL){
        root=root->left;
    }
    return root;
}
node *dele(node *root,int val){
    if(root==NULL) return NULL;
    if(val>root->val) root->right=dele(root->right,val);
    else if(val<root->val) root->left=dele(root->left,val);
    else {
        // if(root->left ==NULL && root->right==NULL){
        //     delete root;
        //     root=NULL;
        //     return root;
        // }
        // if(root->left==NULL|| root->right==NULL){
        //     if(root->left==NULL){
        //         delete root;
        //         root=root->right;
        //         return root;
        //     }
        //     else{
        //         delete root;
        //         root=root->left;
        //         return root;
        //     }
        // }
        // if(root->left!=NULL && root->right!=NULL){
        //    node *temp;
        //     temp=findMin(root->right);
        //     root->val=temp->val;
        //     delete temp;
        //     temp=NULL;
        //     return root;


        // }

        if(root->left==NULL){         //combined both to delete node with 0 childs and with 1 childs
            node *temp=root->right;
            delete root;
            return temp;
        }else if(root->right==NULL){  //when right is null
            node *temp=root->left;
            delete root;
            return temp;
        }
        //With 2 childs
        else{
            node *temp=findMin(root->right);
            root->val=temp->val;
            root->right=dele(root->right,temp->val);
        }
    }
    return root;
}
void del(node *root,int n){
    root=dele(root,n);
}
int main() {
    // Your code here
    node *root=NULL;
    root=insert(root,3);
    insert(root,2);
    insert(root,1);
    insert(root,4);
    insert(root,5);
        insert(root,6);

// int n=search(root,9);
// if(n) cout<<"Node Found "<<n<<endl;
// else cout<<"Node Not Found ";

// if(search(root,9)) cout<<"Node Found "<<5<<endl;
// else cout<<"Node Not Found ";
del(root,3);
inorder(root);

    return 0;

}