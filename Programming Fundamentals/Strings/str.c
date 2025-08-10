#include <stdio.h>
int main()
{
	char name[10];
	
	printf("enter name: \n");  // get is for including space 
	scanf("%s",name);          // put is for only to print the string
	gets(name);
	puts(name);
//	printf("your name is %s: ", name);
	
}
