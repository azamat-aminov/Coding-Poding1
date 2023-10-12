# Write your MySQL query statement below

# select name, salary from Employee where managerId is not null order by salary desc;

# select salary from Employee order by salary desc limit 1; max salary

select e.name as Employee from Employee as e join Employee m on e.managerId = m.id where e.salary > m.salary;
