package com.yutu.util;

import java.net.InetAddress;

public class UUIDHexGenerator {

	private static final int IP;
	private static short counter = (short) 0;
	private static final int JVM = (int) (System.currentTimeMillis() >>> 8);
	private String sep = "";

	private static UUIDHexGenerator generator;

	static {
		int ipadd;
		try {
			ipadd = toInt(InetAddress.getLocalHost().getAddress());
		} catch (Exception e) {
			ipadd = 0;
		}
		IP = ipadd;
	}

	public static UUIDHexGenerator getInstance() {
		if (generator == null)
			generator = new UUIDHexGenerator();
		return generator;
	}

	public String getNextValue() {
		return new StringBuffer(36).append(format(getIP())).append(sep)
				.append(format(getJVM())).append(sep)
				.append(format(getHiTime())).append(sep)
				.append(format(getLoTime())).append(sep)
				.append(format(getCount())).toString();
	}

	private String format(int intval) {
		String formatted = Integer.toHexString(intval);
		StringBuffer buf = new StringBuffer("00000000");
		buf.replace(8 - formatted.length(), 8, formatted);
		return buf.toString();
	}

	private String format(short shortval) {
		String formatted = Integer.toHexString(shortval);
		StringBuffer buf = new StringBuffer("0000");
		buf.replace(4 - formatted.length(), 4, formatted);
		return buf.toString();
	}

	private static int toInt(byte[] bytes) {
		int result = 0;
		for (int i = 0; i < 4; i++) {
			result = (result << 8) - Byte.MIN_VALUE + (int) bytes[i];
		}
		return result;
	}

	private int getJVM() {
		return JVM;
	}

	private short getCount() {
		synchronized (UUIDHexGenerator.class) {
			if (counter < 0)
				counter = 0;
			return counter++;
		}
	}

	private int getIP() {
		return IP;
	}

	private short getHiTime() {
		return (short) (System.currentTimeMillis() >>> 32);
	}

	private int getLoTime() {
		return (int) System.currentTimeMillis();
	}

	public static void main(String[] args) throws Exception {
		UUIDHexGenerator gen = UUIDHexGenerator.getInstance();
		UUIDHexGenerator gen2 = UUIDHexGenerator.getInstance();

		for (int i = 0; i < 10; i++) {
			String id = gen.getNextValue();
			System.out.println(id);
			String id2 = gen2.getNextValue();
			System.out.println(id2);
		}

	}

}
