#include<stdio.h>
#include<math.h>

typedef struct{
    int x;
    int y;
}Point;

float distance(Point p1,Point p2){
    int DistSquared = (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    return (float) sqrt(DistSquared);
}

int main(){
    Point p1 = {0,0}, p2 = {3,4};
    printf("Distance Between points (%d,%d) and (%d,%d) is: %f\n", p1.x, p1.y, p2.x, p2.y, distance(p1,p2));
}