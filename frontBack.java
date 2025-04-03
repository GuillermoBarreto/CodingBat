//Given a string, return a new string where the first and last chars have been exchanged.

//frontBack("code") -> "eodc"
//frontBack("a") -> "a"
//frontBack("ab") -> "ba"
 
String frontBack(String str) {
    int len = str.length();
    if (len <= 1) {
        return str;
    }
    return str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0);
}