#include<bits/stdc++.h>
using namespace std;

int main (){

    pair<int, int> bbc;
    string ccb;
    cin >> ccb;
    for (int i = 0; i < ccb.length(); i++)
    {
        if (ccb[i] == 'V')
        {
            bbc.first++;
        } else {
            bbc.second++;
        }
    }
    
    if (bbc.first % 2 == 0)
    {
        if (bbc.second % 2 == 0)
        {
            cout << "1 2" << endl << "3 4";
        }
        else if (bbc.second % 2 == 1)
        {
            cout << "3 4" << endl << "1 2";
        }
    } else
    {
        if (bbc.second % 2 == 0)
        {
            cout << "2 1" << endl << "4 3";
        }
        else if (bbc.second % 2 == 1)
        {
            cout << "4 3" << endl << "2 1";
        }
    }

    return 0;
}