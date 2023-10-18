package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static int sum(int[] arr) {
        int res = 0;

        for (int n: arr) {
            res += n;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in_data = scanner.nextLine().trim().split(" ");
        int len = in_data.length;
        int[] nums = new int[len - 1];

        for (int i = 0; i < len - 1; i++) {
            nums[i] = Integer.parseInt(in_data[i]);
        }

        System.out.println(sum(nums) / (len - 1));
    }

}