#include<bits/stdc++.h>
using namespace std;
const int a = 3000;

int main() {

    int N;
    cin >> N;
    int bbc[a] = {0};
    for (int i = 0; i < N; i++)
    {
        int c;
        cin >> c;
        ++bbc[c];
    }
    int ccb[2*a] = {0};

    for (int i = 1; i <= a; i++)
    {
        for (int j = i; j <= a; j++)
        {
            if (i == j)
            {
                ccb[i+j] += floor(bbc[i]/2);
            } else {
                ccb[i+j] += min(bbc[i], bbc[j]);
            }
        }
        
    }
    
    int cnt = 0, max = 0;

    for (int i = 0; i < 2*a; i++)
    {
        if (ccb[i] > max)
        {
            max = ccb[i];
            cnt = 0;
        }
        if(ccb[i] == max)
        {
            cnt++;
        }
    }
    
    cout << max << ' ' << cnt;
    return 0;
}