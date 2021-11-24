create table normaliz
                (petid numeric,
                 Pettype int,
                 petname varchar(10));
create table petowener
               (pid numeric,
			   vdate date,
               powner varchar(10));
create table Process
				(petid numeric,
				visit date,
			    proced  varchar(10));
insert into normaliz(petid,pettype,petname)
values(404,4,'jet');
insert into normaliz(petid,pettype,petname)
values(403,5,'fix');
insert into petowener(pid,vdate,powner)
values(504,'12-11-2020','jesef');
insert into petprocess(petid,vdate,proced)
values(604,'03-01-2021','car');
select * from normaliz;
select * from petprocess;
select * from petowener;
update normaliz set petname = 'pappy' where petid = 404;
update petprocess set vdate='09-09-1999'where petid =604;
update petowener set vdate='09-09-1999'where pid =504;
alter table normaliz add pet_no  numeric;
update normaliz set pet_no = 20 where petid = 404;
select *from jobhist;
select*from emp;
select ename,empno from emp union select dname,deptno from dept;

select sal,job,comm from emp union select sal,job,comm  from jobhist ;

select e.ename,j.enddate as resignation_date from emp e,jobhist j
where e.job = 'null' or 0<e.comm order by resignation_date;

select JOB from emp INTERSECT select job from jobhist WHERE JOB = 'SALESMAN';

select e.empno,e.ename,j.startdate,j.enddate
from emp e
full outer join
jobhist j
on(e.empno=j.empno)
where j.enddate is not null and e.empno in(select empno
                                     from emp
									 union
									 select empno
									 from jobhist)
									 order by j.startdate
create view empvu10
as select empno,ename from emp where deptno = 10; select *from empvu10

create view salvu20
as select empno id_number,ename empname,
sal*12 ann_salary from emp where deptno = 20; select * from salvu20
--modify a view
create view dept_sum_vu
(deptname,minsal,maxsal,avgsal)
as select d.dname,min(e.sal), max(e.sal),avg(e.sal) from emp e,dept d
where e.deptno = d.deptno group by d.dname;