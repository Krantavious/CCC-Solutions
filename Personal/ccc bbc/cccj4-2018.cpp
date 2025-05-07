#include<bits/stdc++.h>
using namespace std;

int main(){

    int N;
    cin >> N;
    int an[N][N];
    int ap[N][N];
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            cin >> an[i][j];
            ap[i][j] = an[i][j];
        }
    }
    bool bbc = false;

    for (int i = 0; i < 4; i++)
    {
        for (int j = 0; j < N; j++)
        {
            for (int k = 0; k < N; k++)
            {
                if (k != N-1)
                {
                    if (an[j][k+1] < an[j][k])
                    {
                        bbc = true;
                        break;
                    }
                }
                if (j != N-1)
                {
                    if (an[j+1][k] < an[j][k])
                    {
                        bbc = true;
                        break;
                    }
                }
            }
            if (!bbc)
            {
                for (int i = 0; i < N; i++)
                {
                    for (int j = 0; j < N; j++)
                    {
                        cout << an[i][j] << " ";
                    }
                    cout << endl;
                }
                return 0;
            } else 
            {
                bbc = false;
                break;
            }
        }
        
        for (int j = 0; j < N; j++)
        {
            for (int k = 0; k < N; k++)
            {
                an[j][k] = ap[k][N - 1 - j];
            }
        }
        for (int j = 0; j < N; j++)
        {
            for (int k = 0; k < N; k++)
            {
                ap[j][k] = an[j][k];
            }
        }
    }
    

    return 0;
}