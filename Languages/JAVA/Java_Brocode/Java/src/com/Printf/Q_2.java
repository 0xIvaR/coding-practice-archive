package com.Printf;

public class Q_2 {
    public static void main(String[] args) {

        String stats1 = "SERVER NAME";
        String stats2 = "CPU USAGE";
        String stats3 = "MEMORY RATE";

        String server1 = "Server-A";
        String server2 = "server-B";
        String server3 = "Server-C";

        int cpu1 = 59;
        int cpu2 = 67;
        int cpu3 = 37;

        int mem1 = 62;
        int mem2 = 71;
        int mem3 = 86;

        System.out.printf("%-15s%15s%15s\n", stats1, stats2, stats3);
        System.out.printf("%-15s%15d%15d\n", server1, cpu1, mem1);
        System.out.printf("%-15s%15d%15d\n", server2, cpu2, mem2);
        System.out.printf("%-15s%15d%15d\n", server3, cpu3, mem3);
    }
}
