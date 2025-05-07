#include <bits/stdc++.h>
using namespace std;

int main (){
    int R = 0;
    int C = 0;
    cin >> R;
    cin >> C;
    int array2[R+2][C+2] = {0};
    string input = "";
    int frmrposx = 0;
    int frmrposy = 0;
    string currentchar = "";
    queue<int> posqueue;
    int currentposx = 0;
    int currentposy = 0;
    int total$ = 0;
    bool hayexist = false;
    for (int i = 0; i < R; i++)
    {
        cin >> input;
        for (int k = 0; k < C; k++)
        {
            currentchar = input[k];
            if (currentchar == "L")
            {
                array2[i+1][k+1] = 10;
            } else if (currentchar == "M")
            {
                array2[i+1][k+1] = 5;
            } else if (currentchar == "S")
            {
                array2[i+1][k+1] = 1;
            } else if (currentchar == "*")
            {
                hayexist = true;
            }
        }
    }
    cin >> frmrposx;
    cin >> frmrposy;
    posqueue.push(frmrposx+1);
    posqueue.push(frmrposy+1);
    if (hayexist == false)
    {
        for (int i = 0; i < R; i++)
        {
            for (int k = 0; k < C; k++)
            {
                total$ += array2[i+1][k+1];
            }
            
        }
        cout << total$;
        return 0;
    }
    for (int m = 0; m < 5*R*C; m++)
    {
         if (posqueue.empty() == true)
        {
            cout << total$;
            return 0;
        } else
        {
        currentposx = posqueue.front();
        posqueue.pop();
        currentposy = posqueue.front();
        posqueue.pop();
        if (currentposx < 1 || currentposx > R || currentposy < 1 || currentposx > C)
        {
            m++;
        } else if (array2[currentposx][currentposy] == 10 || array2[currentposx][currentposy] == 5 || array2[currentposx][currentposy] == 1)
            {
                total$ += array2[currentposx][currentposy];
                array2[currentposx][currentposy] = 0;
                posqueue.push(currentposx-1);
                posqueue.push(currentposy);
                posqueue.push(currentposx);
                posqueue.push(currentposy+1);
                posqueue.push(currentposx+1);
                posqueue.push(currentposy);
                posqueue.push(currentposx);
                posqueue.push(currentposy-1);
                // cout << currentposx << "y" << currentposy << "bbc" << total$ << endl;
            }
        }
    }
    return 0;
}