package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}

public static void switchCasePrimer() {
    	int caseIndex = 0;
    	switch (caseIndex) {
        	case 0:
            	System.out.println("Zero");
        	case 1:
            	System.out.println("One");
            	break;
        	case 2:
            	System.out.println("Two");
            	break;
        	default:
            	System.out.println("Default");
    	}
}

public class Bird {
  
    void fly() {
        System.out.println("Flying!!");
    }
}
  
public class Ostrich extends Bird {
  
    void fly() {
        throw new IllegalStateException("An ostrich can't fly");   
    }
}


def all_unique(lst):
    return len(lst) == len(set(lst))


x = [1,1,2,2,3,2,3,4,5,6]
y = [1,2,3,4,5]
all_unique(x) # False
all_unique(y) # True
