package com.udr013;

public class WrapperClasses {

    public static void main(String[] args) {

        //Boolean boolean = true; //keyword
        Boolean a = true;
        Boolean b = new Boolean(true);
        Boolean c = Boolean.valueOf("true");
        Boolean d = Boolean.valueOf(true);
        Boolean e = new Boolean("true");
        Boolean f = new Boolean("TrUe"); //true

        Byte by = new Byte((byte)10); //10 is interpreted as int so cast needed
        Byte cy = 10;
        Byte dy = Byte.valueOf((byte)10);//10 is interpreted as int so cast needed
        Byte ey = Byte.valueOf("10");

        Short sa = new Short((byte)10);
        Short sb = new Short((short)10);

        Double dd = new Double(10);
        Long la = new Long(10);
        Float Fa = new Float(10);

        Character ca = new Character('z');
        Character cb = new Character((char)12);
//        Character cc = new Character("z"); // won't compile

        Long var1 = 123L;
        Long var2 = 123L;

        Long var3 = 128L;
        Long var4 = 128L;
        Integer var5 = 128;

        System.out.println(var1 == var2); //true , from cache
        System.out.println(var3 == var4); // false new reference
        System.out.println(var3.equals(var4));
        System.out.println(var4.equals(var5)); //different objects are never equal
    }
}
