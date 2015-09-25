# numberprettifier

This a number to string prettifier, i.e. it transforms numbers based on the 
short scale(https://en.wikipedia.org/wiki/Long_and_short_scales). For example 1000000 
will be transformed into 1M.

## Installation

You will need a JDK to build the system. See: https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html
for instructions on how to install the JDK on you machine. 
You also need Leiningen(for instruction on how to install Leiningen see: http://leiningen.org/).

- Download the source code from https://github.com/alinposho/numberprettifier.
- Navigate to the folder where you cloned the repository
- Run "lein uberjar"


## Usage

You will need Java installed on your system to run the application. 
For instructions on how to install Java see: https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html 

    $ java -jar numberprettifier-0.1.0-standalone.jar $number

Replace $number with a number to be prettified. 

## Options

In order to make things easier for the user I have added a runnable jar version of the application in the GitHub 
repository. This way you need just Java running on your system to run the application. 

## Examples

$ java -jar numberprettifier-0.1.0-standalone.jar 1000000
;; The prettified version of the number is=1M

### See also doc/intro.md

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
