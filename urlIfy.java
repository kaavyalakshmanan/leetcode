 // Algorithm: manipulate char array in-place
 // Running time: O(n)
 // Additional space: O(1)
 
 public static char[] urlIfy(char[] str, int trueLength) {
    int j = trueLength-1;
    int i = str.length-1;
    while (j >= 0) {
      if (str[j] != ' ') {
        str[i] = str[j];
        i-=1;
      }
      else {
        str[i] = '0';
        str[i-1] = '2';
        str[i-2] = '%';
        i-=3;
      }
      j-=1;
    }
    return str;
}
