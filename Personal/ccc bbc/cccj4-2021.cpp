#include <bits/stdc++.h>
using namespace std;

int main(){

string input;
cin >> input;
int i;
int Lcount = 0;
int Mcount = 0;
int Scount = 0;
int MinL = 0;
int SinL = 0;
int LinM = 0;
int LinS = 0;
int SinM = 0;
int MinS = 0;
int totalswapsneed = 0;
string currentletter;

for ( i = 0; i < input.length(); i++)
    {
    currentletter = input[i];
    if (currentletter == "\0")
    {
        i = input.length() + 1;
    } else if (currentletter == "L")
    {
        Lcount += 1;
    } else if (currentletter == "M")
    {
        Mcount += 1;
    } else if (currentletter == "S")
    {
        Scount += 1;
    } else return 0;
}

for ( i = 0; i < Lcount; i++)
    {
    currentletter = input[i];
     if (currentletter == "L")
    {

    } else if (currentletter == "M")
    {
        MinL += 1;
    } else if (currentletter == "S")
    {
        SinL += 1;
    } else return 0;
}

for ( i = Lcount; i < Lcount + Mcount; i++)
    {
    currentletter = input[i];
     if (currentletter == "L")
    {
        LinM += 1;
    } else if (currentletter == "S")
    {
        SinM += 1;
    }
}

for ( i = Lcount + Mcount; i < Lcount + Mcount + Scount; i++)
    {
    currentletter = input[i];
     if (currentletter == "L")
    {
        LinS += 1;
    } else if (currentletter == "M")
    {
        MinS += 1;
    }
}

if (MinL == 0 && SinL == 0)
{
totalswapsneed = SinM;
} else if (MinL == 0)
{
    totalswapsneed = (MinL + SinL) + abs(SinL - LinS);
} else if (SinL == 0)
{
    totalswapsneed = (MinL + SinL) + abs(MinL - LinM);
} else if (SinL != 0 && MinL != 0)
{
    totalswapsneed = 2*(MinL + SinL) - (min(SinL, LinS) + min(MinL, LinM)) + min(MinS, SinM);
}
cout << totalswapsneed;
    return 0;
}