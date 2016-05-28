package com.codinggame;

import java.util.*;

class ScynetVirus {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // the total number of nodes in the level, including the gateways
        int L = in.nextInt(); // the number of links
        int E = in.nextInt(); // the number of exit gateways

        Map<Integer, List<Integer>> links = new HashMap<>(N);
        for (int i = 0; i < L; i++) {
            int N1 = in.nextInt(); // N1 and N2 defines a link between these nodes
            int N2 = in.nextInt();
            System.err.println("Available link: " + N1 + "  " + N2);

            if (!links.containsKey(N1)) {
                links.put(N1, new ArrayList<>(N));
            }
            links.get(N1).add(N2);

            if (!links.containsKey(N2)) {
                links.put(N2, new ArrayList<>(N));
            }
            links.get(N2).add(N1);
        }

        List<Integer> gateways = new ArrayList<>(E);
        for (int i = 0; i < E; i++) {
            int EI = in.nextInt(); // the index of a gateway node
            System.err.println("Loaded gateway: " + EI);
            gateways.add(EI);
        }

        // game loop
        while (true) {
            Integer SI = in.nextInt(); // Skynet agent this turn
            Integer GATE = gateways.get(0);
            Integer NODE = -1;
            System.err.println("SI: " + SI);
            System.err.println("Blocking gateway: " + GATE);
            System.err.println("Looking for endangered connections first: " + links.get(GATE));

            if (!links.get(GATE).isEmpty()) {

                if (links.get(GATE).contains(SI)) {
                    System.err.println("Endangered found! " + SI);
                    links.get(GATE).remove(SI);
                    NODE = SI;
                }

                if ( NODE == -1) {
                    System.err.println("Looking for common nodes first: " + SI);
                    for (int i = 0; i < links.get(SI).size() && NODE == -1; i++) {
                        if (links.get(GATE).contains(links.get(SI).get(i))) {
                            Integer node = links.get(SI).get(i);
                            links.get(GATE).remove(node);
                            System.err.println("Common found: " + node);
                            NODE = node;
                        }
                    }
                }

                if ( NODE == -1) {
                    NODE = links.get(GATE).remove(0);
                }
                System.err.println("SOLUTION: " + GATE + " " + NODE);
                System.out.println(GATE + " " + NODE);
            }
        }
    }
}