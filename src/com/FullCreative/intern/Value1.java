package com.FullCreative.intern;

public class Value1 {
	int a;
	static int b;
	Value1(){
		this.a=29;
		this.b=88;
	}
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Value1 ref=new Value1();
		ref.a=22;
		int a;
		{
			a=10;
		}
		System.out.println(a);
		System.out.println(ref.b);
		System.out.println(ref.a);
	}
}
