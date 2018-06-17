package com.greenfoxacademy.gfclass.services;

import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int size() {
        return names.size();
    }

    public String find(String s) {
        int number=names.indexOf(s);
        String result;
        if (number>=0) {
            result=" is already in the list.";
        } else {
            result=" is not in the list.";
        }
        return result;
    }

    public void export() {
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileWriter("studentList.txt"));
            for (String text : names) {
                out.write (text + "\r\n");
            }
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());

        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
}
