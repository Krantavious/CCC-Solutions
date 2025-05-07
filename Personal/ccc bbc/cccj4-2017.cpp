#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cin >> n;
    int n2 = n;
    int ans = 0;
    if (n > 720)
    {
        while (n2 > 720)
        {
            ans += 31;
            n2 -= 720;
        }
    }
    if (n2 >= 60)
    {
        ans++;
        n2 -= 60;
    } else if (n2 >= 34)
    {
        ans++; 
        cout << ans;
        return 0;
    } else
    {
        cout << ans;
        return 0;
    }
    n2++;
    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 10; j++)
        {
            if(i == 0 && j == 0)
            {
                ans-=5;
                n2+=60;
            }
            for (int k = 0; k < 6; k++)
            {
                for (int l = 0; l < 10; l++)
                {
                    /*if (n2 == 0)
                    {
                        cout << ans;
                        return 0;
                    }*/
                    if (i == 0)
                    {
                        if( l - k == k - j )
                        {
                            //cout << i << j << k << l << endl;
                            ans++;
                        }
                    } else 
                    {
                        if (l - k == k - j && k - j == j - i)
                        {
                            //cout << i << j << k << l << endl;
                            ans++;
                        }
                    }
                    n2--;
                    if (n2 == 0)
                    {
                        cout << ans;
                        return 0;
                    }
                }
            }          
        }        
    }
    

    return 0;
}