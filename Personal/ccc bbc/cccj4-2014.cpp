#include <bits/stdc++.h>
using namespace std;

int main() {

    int n, c;
    cin >> n >> c;
    vector<int> ns;
    ns.push_back(0);
    for (int i = 1; i < n+1; i++)
    {
        ns.push_back(i);
    }
    vector<int> nns;

    for (int i = 0; i < c; i++)
    {
        int k;
        cin >> k;
        for (int g = k; g < ns.size()+1; g += k)
        {
            nns.push_back(ns[g]);
        }
        for (int g = 0; g < ns.size(); g++)
        {
            if (ns[g] == nns[0])
            {
                nns.erase(nns.begin());
                ns.erase(ns.begin() + g);
            }
        }
    }
    
    for (int i = 1; i < ns.size(); i++)
    {
        cout << ns[i] << endl;
    }
    

    return 0;
}