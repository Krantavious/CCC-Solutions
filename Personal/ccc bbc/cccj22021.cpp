#include <iostream>
using namespace std;

int main(){

int inputcount;
int i;
string stringin;
string highbidname;
int maxbid = 0;
int currentbid;
cin >> inputcount;

for (  i = 0; i < inputcount; i++)
{
    cin >> stringin;
    cin >> currentbid; 
    if (currentbid > maxbid)
    {
        maxbid = currentbid;
        highbidname = stringin;
    }
    
}
cout << highbidname;

    return 0;
}
