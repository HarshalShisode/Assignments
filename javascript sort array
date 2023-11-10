function bubbleSortDescending(arr) {
  const n = arr.length;
  let swapped;

  do {
    swapped = false;

    for (let i = 0; i < n - 1; i++) {
      if (arr[i] < arr[i + 1]) {
        // Swap the elements if they are in the wrong order (descending order)
        const temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swapped = true;
      }
    }
  } while (swapped);

  return arr;
}

// Example usage:
const arrayToSort = [5, 2, 9, 1, 5, 6];
const sortedArray = bubbleSortDescending(arrayToSort);
console.log(sortedArray); // Output: [9, 6, 5, 5, 2, 1]
