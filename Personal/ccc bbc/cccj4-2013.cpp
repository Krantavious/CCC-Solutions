#include <bits/stdc++.h>
using namespace std;

int main() {

    int T, c;
    cin >> T >> c;
    vector<int> sigma;
    for (int i = 0; i < c; i++)
    {
        int b;
        cin >> b;
        sigma.push_back(b);
    }
    sort(sigma.begin(), sigma.end());
    int ans = 0;
    for (int i = 0; i < c; i++)
    {
        if(T >= sigma[i])
        {
            T -= sigma[i];
            ans++;
        } else {
            break;
        }
    }
    cout << ans;

    return 0;
}