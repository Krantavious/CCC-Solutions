#include <bits/stdc++.h>
using namespace std;

int main(){

    int numR = 0;
    int numC = 0;
    int numMoves = 0;
    cin >> numR;
    cin >> numC;
    cin >> numMoves;
    string artInput;
    int artInput2;
    int Ccounter[numC] = {0};
    int Rcounter[numR] = {0};
    int Coccur = 0;
    int Roccur = 0;
    int Rtotalcount = 0;
    int Ctotalcount = 0;
    string startletr;

    for (int i = 0; i < numMoves; i++)
    {
        cin >> artInput;
        cin >> artInput2;
        startletr = artInput[0];
        if (startletr == "R")
        {
            Roccur = Rcounter[artInput2 - 1];

            if (Roccur % 2 == 1)
            {
                Rtotalcount--;
            } else if(Roccur % 2 == 0)
            {
                Rtotalcount++;
            }
            
            Rcounter[artInput2 - 1]++;
            Roccur = 0;

        } else if (startletr == "C")
        {
            Coccur = Ccounter[artInput2 - 1];
            
            if (Coccur % 2 == 1)
            {
                Ctotalcount--;
            } else if(Coccur % 2 == 0)
            {
                Ctotalcount++;
            }
            
            Ccounter[artInput2 - 1]++;
            Coccur = 0;
        }
        
    }
    
    cout << (Ctotalcount*numR) + (Rtotalcount*numC) - 2*(Ctotalcount*Rtotalcount);
    
    return 0;
}