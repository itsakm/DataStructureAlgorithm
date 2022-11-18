#include<stdio.h>
#include<conio.h>
typedef struct Node
{
	int data;
	struct node *left,*right;
}node;
node* newnode(int data)
{
	node *temp;
	temp->data=data;
	temp->left=NULL;
	temp->right=NULL:
	return temp;
}
int main()
{
	node *root=newnode(1);
k
}