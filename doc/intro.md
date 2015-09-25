# Introduction to numberprettifier


This project accomplishes the following task:
Write tested code (any language) that accepts a numeric type and returns a truncated,
"prettified" string version. The prettified version should include one number after
the decimal when the truncated number is not an integer. It should prettify numbers
greater than 6 digits and support millions, billions and trillions. You should use
short scale number to output the prettified number.

Example(input => output):

1000000         => 1M
2500000.35      => 2.5M
532             => 532
1123456789      => 1.1B

# Design considerations

 - I followed the YAGNY principle while completing this task.
 - In the spirit of the YAGNY principle I did not design this to be a web application, since there was no requirement for that.
 - The application is a standalone Java/Clojure console application. 
 - I did not think it necessary to have a design document attached to this project since there is only one function, and helpers, performing the task, plus tests.

