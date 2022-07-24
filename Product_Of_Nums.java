import java.util.*;

class Product_Of_Nums{
	
	public static void main(String[] args){
		Product_Of_Nums pon = new Product_Of_Nums();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter array of numbers (ex 3,6,2) > ");
		String s = in.nextLine();
		String[] sa = s.split(",");
		int[] nums = new int[sa.length];
		for(int i=0; i<nums.length; i++){
			nums[i] = Integer.parseInt(sa[i]);
		}
		pon.solve(nums);
	}
	
	private void solve(int[] nums){
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++){
			int product = 1;
			for(int j=0; j<nums.length; j++){
				if(j != i){
					product = product * nums[j];
				}
			}
			ans.add(product);
		}
		System.out.println(ans);
	}
}
