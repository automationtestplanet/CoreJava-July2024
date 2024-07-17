package fundamentals;

public class TypeConversionWithWrapperClasses {

	public static void main(String[] args) {
		
		System.out.println("----------------Non-Primitive to Primmitive-----------");
		 String str1 = "100";		 
//		 byte byte1 = (byte)str1; // Explicit Conversion		 
		 byte byte1 = 10;
		 
		 Byte byteCls1 = byte1;		 
		 byte1 = byteCls1;		 
		 byte1 = Byte.parseByte(str1);
		 
//		 int int1 = (int)str1; //Explicit conversion
		 
		 int int1 = Integer.parseInt(str1);		 
		 short short1 = Short.parseShort(str1);
		 long long1 = Long.parseLong(str1);
		 float float1 = Float.parseFloat(str1);
		 double double1 = Double.parseDouble(str1);
		 
		 String str2 = "flase";
		 boolean bool1 = Boolean.parseBoolean(str2);
		 
		 System.out.println("----------------Primitive to Non-Primmitive-----------");
		 
		 boolean bool2 = true;		 
		 String boolStr = String.valueOf(bool2);
		 
		 int int2 = 1000;
		 String intStr = String.valueOf(int2);
		 
		 char ch = 'A';
		 String charStr = String.valueOf(ch);
		 
		 

	}

}
