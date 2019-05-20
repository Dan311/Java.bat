public int close10(int a, int b) {
  
  int closeOne;
  int closeTwo;
  
  closeOne = (Math.abs(a - 10));
  closeTwo = (Math.abs(b - 10));
  
  if (closeOne == closeTwo) {
    return 0;
  }
  if (closeOne < closeTwo) {
    return a;
  } else {
    return b;
  }
}