#include<bits/stdc++.h>
using namespace std;

struct Node
{
	int data;
	struct Node *next;
};

void push(Node *head_ref ,int new_data)
{
	struct Node* new_node=new Node;
	new_node->data=new_data;
	new_node->next=head_ref;
	head_ref=new_node;
}

void printlist(Node *node)
{
	while(node!=NULL)
	{
		cout<<node->data<<" ";
		node=node->next;
	}

}

int main()
{
	struct Node* head = NULL;
	struct Node* second=NULL;
	struct Node* third=NULL;

	head = new Node;
	second= new Node;
	third = new Node;

	head->data=1;
	head->next=second;

	second->data=2;
	second->next=third;

	third->data=3;
	third->next=NULL;

	//cout<<head->data;

	push(head,4);
	printlist(head);

	return 0;



}