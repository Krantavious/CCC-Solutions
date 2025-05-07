#include<bits/stdc++.h>
using namespace std;

int main(){

    string S;
    string T;
    cin >> S >> T;
    char aT[T.length()];
    bool bbc = true; 
    
    for (int i = 0; i < T.length(); i++)
    {
        for (int j = 0; j < T.length(); j++)
        {
            aT[j] = T[(j+i) % T.length()]; 
        }
        for (int j = 0; j < S.length(); j++)
        {
            if (S[j] == aT[0])
            {
                for (int k = 1; k < T.length(); k++)
                {
                    if (S[j+k] != aT[k])
                    {
                        bbc = false;
                        break;
                    }
                }
                if (bbc)
                {
                    cout << "yes";
                    return 0;
                }
                bbc = true;
            }
        }
        
    }
    cout << "no";
    return 0;
}
   