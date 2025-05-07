#include<bits/stdc++.h>
using namespace std;

map<pair<int, int>, bool> sigma;
int ans = 0;
vector<int> waza = {0, 0, 0, 0};
int T = 0, k = 0;

bool check() {
    for (int i = 0; i < 4; i++) {
        if (i == T-1) {
            continue;
        } else if (waza[T-1] <= waza[i]) {
            return false;
        }
    }
    return true;
}

int tavioid() {
    if (k == 6) {
        if (check()) {
            ans++;
        }
        return 0;
    }
    for (int i = 0; i < 3; i++) {
        for (int j = i+1; j < 4; j++) {
            if (sigma[{i+1, j+1}]) {
                continue;
            } else {
                sigma[{i+1, j+1}] = true;
                waza[j]+=3;
                k++;
                tavioid();
                waza[j]-=3;

                waza[i]+=3;
                tavioid();
                waza[i]-=3;

                waza[j]++;
                waza[i]++;
                tavioid();
                waza[j]--;
                waza[i]--;
                //cout << "a";
                k--;
                sigma[{i+1, j+1}] = false;
                return 0;
            }
        }
    }

    return 0;
}

int main(){
    cin >> T >> k;
    int a, b, x, y;
    for (int i = 0; i < k; i++) {
        cin >> a >> b >> x >> y;
        sigma[{a, b}] = true;
        if (x > y) {
            waza[a-1] += 3;
        } else if (y > x) {
            waza[b-1] += 3;
        } else {
            waza[a-1]++;
            waza[b-1]++;
        }
    }
    tavioid();
    cout << ans;

    return 0;
}