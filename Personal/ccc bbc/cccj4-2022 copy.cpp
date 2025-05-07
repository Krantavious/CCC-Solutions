#include <bits/stdc++.h>
using namespace std;

int main(){

    int X;
    int Y;
    cin >> X;
    int inputcount;
    int currentcountX = 0;
    int currentcountY = 0;
    string input;
    string arrayy[X][2];
    int ans = 0;

    map<string, int> bbc;

    for (int i = 0; i < X; i++)
    {
        cin >> arrayy[i][0];
        cin >> arrayy[i][1];
    }
    cin >> Y;
    string arrayn[Y][2];
    for (int i = 0; i < Y; i++)
    {
        cin >> arrayn[i][0];
        cin >> arrayn[i][1];
    }
    cin >> inputcount;
    for (int i = 0; i < inputcount; i++)
    {
        for (int k = 0; k < 3; k++)
        {
            cin >> input;
            bbc[input] = i+1;
        }

    }


    for (int i = 0; i < X; i++)
    {
        if(bbc[arrayy[i][0]] != bbc[arrayy[i][1]])
        {
            ans++;
        }
    }
    for (int i = 0; i < Y; i++)
    {
        if(bbc[arrayn[i][0]] == bbc[arrayn[i][1]])
        {
            ans++;
        }
    }
    
    cout << ans;
    return 0;
}