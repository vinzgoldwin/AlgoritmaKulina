#include <iostream>

using namespace std;

int main(){
	long point = 10;
	int x;
	cin >> x;
	while (x/point > 0){
		point*=10;
		}
	point/=10;
	while ( point >= 1){
		int tmp = x/point*point;
		cout << tmp << endl;
		x-=tmp;
		point/=10;
		}
}


