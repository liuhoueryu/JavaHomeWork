package com.homework;

import java.util.Scanner;

public class Homework001 {

	public static void main(String[] args) {
		// TODO Auto1-1generated method stub
		reverse();
	}
	public static void reverse() {
		Scanner sc = new Scanner(System.in);

		int temp;
		System.out.println("���������ĸ���:");
		int i = sc.nextInt();
		System.out.println("������" + i + "����:");
		int[] array = new int[i];
		for (int j = 0; j < i; j++)
			array[j] = sc.nextInt();

		System.out.println("ԭ����Ϊ��");
		for (int k = 0; k < i; k++) {
			if(k==0)
				System.out.print(array[k]);
			else
				System.out.print(" "+array[k]);
		}
		System.out.println();
		for (int l = 0; l < i/2; l++) {
			temp = array[l];
			array[l] = array[i - 1 - l];
			array[i - 1 - l] = temp;
		}
		System.out.println("��ת����Ϊ��");
		for (int m = 0; m < i; m++) {
			if(m==0)
				System.out.print(array[m]);
			else
				System.out.print(" "+array[m]);
		}
	}
}