# Optimization Problem

- Optimization solution, is a solution that solve a problem with the best solution possible.
- We've one problem (p), and few solutions to this problem (s1, s2, s3, ..., sK).
- But we also have some constraint and objective.

- Let's say that I want to buy a new phone.
  - I only can pay 3k -> Constraint
  - I want the phone with the maximum storage -> Objective

- I have 3 phones with different prices and storage. I'll pick just the one that have the maximum storage and cost less
than 3K.

- How do we solve these problems?
  1. Greedy Method
  2. Dynamic Programming
  3. Branch & Bound

So, a optimization problem always have, 1. Constraint (feasible) and 2. Objective (Min or Max)

### GREEDY METHOD

- Greedy Method help us find the optimal solution, we should do some steps to archive our answer,
first we need to verify the *Constraint* and see if it's **feasible**, and find the objective of the
problem (if it's to min or max value) and to do that, we need to find the **selection procedure**,
which means to find the input that is feasible to the problem.

- Workflow will be something like this:
    1. See what is the objective (min or max)
    2. Find the input with selection procedure that's agreed with the objective 
    3. Verify if the input find in the selection procedure is **feasible** (constraint)

Therefore, with greedy method you should decide what is your **procedure**.

We've two types os solutions to greedy method
1. Subset paradigm -> Is when we receive an array and return just a subset of the array.
2. Ordering paradigm -> Is when we receive an array and return the array with all values different.


### KNASPACK PROBLEM
