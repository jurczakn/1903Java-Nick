package com.revature.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankUserSerializer {

	private static final String FILENAME = "bank_user.dat";

	public void serializeUser(com.revature.beans.BankUser bankUser) {

		FileOutputStream fileOut = null;

		try {

			fileOut = new FileOutputStream(FILENAME);

			// fileOut.write("Some text".getBytes());

			ObjectOutputStream out = new ObjectOutputStream(fileOut);

			out.writeObject(bankUser);

			fileOut.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileOut != null) {
				try {
					fileOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

}
