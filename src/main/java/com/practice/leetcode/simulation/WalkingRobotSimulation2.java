package com.practice.leetcode.simulation;

public class WalkingRobotSimulation2 {

    class Robot {

        int W, H;
        int dir;//0N 1S 2E 3W
        node[] a;
        int P;// Perimeter
        int pos; //curr pos of robo
        boolean init = false; // for handling edge case

        public Robot(int width, int height) {
            P = 2 * (width + height) - 4;
            this.pos = 0;
            this.dir = 1;
            this.W = width;
            this.H = height;
            a = new node[P];
            int x = 0, y = 0;
            for (int i = 0; i < a.length; i++) { // traverse the array and store boundary points in it
                a[i] = new node(x, y, dir);
                if (x == 0 && y == 0) dir = 2;
                else if (x == W - 1 && y == 0) dir = 0;
                else if (x == W - 1 && y == H - 1) dir = 3;
                else if (x == 0 && y == H - 1) dir = 1;

                if (dir == 0) y++;
                else if (dir == 1) y--;
                else if (dir == 2) x++;
                else x--;
            }
        }

        public void step(int num) {
            pos = (pos + (num % P)) % P;
            init = true;
        }

        public int[] getPos() {
            return new int[]{a[pos].x, a[pos].y};
        }

        public String getDir() {
            if (!init) return "East";//for edge case

            if (a[pos].dir == 0) return "North";
            else if (a[pos].dir == 1) return "South";
            else if (a[pos].dir == 2) return "East";
            return "West";
        }

        class node {
            int x, y, dir;

            node(int x, int y, int dir) {
                this.x = x;
                this.y = y;
                this.dir = dir;
            }
        }
    }
}

