#include<bits/stdc++.h>
using namespace std;

int main () {
    
    int M, N;
    cin >> M >> N;
    int a[M+1][N+1] = {0};
    queue<int> bbc;
    stack<int> bbc2;
    for (int i = 1; i < M+1; i++)
    {
        for (int j = 1; j < N+1; j++)
        {
            cin >> a[i][j];
        }    
    }

    
    bbc.push(M*N);
    bbc2.push(M*N);
    int x = 0;
    if(M > 500 && N > 500)
    {
        for (int i = 0; i < M*N; i++)
    {
        if(bbc.empty() == true)
        {
            cout << "no";
            return 0;
        }
        x = bbc.front();
        bbc.pop();
        for (int j = 1; j < M+1; j++)
        {
            for (int k = 1; k < N+1; k++)
            {
                if (j*k == x)
                {
                    bbc.push(a[j][k]);
                    a[j][k] = -1;
                    if (j == 1 && k == 1)
                    {
                        cout << "yes";
                        return 0;
                    }
                }
            }

        }
    }
    }
a[M][N] = 0;
    for (int i = 0; i < M*N; i++)
    {
        if(bbc2.empty() == true)
        {
            cout << "no";
            return 0;
        }
        x = bbc2.top();
        bbc2.pop();
        for (int j = 1; j < M+1; j++)
        {
            for (int k = 1; k < N+1; k++)
            {
                if (a[j][k] == x)
                {
                    bbc2.push(j*k);
                    a[j][k] = -1;   
                    if (j == 1 && k == 1)
                    {
                        cout << "yes";
                        return 0;
                    }
                }
            }
            
        }
    }
    return 0;
}