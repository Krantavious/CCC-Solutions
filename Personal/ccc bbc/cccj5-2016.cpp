#include<bits/stdc++.h>
using namespace std;

vector<int> D;
vector<int> P;
int ans = 0, a = 0, b = 0, c = 0;

void Func1(){
    for (int i = 0; i < b; i++)
    {
        ans += max(P.back(), D.back());
        P.pop_back();
        D.pop_back();
    }
    
}

void Func2(){
    int i = b;
    while (i > 0)
    {
        if (P.back() > D.back())
        {
            ans += P.back();
            P.pop_back();
        } else {
            ans += D.back();
            D.pop_back();
        }
        --i;
    }
}

int main (){
    cin >> a >> b;
    for (int i = 0; i < b; i++)
    {
        cin >> c;
        D.push_back(c);
    }
    for (int i = 0; i < b; i++)
    {
        cin >> c;
        P.push_back(c);
    }
    sort(P.begin(), P.end());
    sort(D.begin(), D.end());
    if (a == 1)
    {
        Func1();
    } else {
        Func2();
    }
    cout << ans;

    return 0;
}