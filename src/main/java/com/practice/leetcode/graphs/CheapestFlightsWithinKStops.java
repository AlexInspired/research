package com.practice.leetcode.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/cheapest-flights-within-k-stops/discuss/2730765/Clean-Java-Code%3A-Modified-Dijkstra-with-explanation-(With-explanation-for-TLE)
public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<Route>> graph = new HashMap<Integer, List<Route>>();

        for (int[] flight : flights) {
            List<Route> routes = graph.getOrDefault(flight[0], new ArrayList<Route>());
            routes.add(new Route(flight[1], flight[2], 0));
            graph.put(flight[0], routes);
        }

        Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
        PriorityQueue<Route> pq = new PriorityQueue<Route>();
        pq.offer(new Route(src, 0, 0));

        while(!pq.isEmpty()) {
            Route current = pq.poll();
            if (current.getId() == dst) return current.getCost();

            // If we have already taken k+1 flights then we have made k stops already and so we can't continue this route anymore
            if (current.getFlights() >= k+1) continue;

            /** Premise: A route will have mutiple paths through it.
             Greedily exploring the least expensive path through a route may not satisfy the constraint of limited stops. So we
             need to tweak the algorithm a bit. We want to explore previously visited routes  again but only if the number of
             stops is less than previous. This because otherwise the path won't provide any advantage. We're chosing the path
             just because the first path may potentially exceed stop limit. And please note that this does NOT exclude the primary
             greedy selection.
             **/
            if (visited.getOrDefault(current.getId(), Integer.MAX_VALUE) <= current.getFlights()) continue;

            visited.put(current.getId(), current.getFlights());

            for (Route next : graph.getOrDefault(current.getId(), new ArrayList<Route>())) {
                int newCost = current.getCost() + next.getCost();
                Route nxt = new Route(next.getId(), newCost, current.getFlights()+1);
                pq.offer(nxt);
            }
        }
        return -1;
    }
    class Route implements Comparable<Route>{
        private final int id;
        private final int flights;
        private final int cost;

        public Route(int id, int cost, int flights) {
            this.id = id;
            this.cost = cost;
            this.flights = flights; // k stops = k+1 flights. This results in slightly simpler code
        }

        public int getId(){
            return id;
        }

        public int getFlights(){
            return flights;
        }

        public int getCost(){
            return cost;
        }

        @Override
        public int compareTo(Route route){
            return this.cost == route.cost ? this.id - route.id : this.cost - route.cost;
        }

        public void print(String message){
            System.out.println(String.format("%s, id: %d, flights: %d, cost: %d", message, this.id, this.flights, this.cost));
        }
    }

}
