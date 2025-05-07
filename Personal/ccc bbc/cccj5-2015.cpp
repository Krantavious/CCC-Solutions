#include <bits/stdc++.h>
using namespace std;


map <vector<int>, int> ligga;
int bbc(int a, int b, int c){
    if (a == b || b == 1)
    {
        return 1;
    }

    if (ligga[{a, b, c}] != 0)
    {
        return ligga[{a, b, c}];
    }

    int t = 0;
    for ( int i = c; i <= a/b; i++)
    {
        
        t += bbc(a-i, b-1, i);
    }
    
    ligga[{a, b, c}] = t;
    return t;

}

int main() {

    int n, k = 0;
    cin >> n >> k;
    
    cout << bbc(n, k, 1);
    
    return 0;
}