package com.shree;

abstract class car{
	abstract void musicplayer();
}

class JBL extends car{
	public void musicplayer(){
		System.out.println("Bass 50, trouble70, high vol 100");
	}
}

public class AbstractionTask2 {
	public static void main(String[] args) {
		JBL b = new JBL();
		b.musicplayer();
	}

}
