package com.saurabh;
// https://leetcode.com/problems/flipping-an-image
class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image) {
          // Assuming the image is a 2D array declared and initialized somewhere in your code
// int[][] image = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

// // Traditional for loop for iterating over a 2D array
// for (int i = 0; i < image.length; i++) {
//     int[] row = image[i]; // Access the current row at index 'i'
    
//     // Now you can work with the elements in the current row
//     for (int j = 0; j < row.length; j++) {
//         int element = row[j]; // Access the current element in the row at index 'j'
//         System.out.print(element + " "); // Print the element
//     }
//     System.out.println(); // Move to the next line after printing all elements of the row
// }

            // reverse this array
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                // swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }
}
