#include <bits/stdc++.h>
using namespace std;

int bbc, bbc2;
int c = 120;

bool inRange(int a, int b, int c)
{
    if (a >= b && a < c)
    {
        return true;
    } else
    return false;
}

void NormalRun()
{
    bbc2 += c;
    bbc += floor(bbc2/60);
    bbc2 = bbc2 % 60;
    c = 0;
}

int Sigma()
{
    if (bbc >= 24)
    {
        bbc -= 24;
    }
    if (bbc < 10)
    {
        if (bbc2 < 10)
        {
            cout << '0' << bbc << ":" << '0' << bbc2;
            return 0;
        }
        cout << '0' << bbc << ":" << bbc2;
        return 0;
    }
    if (bbc2 < 10)
    {
        cout << bbc << ":" << '0' << bbc2;
        return 0;
    }

    cout << bbc << ":" << bbc2;
    return 0;
}


int main(){

    char a;
    cin >> bbc >> a >> bbc2;
    if (inRange(bbc, 7, 10))
    {
        c -= (60*(9 - bbc) + (60 - bbc2)) / 2;
        bbc = 10;
        bbc2 = 0;
        NormalRun();
        Sigma();
        return 0;
    }
    if (inRange(bbc, 15, 19))
    {
        c -= (60*(18 - bbc) + (60 - bbc2)) / 2;
        bbc = 19;
        bbc2 = 0;
        NormalRun();
        Sigma();
        return 0;
    }
    while (c >= 60 && bbc != 15 && bbc != 7)
    {
        c -= (60 - bbc2);
        bbc2 = 0;
        bbc++;
    }
        if(bbc == 7)
        {
            if (c >= 90)
            {
                c += 90;
            } else{
                c *= 2;
            }
        }
        if(bbc == 15)
        {
            if (c >= 120)
            {
                c += 120;
            } else{
                c *= 2;
            }
        }

    NormalRun();
    Sigma();
}