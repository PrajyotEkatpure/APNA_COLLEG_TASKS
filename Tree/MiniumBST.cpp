#include <iostream>
#include <bits/stdc++.h>
using namespace std;


 struct TreeNode {
    int val;
      TreeNode *left;
      TreeNode *right;
     TreeNode() : val(0), left(nullptr), right(nullptr) {}
     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 };
 
class Solution {
public:
    TreeNode *pre(TreeNode *root,vector<int> &v){
        if(root==NULL){
            return NULL;}
            pre(root->left,v);
            v.push_back(root->val);

            pre(root->right,v);
        return root;
    }
    int minDiffInBST(TreeNode* root) {
        vector<int> v;
        int minD=INT_MIN;
        root=pre(root,v);
        for(int i=0;i<v.size()-1;i++){
            int diff=(i+1) - i;
            minD=max(diff,minD);
        }
        return minD;
    }
};
int main() {
    // Your code here
    return 0;
}