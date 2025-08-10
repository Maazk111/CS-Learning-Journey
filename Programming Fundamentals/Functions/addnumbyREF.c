#include<stdio.h>
int sub(int *u, int *v);
int add(int *x,int *y);
int main()
{
	int a = 4 , b =3;
	int c = 4 , d = 3;
	printf("Addition is %d\n",add(&a,&b));
	
	printf("Subtraction is %d",sub(&a,&b));
}
int add(int *x,int *y)
{
	int c,s;
	
	c = *x + *y;
	
	return c;
}
int sub(int *u, int *v)
{
	int s;
	
	s = *u - *v;
	return s;
}
