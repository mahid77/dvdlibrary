package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataStoreFile {

    private File file;

    public DataStoreFile(String fileName) {
        this.file = new File(fileName);
    }

	public boolean init() throws DataStoreException {
		try {
			return file.createNewFile();
		} catch (IOException e) {
			throw new DataStoreException("Could not create file: " + file.getAbsolutePath(), e);
		}
	}

	public Scanner getReader() throws DataStoreException {
		try {
            init();
			return new Scanner(new BufferedReader(new FileReader(file)));
		} catch (FileNotFoundException e) {
			throw new DataStoreException("Could not access file: " + file.getAbsolutePath(), e);
		}
	}

    public PrintWriter getWriter() throws DataStoreException {
		try {
			return new PrintWriter(new FileWriter(file));
		} catch (IOException e) {
			throw new DataStoreException("Could not write file: " + file.getAbsolutePath(), e);
		}
    }
}
