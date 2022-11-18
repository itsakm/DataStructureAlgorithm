#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
typedef struct node
{
	int data;
	struct node* left;
	struct node* right;
}Node;

Node* newnode(int data)
{
	Node* temp=(Node*)malloc(sizeof(Node));
	temp->data=data;
	temp->left=NULL;
	temp->right=NULL;
	return temp;
}
int main()
{
	Node* root=newnode(1);
	root->left=newnode(2);
	root->right=newnode(3);
	root->left->left=newnode(4);
	root->left->right=newnode(5);
	return 0;

}