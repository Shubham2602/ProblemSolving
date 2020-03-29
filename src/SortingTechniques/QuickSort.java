package SortingTechniques;

public class QuickSort {
	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		String[] arr = { "abcd","dcba","efgh","gfeh"};
		System.out.println(qs.distinctPasswords(2, arr));

	}

	public String swap(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Replacing " + i + " with " + j);
		sb.setCharAt(i, str.charAt(j));
		sb.setCharAt(j, str.charAt(i));
		return sb.toString();
	}

	public Boolean isAtoZAllSmall(int input1, String[] input2) {
		for (int i = 0; i < input1; i++) {
			String str = input2[i];
			for (int j = 0; j < str.length(); j++) {

				if (!((int) str.charAt(j) >= 97 && (int) str.charAt(j) <= 122)) {
					return false;
				}
			}
		}
		return true;
	}

	public int distinctPasswords(int input1, String[] input2) {

		if (!isAtoZAllSmall(input1, input2)) {
			return 0;
		}
		int count1 = 0, count2=0,count3=0;
		for (int k = 0; k < input1; k++) {
			String str = input2[k];
			// System.out.println("Swap : ");
			if (str.length() > 2) {
				for (int i = 0; i < str.length() - 2; i++) {
					// if((i+i+2%2)==0) {
					str = swap(str, i, i + 2);
					// }
					// System.out.println("Swap : " + str);
					int tmp = 0;
					for (int j = 0; j < input1; j++) {
						// System.out.println("Str is : " + str);
						// System.out.print("Compared against : " );
						// for(String s: input2) {System.out.print(s + " ");}
						// System.out.println();
						if (input2[j].equals(str)) {
							tmp++;
						}
					}
					// System.out.println("Value of tmp : " + tmp);
					if (tmp == 0)
						count1++;
					else
						tmp = 0;
				}
				
			} else {
				
				if (str.length() == 1) {
					
					for (String s : input2) {
						if (!s.equals(str))
							count2++;
					}
					//count2 = count2/2;
				}else {
					for (String s : input2) {
						if (!s.equals(str))
							count3++;
					}
					//count3 = count3/2;
				}
				
			}
		}

		return (count1/2+count2/2+count3/2);

	}
}
