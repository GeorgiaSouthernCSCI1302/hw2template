# hw2: All Athletes
#Due: Sunday 11:59 pm. 

                                    
Implement the Athlete, Swimmer and Golfer classes shown in the A2_Diag.png UML diagram. 

The Athlete is an abstract class with a single constructor. The Athlete class also includes the abstract methods "String toString()" and "String getLevel()". 
Athlete class stores the name as a String, the gender as a char, Professional/Amateur status as a boolean and date of birth is stored in a "java.time.LocalDate" object. 

The method getIsAPro returns true if the athlete plays professionally, false otherwise. The setIsAPro takes a boolean parameter, true if the athlete is a professional, false otherwise.

The method getGender return either the word "male" or "female". The method setGender accepts 'm', 'M', 'f' or 'F' which denotes male or female. 

The method getAge returns the athletes age as of today's date as a string of the form "X years, Y months and Z days". e.g. "21 years, 2 months and 3 days".

The Swimmer class inherits from the Athlete class. The Swimmer class stores the name of the swimmer's team as a String, and swim events for the swimmer. A swimmer participates in one or more of these events, enumeration is provided with the limited list of events.  

The getLevel method returns "professional swimmer" if isAPro is true, otherwise returns "amateur swimmer"

The setEvent method is oveloaded and sets either a single event for the swimmer or set a group of events for the swimmer 

The toString method returns a string in the form: 
"<name-of-swimmer> is a <gender-of-swimmer> for team: <team-name-of-swimmer> in the following events: <swim-event1>; <swim-event2>; ...	 
<name-o-swimmer> is <swimmer-years-since-birth> years, <swimmer-months-since-last-birthday> months and <swimmer-days-since-last month> days old."
The equals method returns true if the name and date of birth of this swimmer and the compared other swimmer are the same, otherwise return false. 

The Golfer class inherits from the Athlete class. The Golfer class stores a golf handicap value as a whole number.

The getLevel method returns the string "professional golfer" if isAPro is true, otherwise returns "amateur golfer".

The toStrig method returns a String in the form:
"<name-of-golfer> is a <gender-of-golfer> with a handicap of <handicap-of-golfer>.
<name-of-golfer> is <golfer-years-since-birth> years, <golfer-months-since-last-birthday> months and <golfer-days-since-last month> days old."

The equals method returns true if the name and handicap of this golfer and compared other golfer are the same, otherwise return false 



