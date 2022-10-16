package Java.Lesson001;

public class SecondTask {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int mark = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != val) {
                nums[mark] = nums[i];
                mark++;
            }
        }
        return mark;
    }
}
