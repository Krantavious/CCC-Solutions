#include<bits/stdc++.h>
using namespace std;

int main(){

int in;
int in2;
cin >> in;
cin >> in2;
vector<pair<int, int>> bbc(in2);
for (int i = 0; i < in2; i++)
{
    cin >> bbc[i].first >> bbc[i].second;
}
in2++;
bbc.emplace_back(0, 0);
int ans = 0;
int current = in+1;
int upper = 0;
int left = 0;
int xdiff = 0;
int ydiff = 0;
for (int i = 0; i < in2; i++)
{
    for (int j = 0; j < in2; j++)
    {
        if(i == j && i != in2-1)
        {
            continue;
        }
        upper = bbc[i].first;
        left = bbc[j].second;
        current = in+1;
        for (int k = 0; k < in2; k++)
        {
            if(k == i || k == j)
            {
                continue;
            }
            if (bbc[k].first > upper && bbc[k].second > left)
            {
                xdiff = bbc[k].first - upper - 1;
                ydiff = bbc[k].second - left - 1;
                current = min(current, max(xdiff, ydiff));
            }
        }
        if (min(in - upper, in - left) < current)
            {
                current = min(in - upper, in - left);
            }
        ans = max(current, ans);
    }
    
}
cout << ans;

    return 0;
}