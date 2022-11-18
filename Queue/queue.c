#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Queue
{
	int front,rear;
	int capacity;
	int *array;
};

struct Queue* createQueue(int capacity)
{
	struct Queue *Q=(struct Queue*)malloc(sizeof(struct Queue));
	if(!Q) return(NULL);
	Q->capacity=capacity;
	Q->front=Q->rear=-1;
	Q->array=(int*)malloc(Q->capacity*sizeof(int));
	if(!Q->array)
		return NULL;
	printf("\t\t\t\t\tYour Queue has been Created...\n");
	return(Q);
}

int isEmpty(struct Queue *Q)
{
	return(Q->front==-1);
}
int isFullQueue(struct Queue *Q)
{
	return((Q->rear+1)%Q->capacity==Q->front);

}

int QueueSize(struct Queue* Q)
{
	return((Q->capacity-Q->front+Q->rear+1)%Q->capacity);
}

void insertqueue(struct Queue *Q,int data)
{
	if(isFullQueue(Q))
	{
		printf("Cannot add Queue is full..\n");
		return ;
	}
	Q->rear=(Q->rear+1)%Q->capacity;
	Q->array[Q->rear]=data;
	if(Q->front==-1)
		Q->front=Q->rear;
}

int delQueue(struct Queue *Q)
{
	int data=-1;
	if(isEmpty(Q))
	{
		printf("Queue Is empty");
		return(-1);
	}
	else
	{
		data=Q->array[Q->front];
		if(Q->front==Q->rear)
			Q->front=Q->rear=-1;
		else
			Q->front=(Q->front+1)%Q->capacity;
	}
	return data;
}
void deleteQueue(struct Queue *Q)
{
	if(Q)
	{
		if(Q->array)
		{
			free(Q->array);
		}
		free(Q);
	}
}
void printqueue(struct Queue *Q)
{
	int a=Q->front;
	int b=Q->rear;
	while(1)
	{
		if(a==b)
		{
			printf("%d",Q->array[a]);
			break;
		}
		printf("%d<=",Q->array[a]);
		a=(a+1)%Q->capacity;

	}
}
int main()
{
	printf("\t\t\t\t\tProgram to implement the Queue\t\n");
	printf("Enter the size of queue\n");
	int size=0;
	scanf("%d",&size);
	struct Queue* queueA=createQueue(size);
	printf("\t\t\t\t\t\tHere are some function for u...\n");
	while(1)
	{
		printf("\t\t\t\t\t\tEnter your choice... :)\n");
		printf("\t\t\t\t\t\t1) Show size\n");
		printf("\t\t\t\t\t\t2) Show capacity\n");
		printf("\t\t\t\t\t\t3) Insert Item\n");
		printf("\t\t\t\t\t\t4) Delete from queue\n");
		printf("\t\t\t\t\t\t5) Delete whole queue\n");
		printf("\t\t\t\t\t\t6) Print the queue\n");
		printf("\t\t\t\t\t\t7) Exit\n");
		int choice=0;
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
			printf("Size of ur Queue=%d",QueueSize(queueA));
			break;
			case 2:
			printf("capacity of ur queue=%d",queueA->capacity);
			break;
			case 3:
			printf("Enter the item to be inserted\n");
			int item=0;
			scanf("%d",&item);
			insertqueue(queueA,item);
			printf("Data inserted\n");
			break;
			case 4:
			printf("%d deleted from queue",delQueue(queueA));
			break;
			case 5:
			deleteQueue(queueA);
			printf("Queue deleted...kindly exit and login again to make a new one\n");
			break;
			case 6:
			//printf("we dont have this function for now..\n");
			printqueue(queueA);
			break;
			case 7:
			printf("Good Bye nice to meet u\n");
			deleteQueue(queueA);
			exit(0);
			break;
			default:
			printf("Enter the right choice..\n");


		}


	}
	return 0;
}