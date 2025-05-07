#include <bits/stdc++.h>
using namespace std;

map<int, int> tlist;
vector <int> nlist = {};

void increment(){
    for (int i = 0; i < nlist.size(); i++)
    {
        tlist[nlist[i]]++;
    }
}
void wait(int a){
    for (int i = 0; i < nlist.size(); i++)
    {
        tlist[nlist[i]] += a;
    }
}
void remoove(int m){
    for (int i = 0; i < nlist.size(); i++)
    {
        if (nlist[i] == m)
        {
            vector<int>::iterator bbc = nlist.begin() + i;
            nlist.erase(bbc);
        }
    }
}

int main(){

    int M;
    cin >> M;
    for (int i = 0; i < M; i++)
    {   
        char a;
        int x;
        cin >> a >> x;
        if (a == 'R')
        {
            nlist.push_back(x);
            increment();
        } else if (a == 'W')
        {
            wait(x-1);
        } else if (a == 'S') 
        {
            remoove(x);
            increment();
        }
    }
    for (int i = 0; i < nlist.size(); i++)
    {
        tlist[nlist[i]] = -1;
    }
    for (int i = 0; i < 101; i++)
    {
        if (tlist[i] != 0)
        {
            cout << i << ' ' << tlist[i] << endl; 
        }
    }
    
    return 0;
}