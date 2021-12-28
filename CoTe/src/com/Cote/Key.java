package com.Cote;

import java.util.Arrays;

public class Key {
	public static void main(String[] args) {
		String answer = "";
		int[] numbers = { 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "right";

		int[] left = { -1 ,1, 4, 7, 0 };
		int[] right = { -1 ,3, 6, 9, 0 };
		int[] centerKey = {-1, 2, 5, 8, 0 };

		int currentLeft = 0;
		int currentRight = 0;
		int locationL = 0;
		int locationR = 0;

		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println("현재 진행중인 숫자:"+numbers[i]);
			
			if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
				answer += "l";

				currentLeft = Arrays.binarySearch(left, numbers[i]);
				System.out.println("현재 왼손 위치:"+currentLeft);

			} else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
				answer += "r";

				currentRight = Arrays.binarySearch(right, numbers[i]);
				System.out.println("현재 오른손 위치:"+currentRight);
			} else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
				System.out.println("현재 왼손 위치:"+currentLeft);
				System.out.println("현재 오른손 위치:"+currentRight);
				int currentMiddle = Arrays.binarySearch(centerKey, numbers[i]);
				System.out.println("중간위치:"+currentMiddle);
				locationL = Math.abs(currentMiddle - currentLeft);
				locationR = Math.abs(currentMiddle - currentRight);
				
				System.out.println("왼손 거리계산:"+locationL);
				System.out.println("오른손 거리계산:"+locationR);
				if (locationL == locationR) {
					answer += hand.charAt(hand.length() - 4);
				} else if (locationL < locationR) {
					answer += "l";
					currentLeft = Arrays.binarySearch(centerKey, numbers[i]);
				} else if (locationR < locationL) {
					answer += "r";
					currentRight = Arrays.binarySearch(centerKey, numbers[i]);
				}
			}

			System.out.println(answer);

		}

		System.out.println(hand.charAt(0));
		System.out.println(locationR);
		System.out.println(locationL);
		System.out.println(answer);

	}
}
