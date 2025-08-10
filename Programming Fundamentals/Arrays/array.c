#include <stdio.h>
int main()
{
	int i, stu;
	char students[10];

	
	for(i = 1; i <= 10; i++)
	{
		printf("enter Student %d:\n" , i);
		scanf("%c ",&students[i]);
		
	}
	
	printf("which student? \n ");
	
	scanf("%d", &stu);
	return 0;
	
}
