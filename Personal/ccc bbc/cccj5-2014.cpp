#include<bits/stdc++.h>
using namespace std;

int main (){

    int n;
    cin >> n;
    vector<string> bbc;
    map<string, string> bbc2;
    for (int i = 0; i < n; i++)
    {
        string ligga;
        cin >> ligga;
        bbc.push_back(ligga);
    }
    for (int i = 0; i < n; i++)
    {
        string liiga;
        cin >> liiga;
        bbc2[bbc[i]] = liiga;
    }
    for (int i = 0; i < n; i++)
    {
        if (bbc[i] != bbc2[bbc2[bbc[i]]])
        {
            cout << "bad";
            return 0;
        } else if (bbc[i] == bbc2[bbc[i]])
        {
            cout << "bad";
            return 0;
        }
    }
    cout << "good";

    return 0;
}
