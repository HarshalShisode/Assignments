function reverseWords(sentence) {
  // Split the sentence into words using a space as the delimiter
  const words = sentence.split(' ');

  // Create an array to store the reversed words
  const reversedWords = [];

  // Iterate through each word and reverse it
  for (const word of words) {
    let reversedWord = '';
    for (let i = word.length - 1; i >= 0; i--) {
      reversedWord += word[i];
    }
    reversedWords.push(reversedWord);
  }

  // Join the reversed words to form the final reversed sentence
  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

// Example usage:
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence); // Output: "sihT si a ynnus yad"
