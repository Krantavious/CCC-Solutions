#include <bits/stdc++.h>
using namespace std;

int main (){

    string orgstr;
    string newstr;
    cin >> orgstr;
    cin >> newstr;
    string alphabet[26] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int alphbtcountorg[26] = {0};
    int alphbtcountnew[26] = {0};
    string currentltr;
    string posbleswap1;
    string posbleswap2 = "AA";
    string resultswap;
    int posbleswap2code = 0;
    int posbleswap1code = 0; 
    string currentltr2;
    bool firstswapfull = false;
    for (int i = 0; i < orgstr.length(); i++)
    {
        for (int k = 0; k < 26; k++)
        {
            currentltr = orgstr[i];
            if (currentltr == alphabet[k])
            {
                alphbtcountorg[k]++;
            }
        }
    }
    for (int n = 0; n < newstr.length(); n++)
    {
        for (int m = 0; m < 26; m++)
        {
            currentltr = newstr[n];
            if (currentltr == alphabet[m])
            {
                alphbtcountnew[m]++;
            }
        }
    }
    for (int i = 0; i < 26; i++)
    {
        if (alphbtcountorg[i] != 0 && alphbtcountnew[i] == 0 && firstswapfull == false)
        {   
            posbleswap1 = alphabet[i];
            posbleswap1code = i;
            firstswapfull = true;
        } else if (alphbtcountorg[i] != 0 && alphbtcountnew[i] == 0 && firstswapfull == true)
        {
            posbleswap2 = alphabet[i];
            posbleswap2code = i;
        } else if (alphbtcountorg[i] < alphbtcountnew[i])
        {
            resultswap = alphabet[i];
        }
    }
    if (posbleswap2 == "AA")
    {
        cout << posbleswap1;
        cout << " ";
        cout << resultswap << endl;
        cout << "-";
        return 0;
    } else 
    for (int i = 0; i < orgstr.length(); i++)
    {
        currentltr = orgstr[i];
        currentltr2 = newstr[i];
        if (currentltr == posbleswap1)
        {
            if (currentltr2 == resultswap)
            {
                cout << posbleswap1 << " " << resultswap << endl << posbleswap2;
                return 0;
            } else 
            {
                cout << posbleswap2 << " " << resultswap << endl << posbleswap1;
                return 0;
            }
        } else if (currentltr == posbleswap2)
        {
            if (currentltr2 == resultswap)
            {
                cout << posbleswap2 << " " << resultswap << endl << posbleswap1;
                return 0;
            } else 
            {
                cout << posbleswap1 << " " << resultswap << endl << posbleswap2;
                return 0;
            }
        }
    }

    return 0;
}