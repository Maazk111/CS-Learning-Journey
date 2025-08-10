#include <stdio.h>
int main()
{
    int i, j, rows;                                        //  Write a program in C to make such a pattern like a pyramid with ALphabets

    printf("Enter the number of rows: ");
    scanf("%d", &rows);
    
    

    for(i=1; i<=rows; i++)
    {
        for(j=1; j<=rows-i; j++)
        {
            printf(" ");
        }
        char a =1;
        for(j=1; j<=i*2-1; j++)
        {
            printf("%c",a+64);
            a++;
        }
        printf("\n");
    }

    return 0;
}
     
