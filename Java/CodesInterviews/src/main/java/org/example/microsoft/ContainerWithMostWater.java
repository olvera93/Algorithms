package org.example.microsoft;

public class ContainerWithMostWater {

    public int maxArea(int [] height) {
        int maxArea = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            maxArea = Math.max(maxArea, Math.min(height[l], height[r])* (r - l));

            if (height[l] < height[r]) {
                l += 1;
            } else {
                r -=1;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(height));
    }
}
