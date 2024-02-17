#include<iostream>
using namespace std;
class even_odd(){
    public:
    void dislay(int num){
        if(n%2==0){
            cout<<"enter a number:\n"<<num<<"even"<endl;
        }
        else{
            cout<<"enter a number:\n"<<num<<"odd"<<endl;
        }
    }
};
int main(){
        int number;
    even_odd obj1;
    cout<<"enter a number : ";
    cin>>num;
    obj1.check(num);

}
