#include <bits/stdc++.h>
using namespace std;

int main(){

    string word;
    cin >> word;
    int R = 0;
    int C = 0;
    cin >> R;
    cin >> C;
    char array[R+2][C+2] = {""};
    for (int i = 0; i < R; i++)
    {
        for (int k = 0; k < C; k++)
        {
            cin >> array[i+1][k+1];
        }
    }
    queue<int> queuepos;
    queue<bool> turncheck;
    queue<int> directionq;
    queue<int> genq;

//812
//7#3
//654


    for (int i = 0; i < R; i++)
    {
        for (int k = 0; k < C; k++)
        {
            if (array[i+1][k+1] == word[0])
            {
                queuepos.push(i+2);
                queuepos.push(k+1);
                turncheck.push(true);
                directionq.push(1);

                queuepos.push(i+2);
                queuepos.push(k+1);
                turncheck.push(true);
                directionq.push(1);

                queuepos.push(i+2);
                queuepos.push(k+1);
                turncheck.push(true);
                directionq.push(1);

                queuepos.push(i+2);
                queuepos.push(k+1);
                turncheck.push(true);
                directionq.push(1);
                
                queuepos.push(i+2);
                queuepos.push(k+1);
                turncheck.push(true);
                directionq.push(1);
                
            }
        }
        
    }
    

    return 0;
}