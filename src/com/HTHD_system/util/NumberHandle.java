package com.HTHD_system.util; 
public class NumberHandle { 
public final static boolean isParseInt(String s, int radix) { 
if (s == null) { 
return false; 
} 
if (radix < Character.MIN_RADIX) { 
return false; 
} 
if (radix > Character.MAX_RADIX) { 
return false; 
} 
int result = 0; 
boolean negative = false; 
int i = 0, max = s.length(); 
int limit; 
int multmin; 
int digit; 
if (max > 0) { 
if (s.charAt(0) == '-') { 
negative = true; 
limit = Integer.MIN_VALUE; 
i++; 
} else { 
limit = -Integer.MAX_VALUE; 
} 
multmin = limit / radix; 
if (i < max) { 
digit = Character.digit(s.charAt(i++), radix); 
if (digit < 0) { 
return false; 
} else { 
result = -digit; 
} 
} 
while (i < max) { 
digit = Character.digit(s.charAt(i++), radix); 
if (digit < 0) { 
return false; 
} 
if (result < multmin) { 
return false; 

} 
result *= radix; 
if (result < limit + digit) { 

return false; 
} 
} 
} else { 
return false; 
} 
if (negative) { 
if (i > 1) { 
return true; 
} 
return false; 
} 
return true; 
} 

public static final String generatorRandom(int digit)
{
	long base = (long) Math.pow(10, digit);
	long random = (long) (Math.random()*base);
	if(random<base/10)
	{
		random = random + base/10;
	}
	
	String number = random + "";
	return number;
}

}