#include<bits/stdc++.h>
using namespace std;

int main(){

    int N;
    cin >> N;
    int C = 0;
    if (N <= 101)
    {
        C = N+1;
    } else 
    {
        C = N/2;
    }
    int ccb[N+1][C] = {0};
    bool bbc[N+1];
    for (int i = 0; i <= N+1; i++)
    {
        bbc[i] = false;
    }
    
    bbc[1] = true;

    for (int i = 1; i <= N; i++)
    {
        int M;
        cin >> M;
        for (int j = 1; j < M+1; j++)
        {
            cin >> ccb[i][j];
            ccb[i][0] = M;
            bbc[ccb[i][j]] = true;
        }
    }
    
    queue<int> qbbc;
    queue<int> qbbc2;
    qbbc.push(1);
    qbbc2.push(1);

    bool abc = false;
    int x = 0, y = 0, y2 = 0;

    while (!qbbc.empty())
    {
        x = qbbc.front();
        qbbc.pop();
        y = qbbc2.front();
        qbbc2.pop();
        if (ccb[x][0] == 0 && !abc)
        {
            y2 = y;
            abc = true;
        }
        for (int i = 1; i < ccb[x][0]+1; i++)
        {
            qbbc.push(ccb[x][i]);
            qbbc2.push(y+1);
            bbc[ccb[x][i]] = true;
        }
        ccb[x][0] = -1;
    }

    for (int i = 1; i < N+1; i++)
    {
        if (bbc[i] == false)
        {
            cout << 'N' << endl << y2;
            return 0;
        }
    }

    cout << 'Y' << endl << y2;
    
    return 0;
}