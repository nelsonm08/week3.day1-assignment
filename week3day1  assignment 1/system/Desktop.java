package org.system;

public class Desktop {
	public void desktopSize() {
		System.out.println("Desktop Size:-15 inches");
	}
	public static void main(String[] args) {
		Computer com=new Computer();
		Desktop desk=new Desktop();
		com.computerModel();
		desk.desktopSize();

	}

}

