#include<bits/stdc++.h>
using namespace std; 

map<pair<int, int>, int> he;
int R = 0, C = 0, M = 0;

int main () {
    cin >> R >> C >> M;

    int cc[R][C];
    int k = 1;
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cc[i][j] = k;
            k++;
            if (k > M) {
                k = 1;
            }
        }
    }
    // for (int i = 0; i < R; i++) {
    //     for (int j = 0; j < C; j++) {
    //         cout << he[{i, j}];
    //     }
    //     cout << endl;
    // }
    int ans = -1;
    for (int i = 0; i < C; i++) {
        he[{R-1, i}] = cc[R-1][i];
    }
    for (int i = R-2; i > -1; i--) {
        for (int j = 0; j < C; j++) {
            int a = he[{i+1, j}];
            int b = -1;
            int c = -1;
            if (j - 1 > -1) {
                b = he[{i+1, j-1}];
            }
            if (j + 1 < C) {
                c = he[{i+1, j+1}];
            }
            if (b == -1) {
                he[{i, j}] = min(a, c) + cc[i][j];
            } else if (c == -1) {
                he[{i, j}] = min(a, b) +  cc[i][j];
            } else {
                he[{i, j}] = min(a, min(b, c)) +  cc[i][j]; 
            }
            // for (int i = 0; i < R; i++) {
            //     for (int j = 0; j < C; j++) {
            //         cout << he[{i, j}] << " ";
            //     }
            //     cout << endl;
            // }
            // cout << endl;
        }
    }
    for (int i = 0; i < C; i++) {
        if (he[{0, i}] < ans || ans == -1) {
            ans = he[{0, i}];
        }
    }
    cout << ans;
    return 0;
}