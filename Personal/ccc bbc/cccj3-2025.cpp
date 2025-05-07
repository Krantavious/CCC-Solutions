#include <bits/stdc++.h>
using namespace std;

int main() {

    int N;
    cin >> N;
    string ans = "";
    vector<char> letters {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    int y = 0;
    bool why = false;
    for (int i = 0; i < N; i++) {
        string in;
        cin >> in;
        for (int j = 0; j < in.length(); j++) {
            char a = in[j];
            for (auto const& b : letters) {
                if (b == a) {
                    ans.push_back(a);
                }
            }
            if (isdigit(a)) {
                string x = "";
                bool sigma = true;
                int k = 0;
                while (sigma) {
                    if (!isdigit(in[j+k])) {
                        break;
                    }
                    x.push_back(in[j+k]);
                    k++;
                }
                j += k-1;
                //cout << x << endl;
                if (why) {
                    y -= stoi(x);
                    why = false;
                    continue;
                } else {
                    y += stoi(x);
                    continue;
                }
            } 
            if (a == '-') {
                why = true;
                continue;
            }
        }
        cout << ans << y << endl;
        ans = "";
        y = 0;
    }
    

    return 0;
}