#include<iostream>
using namespace std;
float Area;
void boxArea(float length,float width,float height){
Area=((2*length*width)+(2*length*height)+(2*height*width));
cout<<"the Area of the box is : "<<Area<<endl;
}
