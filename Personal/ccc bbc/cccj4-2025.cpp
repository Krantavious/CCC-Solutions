#include <bits/stdc++.h>
using namespace std;

int main() {

    int A = 0;
    cin >> A;  
    vector<int> abc = {0};
    // cout << abc.size();
    int c = 0;
    int c2 = 0;
    for (int i = 0; i < A; i++) {
        char a;
        cin >> a;
        if (a == 'S') {
            if (c2 > 0) {
                abc.push_back(c2 * -1);
                c2 = 0;
            }
            c++;
        } else if (a == 'P') {
            if (c > 0) {
                abc.push_back(c);
                c = 0;
            }
            c2++;
        }
    }
    if (c > 0) {
        abc.push_back(c);
        c = 0;
    }
    if (c2 > 0) {
        abc.push_back(c2 * -1);
        c2 = 0;
    }
    
    int ans = 1;
    abc.push_back(c);
    for (int j = 1; j < abc.size()-1; j++) {
        if (abc[j] == -1) {
            if (abc[j-1] + 1 + abc[j+1] > ans) {
                ans = abc[j-1] + 1 + abc[j+1];
            } 
        }
    }
    for (auto k : abc) {
        if (k+1 > ans) {
            ans = k+1;
        } 
    }
    if (abc.size() == 3) {
        if (abc[1] > 0) {
            ans = abc[1] - 1;
        } else {
            ans = 1;
        }
    }
    if (abc.size() == 4) {
        ans = max(abc[1]+1, abc[2] + 1);
    }
    cout << ans;

    return 0;
}
