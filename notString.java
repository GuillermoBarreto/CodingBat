// Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


// notString("candy") → "not candy"
// notString("x") → "not x"
// notString("not bad") → "not bad"

public String notString(String str) {
    if (str.startsWith("not")) {
        return str;  // If the string already starts with "not", return it unchanged
    } else {
        return "not " + str;  // Otherwise, prepend "not" to the string
    }
}3