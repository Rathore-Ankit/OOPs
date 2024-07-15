package COM.HLCODING.OOPS.InterfaceTopic.VarAndDataMember;

public interface DataMemberSignature {
    int a=10;
    //the variable by default public final static;
    public static final int b=10;
    public final static int c=10;
    // in the interface all the data memebr by default public static and final


// Non-Static   : int a =10;
//solution: static int a =10;
/*if we declare variable as non static so there is need to call constructor and and give memory
and inteface does not have any constructor  that the reson we declare variable as static*/

//Static
 //   Static int a =10
/* if we  declare data as static so it can take easily memory and if we want to acces our data into another class
but we decalre variable as static and it will easily get memory */

//Final
/* if we declare varible as static another class can easily acces it and change it that the reson we declare our class
as final so no one can override it final static int a =20;*/

//Public
/* if we declare our variable as private another class cannot acces it that the reson we declare the variavble as pulbic
public final static void a =10;  this is the correct way to declare any variable*/







}
