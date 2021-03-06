# Dynamic Programming
### What is DP?
"It's a way of computing recursive algorithm with highly overlapping sub-problems by solving each sub-problem just once." In short an optimization technique for computer programs.

So we can say -
Break the bigger problem in sub-problems and then solve sub-problems first so that they are ready when it's needed to made up the bigger problem.

We need to make sure that it follows DAG (Directed Acyclic Graph) properties:
* Graph = Vertices + Edges
* Edges have directions
* Acyclic means can't come back to the same vertex from where it started. In short don't fall in a loop.

Here we will solve few dynamic programming related problems.

## we will use two main techniques here for dynamic programming
1. Memoization (Top down)
2. Tabulation (Bottom up)

#### Memoization:
* A way of speeding up the computations by caching results of repeated calculations.
* There is a trade-off of space over speed. This takes space to cache the intermediate results but improves the performance.

