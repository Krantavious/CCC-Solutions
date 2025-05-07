#include <bits/stdc++.h>
using namespace std;

int main(){

    int ydimen = 0;
    cin >> ydimen;
    int array[2][ydimen] = {0};
    int currentnum = 0;
    int totalsides = 0;
    for (int i = 0; i < ydimen; i++)
    {
        cin >> currentnum;
        array[0][i] = currentnum;
    }
    for (int i = 0; i < ydimen; i++)
    {
        cin >> currentnum;
        array[1][i] = currentnum;
    }
    for (int i = 0; i < ydimen; i++)
    {
        if (array[0][i] == 1)
        {
            totalsides += 3;
            if (i == 0)
            {
                if (array[1][i] == 1)
                {
                    totalsides--;
                }
                if (array[0][i+1] == 1 && i+1 <= (ydimen-1))
                {
                    totalsides--;
                }
            } else if (i == (ydimen-1))
            {
                if ((ydimen-1) % 2 == 0)
                {
                    if (array[0][i-1] == 1)
                    {
                        totalsides--;
                    }
                    if (array[1][i] == 1)
                    {
                        totalsides--;
                    }
                } else if ((ydimen-1) % 2 == 1)
                {
                    if (array[0][i-1] == 1)
                    {
                        totalsides--;
                    }
                }
            } else if (i % 2 == 1)
            {
                if (array[0][i-1] == 1)
                {
                    totalsides--;
                }
                if (array[0][i+1] == 1)
                {
                    totalsides--;
                }
            } else 
            {
                if (array[0][i-1] == 1)
                {
                    totalsides--;
                }
                if (array[0][i+1] == 1)
                {
                    totalsides--;
                }
                if (array[1][i] == 1)
                {
                    totalsides--;
                }
            }
        }
    }
    
    for (int i = 0; i < ydimen; i++)
    {
        if (array[1][i] == 1)
        {
            totalsides += 3;
            if (i == 0)
            {
                if (array[0][i] == 1)
                {
                    totalsides--;
                }
                if (array[1][i+1] == 1)
                {
                    totalsides--;
                }
            } else if (i == (ydimen-1))
            {
                if ((ydimen-1) % 2 == 0)
                {
                    if (array[1][i-1] == 1)
                    {
                        totalsides--;
                    }
                    if (array[0][i] == 1)
                    {
                        totalsides--;
                    }
                } else if ((ydimen-1) % 2 == 1)
                {
                    if (array[1][i-1] == 1)
                    {
                        totalsides--;
                    }
                }
            } else if (i % 2 == 1)
            {
                if (array[1][i-1] == 1)
                {
                    totalsides--;
                }
                if (array[1][i+1] == 1)
                {
                    totalsides--;
                }
            } else 
            {
                if (array[1][i-1] == 1)
                {
                    totalsides--;
                }
                if (array[1][i+1] == 1)
                {
                    totalsides--;
                }
                if (array[0][i] == 1)
                {
                    totalsides--;
                }
            }
        }
    }

    cout << totalsides;

    return 0;
}