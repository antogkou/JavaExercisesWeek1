Exercises on simple algorithms
1. Write a program that calculates the factorial of a number n
(n!).
2. Find the maximum value of n as int so that the calculated
output is valid.
3. Write a program that returns true or false depending on if
the number is prime or not.
4. Write a program that, for a given n, it calculates the
following value: 1 + ½ + ⅓ + … + 1/n.
5. Write a program that counts the digits of a long number.
6. Given a positive float number, print its decimal part. For
example, given the number 2.31, the output should be 0.31.

Exercises on arrays, collections
1. Given a list of integers, return a sub list that contains only the
prime numbers
2. Implement a way of finding a list eliminating the duplicates
from a list.
3. Write a program that returns the digits of number in
descending order.
4. Implement your own version of a stack and its main
functionalities (pop, push, peek)
5. Reverse a string using only a stack .
6. Write a program that check if a word is symmetric, ignoring
cases (i.e. AbdBa is symmetric).

String class exercise
Write a program that checks if the following criteria for a
given password are met:
1. Password contains at least one uppercase character
2. Password contains at least one lowercase character
3. Contains at least one number
4. Contains at least one special character (e.g., !, _ etc)
5. Password length must be at least 8 characters long
6. Cannot contain a sequence of 3 same characters (i.e.
aaa) or a sequence of 3 consecutive characters (i.e abc)

String class exercise (cont.)
• To accept a password, at least 3 out of 6 criteria must be
met, and criterion 5 is mandatory
• If 3,6 or 4,6 criteria are met, print “Password OK”
• If 5,6 criteria are met, print “Strong password”
• If all criteria are met, print “Very Strong password”
• If the password is not acceptable, meaning that less than 3,6
criteria are met or criterion 5 is not met, print “Invalid
password” and a message with all the password
requirements.
• You may use regular expressions, as explained in next slide.

RegEx
^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\S+$).{8,}$
Explanation:
^ # start-of-string
(?=.*[A-Z]) # an upper case letter must occur at least once
(?=.*[a-z]) # a lower case letter must occur at least once
(?=.*[0-9]) # a digit must occur at least once
(?=.*[@#$%^&+=]) # a special character must occur at least once
.{8,} # anything, at least eight places though
(?i)(?:([a-z0-9])\\1{2,})* #sequence of identical characters
(?=\S+$) # no whitespace allowed in the entire string
$ # end-of-string
String passwd = "aaZZa44@";
String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
System.out.println(passwd.matches(pattern));
