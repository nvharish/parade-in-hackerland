# parade-in-hackerland
Parade in HackerLand
The people in HackerLand, are getting ready for a parade, and the participants are all mixed up. There should be no instance where a red uniform is immediately to the left of a blue one.
<br/>
Given a binary string, 0 denotes a person in red uniform and 1 denotes a person in blue uniform. The goal is to remove any occurrence of "01" in the binary string. More formally, at each second, all the substrings <i>"01"</i> in the string s are changed to <i>"10"</i> is present in the string. All the substrings <i>"01"</i> in the current state of s are changed at the same time.
<br/>
Find the number of seconds it takes for this process to stop.
<br/>
<b>Example</b>
<br/>
<i>color = "001011"</i>
<br/>
Here is a simulation of the process where t denotes the current time.
<i>t = 0, color = "001011"<br/>
t = 1, color = "010101"<br/>
t = 2, color = "101010"<br/>
t = 3, color = "110100"<br/>
t = 4, color = "111000"</i>
<br/>
Hence this process takes 4 seconds.
<br/>
<b>Constraints</b>
1 <= <i>|color|</i> <= 3 * 10<sup>5</sup> where <i>|color|</i> denotes the size of the binary string.
