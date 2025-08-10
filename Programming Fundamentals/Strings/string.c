#include <stdio.h>
int main()
{                 

//                                                            name reverse         printf("your name is %s: ", name);
			char name[10];
			
			printf("Enter your name: ");
			scanf("%s", name);
			int i;
			
			for(i=sizeof(name);i>=0;i--)
			{
			printf("%c",name[i]);
			}	
			

}
