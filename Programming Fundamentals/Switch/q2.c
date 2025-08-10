#include<stdio.h>

main()
{
	  int choice,r,l,w,b,h;
      float area;
      printf("Input 1 for area of circle\n");
      printf("Input 2 for area of rectangle\n");
      printf("Input 3 for area of triangle\n");
      printf("Input your choice : ");
      scanf("%d",&choice);
      switch(choice)
      {
           case 1:
                 printf("Input radious of the circle : ");
                 scanf("%d",&r);
                 area=3.14*r*r;
                 break;
            case 2:
                  printf("Input length of the rectangle : ");
                  scanf("%d",&l);
                  printf("Input width of the rectangle : ");
                  scanf("%d",&w);
                  area=l*w;
                  break;
            case 3:
                  printf("Input the base of the triangle :");
                  scanf("%d",&b);
                  printf("Input the height of the triangle :");
                  scanf("%d",&h);
                  area=.5*b*h;
                  break;
          }
          printf("The area is : %f\n",area);
}
