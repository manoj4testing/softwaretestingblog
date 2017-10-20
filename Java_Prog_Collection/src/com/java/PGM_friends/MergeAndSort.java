package com.java.PGM_friends;

public class MergeAndSort {
	public static int[] merge(int[] a, int[] b) {

	    int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            answer[k] = a[i];
	            i++;
	        }
	        else
	        {
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length)
	    {
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length)
	    {
	        answer[k] = b[j];
	        j++;
	        k++;
	    }

	    return answer;
	}
	public static void main(String[] args) {
		MergeAndSort ms = new MergeAndSort();
		int[] a = {13,21,8,15};
		int[] b = {32,56,16,22};
		System.out.println(ms.merge(a, b));
		
	}
}