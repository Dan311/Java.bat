public String middleTwo(String str) {
  int strLen = str.length();
  int halfLen;
  if(str.length() < 2);
    return "";
  halfLen = (strLen/2);
  return str.substring(halfLen, halfLen +1);
}