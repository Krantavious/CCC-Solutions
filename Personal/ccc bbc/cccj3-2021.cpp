#include <iostream>
#include <cmath>
#include <string>
using namespace std;

int main(){

int i;
int tensdigit;
int onesdigit;
int sumfordirection;
int input;
double input14;
double input13;
string previousdirection;
for ( i = 0; i < 1;)
{
    cin >> input;
    if (input == 99999)
    {
        return 0;
    } else;
    
    input14 = input / 10000;
    input13 = input / 1000;

    tensdigit = floor(input14);
    onesdigit = floor(input13) - tensdigit*10;
    sumfordirection = onesdigit + tensdigit;
if (sumfordirection == 0)
        {
        cout << previousdirection;    
        cout << (input - ((floor(input13))*1000));
        } else if (sumfordirection % 2 == 0)
        {
        cout << "right";
        previousdirection = "right";
        cout << (input - ((floor(input13))*1000));
            } else if (sumfordirection % 2 == 1)    
    {
        cout << "left";
        previousdirection = "left";
        cout << (input - ((floor(input13))*1000));
    }
} return 0;
}