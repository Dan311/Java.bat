
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"

public String theEnd(String str, boolean front) {
  int strLen = str.length();
  if(front = true) {
    return str.substring(0,1);
  } else {
    return str.substring(strLen-1, strLen);
  }
}