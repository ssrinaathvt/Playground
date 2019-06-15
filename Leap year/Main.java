#include<stdio.h>
int main()
{
  //Type your code here
  int l;
  scanf("%d",&l);
  if(l%400==0||l%4==0)
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
  return 0;
}