package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenTree {
    private static final boolean READ_FILE = true;

    private static class Node {
        int n;
        List<Node> c = new ArrayList<>();

        Node(int v){
            this.n = v;
        }

        void addChild(Node node){
            c.add(node);
        }

        int countVertices() {
            if (c.isEmpty()) {
                return 0;
            } else {
                int count = c.size();
                for (Node aC : c) {
                    count += aC.countVertices();
                }
                return count;
            }
        }
    }

    private static Scanner getScanner() throws FileNotFoundException {
        if (READ_FILE){
            File f = new File("inputs/even-tree.txt");
            return new Scanner(new FileInputStream(f));
        }
        return new Scanner(System.in);
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = getScanner();
        int nodes = in.nextInt();
        int edges = in.nextInt();

        Node[] allNodes = new Node[nodes+1];
        for(int i = 0; i < edges; i++){
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            if (allNodes[n1] == null){
                Node n = new Node(n1);
                allNodes[n1] = n;
            }

            if (allNodes[n2] == null){
                Node n = new Node(n2);
                allNodes[n2] = n;
            }

            allNodes[n2].addChild(allNodes[n1]);
        }

        int maxRemoved = 0;
        for (int j = 1 ; j < allNodes.length; j ++) {
            for (int i = 0; i < allNodes[j].c.size(); i++) {
                if ((allNodes[j].c.get(i).countVertices() + 1) % 2 == 0) {
                    maxRemoved++;
                }
            }
        }
        System.out.println(maxRemoved);
    }
}
