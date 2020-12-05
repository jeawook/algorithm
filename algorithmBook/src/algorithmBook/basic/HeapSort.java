package algorithmBook.basic;

import java.util.Scanner;

class HeapSort {
	
	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	static void downHeap(int[] a, int left, int right) {
		System.out.println("left = " + left);
		System.out.println("right = " + right);
		int temp = a[left]; // 루트
		int child;			// 큰 값을 가진 노드
		int parent;			// 부모
		
		for(parent = left; parent < (right+1)/2;parent = child){
			int cl = parent * 2 + 1;							// 왼쪽 자식
			int cr = cl +1;										// 오른쪽 자식
			System.out.println("cr = " + cr);
			System.out.println("cl = " + cl);
			child = (cr <= right && a[cr] > a[cl]) ? cr: cl;	// 큰 값을 가진 노드를 자식에 대입
			if (temp >= a[child])
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	static void heapSort(int[] a, int n){
		for(int i = (n -1)/2; i >= 0;  i--){		//a[i] ~ a[i -1]을 힙으로 만들기
			downHeap(a, i, n-1);
		}
		for (int i=n-1;i>0;i--){
			swap(a, 0, i);						// 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
			downHeap(a, 0, i-1);			// a[0] ~ a[i-1]을 힙으로 만듭니다.
		}
	}

	public static void main(String[] args) {
		int[] list = {10,9,8,7,6,5,4,3,2,1};
		int n = 10;

		heapSort(list,n);

		for (int x : list){
			System.out.println("x = " + x);
		}
	}

}
