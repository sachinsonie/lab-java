public class array {
    
    public static int add(int nums[]) {
        int result = 0;
        for(int a : nums) {
            result = result + a;  // You should use 'a' instead of 'nums[a]'
            
        }
        return result;  // You need to return the 'result' from the method
    }
    
    public static void main(String[] args) {
        int nums[] = {5, 6, 7, 7};
        int sum = add(nums);  // Call the 'add' method and store the result
        System.out.println("Sum of array elements: " + sum);
    }
}
